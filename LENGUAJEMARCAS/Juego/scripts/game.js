var Inicio = new Phaser.Class({
  Extends: Phaser.Scene,
  initialize: function Inicio() {
    Phaser.Scene.call(this, { key: "Inicio" });
  },
  preload() {
    // Cargar imágenes y fuentes
    this.load.image("titulo", "img/png/titulo.png");
    this.load.image("botonhierba", "img/jpg/botones-piedras-hierba.jpg");
    this.load.image("botondifficultad", "img/jpg/botones-madera.jpg");
    this.load.image("fondo", "img/jpg/cielo.jpg");
    this.load.spritesheet("pajaro", "img/entidades/pajaro.png", {
      frameWidth: 34,
      frameHeight: 24,
    });
    this.load.font("TradeWinds", "fonts/TradeWinds-Regular.ttf");
  },
  create() {
    // Añadir la imagen de fondo
    var fondo = this.add.image(0, 0, "fondo").setOrigin(0, 0);
    fondo.displayWidth = this.sys.game.config.width;
    fondo.displayHeight = this.sys.game.config.height;

    // Crear y configurar el título
    var titulo = this.add
      .image(game.config.width / 2, game.config.height / 5, "titulo")
      .setOrigin(0.5)
      .setScale(0.5);
    titulo.alpha = 0;
    titulo.setDepth(1); // Establecer la profundidad del título

    // Animar la aparición del título
    this.time.delayedCall(1000, () => {
      this.tweens.add({
        targets: titulo,
        alpha: 1,
        duration: 2000,
        ease: "Power2",
      });
    });

    // Crear botón Jugar
    var botonPlay = this.add
      .image(game.config.width / 2, game.config.height / 2.2, "botonhierba")
      .setOrigin(0.5)
      .setDisplaySize(400, 70)
      .setInteractive();

    // Añadir borde al botón
    var borde = this.add.graphics();
    borde.lineStyle(5, 0x003300); // Color verde muy oscuro
    borde.strokeRoundedRect(
      botonPlay.x - botonPlay.displayWidth / 2,
      botonPlay.y - botonPlay.displayHeight / 2,
      botonPlay.displayWidth,
      botonPlay.displayHeight,
      5 // Radio de las esquinas
    );

    // Guardar las posiciones y dimensiones originales del borde
    var bordeOriginal = {
      x: botonPlay.x - botonPlay.displayWidth / 2,
      y: botonPlay.y - botonPlay.displayHeight / 2,
      width: botonPlay.displayWidth,
      height: botonPlay.displayHeight,
    };

    // Añadir texto al botón
    var textoBoton = this.add
      .text(game.config.width / 2, game.config.height / 2.2, "INICIAR", {
        fontSize: "32px",
        fill: "#000000",
        fontFamily: "TradeWinds",
      })
      .setOrigin(0.5);

    // Colores para la animación del texto y el borde
    var coloresTexto = [
      Phaser.Display.Color.HexStringToColor("#003300"),
      Phaser.Display.Color.HexStringToColor("#006900"),
    ];
    var coloresBorde = [
      Phaser.Display.Color.HexStringToColor("#003300"), // Verde muy oscuro
      Phaser.Display.Color.HexStringToColor("#006900"),
    ];
    var indiceColor = 0;

    // Animación al pasar el ratón sobre el botón
    botonPlay.on("pointerover", () => {
      this.bordeTween = this.tweens.addCounter({
        from: 0,
        to: 1,
        duration: 1000,
        ease: "Power2",
        repeat: -1, // Repetir indefinidamente
        yoyo: true, // Hacer la animación de ida y vuelta
        onUpdate: (tween) => {
          const value = tween.getValue();
          borde.clear();
          const colorInicioBorde = coloresBorde[indiceColor];
          const colorFinBorde =
            coloresBorde[(indiceColor + 1) % coloresBorde.length];
          const interpolatedColorBorde =
            Phaser.Display.Color.Interpolate.ColorWithColor(
              colorInicioBorde,
              colorFinBorde,
              1,
              value
            );
          const colorHexBorde = Phaser.Display.Color.RGBToString(
            interpolatedColorBorde.r,
            interpolatedColorBorde.g,
            interpolatedColorBorde.b,
            0,
            "#"
          );
          borde.lineStyle(
            5,
            Phaser.Display.Color.HexStringToColor(colorHexBorde).color
          );
          borde.strokeRoundedRect(
            bordeOriginal.x - 5 * value - 5, // Ajustar para dejar menos espacio
            bordeOriginal.y - 5 * value - 5, // Ajustar para dejar menos espacio
            bordeOriginal.width + 10 * value + 10, // Ajustar para dejar menos espacio
            bordeOriginal.height + 10 * value + 10, // Ajustar para dejar menos espacio
            7 // Aumentar el radio de las esquinas
          );
        },
      });

      // Cambiar el color del texto suavemente
      this.textoTween = this.tweens.addCounter({
        from: 0,
        to: 1,
        duration: 2000, // Duración de la interpolación aumentada
        ease: "Linear",
        repeat: -1,
        yoyo: true,
        onUpdate: (tween) => {
          const value = tween.getValue();
          const colorInicio = coloresTexto[indiceColor];
          const colorFin =
            coloresTexto[(indiceColor + 1) % coloresTexto.length];
          const interpolatedColor =
            Phaser.Display.Color.Interpolate.ColorWithColor(
              colorInicio,
              colorFin,
              1,
              value
            );
          const colorHex = Phaser.Display.Color.RGBToString(
            interpolatedColor.r,
            interpolatedColor.g,
            interpolatedColor.b,
            0,
            "#"
          );
          textoBoton.setFill(colorHex);
        },
        onComplete: () => {
          indiceColor = (indiceColor + 1) % coloresTexto.length;
        },
      });
    });

    // Animación al quitar el ratón del botón
    botonPlay.on("pointerout", () => {
      if (this.bordeTween) {
        this.bordeTween.stop();
      }
      this.tweens.addCounter({
        from: 1,
        to: 0,
        duration: 200,
        ease: "Power2",
        onUpdate: (tween) => {
          const value = tween.getValue();
          borde.clear();
          borde.lineStyle(5, 0x003300); // Volver al color verde muy oscuro
          borde.strokeRoundedRect(
            bordeOriginal.x - 5 * value,
            bordeOriginal.y - 5 * value,
            bordeOriginal.width + 10 * value,
            bordeOriginal.height + 10 * value,
            5 // Volver al radio original de las esquinas
          );
        },
      });

      // Detener la animación del color del texto
      if (this.textoTween) {
        this.textoTween.stop();
        textoBoton.setFill("#000000"); // Volver al color original
      }
    });

    // Añadir evento de clic para cambiar a la escena JuegoMain
    botonPlay.on("pointerup", () => {
      this.scene.start("JuegoMain");
    });

    // Crear una máscara con bordes redondeados para el botón
    var maskShape = this.make.graphics();
    maskShape.fillStyle(0xffffff);
    maskShape.fillRoundedRect(
      botonPlay.x - botonPlay.displayWidth / 2,
      botonPlay.y - botonPlay.displayHeight / 2,
      botonPlay.displayWidth,
      botonPlay.displayHeight,
      5 // Radio de las esquinas
    );

    var mask = maskShape.createGeometryMask();
    botonPlay.setMask(mask);

    // Centrar el texto dentro del botón
    textoBoton.setPosition(botonPlay.x, botonPlay.y);

    // Crear botón de dificultad
    var botonDificultad = this.add
      .image(
        game.config.width / 2,
        game.config.height / 1.8,
        "botondifficultad"
      )
      .setOrigin(0.5)
      .setDisplaySize(300, 50) // Tamaño ajustado
      .setInteractive();

    // Añadir borde al botón de dificultad
    var bordeDificultad = this.add.graphics();
    bordeDificultad.lineStyle(3.5, 0x3f1a00); // Color marrón claro estilo madera
    bordeDificultad.strokeRoundedRect(
      botonDificultad.x - botonDificultad.displayWidth / 2,
      botonDificultad.y - botonDificultad.displayHeight / 2,
      botonDificultad.displayWidth,
      botonDificultad.displayHeight,
      5 // Radio de las esquinas ajustado a 5
    );

    // Añadir texto al botón de dificultad
    var textoBotonDificultad = this.add
      .text(game.config.width / 2, game.config.height / 1.8, "DIFICULTAD", {
        fontSize: "28px", // Tamaño de fuente ajustado
        fill: "#000000", // Color negro
        fontFamily: "TradeWinds",
      })
      .setOrigin(0.5);

    // Animación al pasar el ratón sobre el botón de dificultad
    botonDificultad.on("pointerover", () => {
      this.bordeTweenDificultad = this.tweens.addCounter({
        from: 0,
        to: 1,
        duration: 1000,
        ease: "Power2",
        repeat: -1,
        yoyo: true,
        onUpdate: (tween) => {
          const value = tween.getValue();
          bordeDificultad.clear();
          bordeDificultad.lineStyle(3.5, 0x3f1a00); // Color marrón más claro
          bordeDificultad.strokeRoundedRect(
            botonDificultad.x - botonDificultad.displayWidth / 2 - 3 * value,
            botonDificultad.y - botonDificultad.displayHeight / 2 - 3 * value,
            botonDificultad.displayWidth + 6 * value,
            botonDificultad.displayHeight + 6 * value,
            5 // Radio de las esquinas ajustado a 5
          );
        },
      });

      this.textoTweenDificultad = this.tweens.addCounter({
        from: 0,
        to: 1,
        duration: 2000,
        ease: "Linear",
        repeat: -1,
        yoyo: true,
        onUpdate: (tween) => {
          const value = tween.getValue();
          const colorInicio = Phaser.Display.Color.HexStringToColor("#000000");
          const colorFin = Phaser.Display.Color.HexStringToColor("#3f1a00");
          const interpolatedColor =
            Phaser.Display.Color.Interpolate.ColorWithColor(
              colorInicio,
              colorFin,
              1,
              value
            );
          const colorHex = Phaser.Display.Color.RGBToString(
            interpolatedColor.r,
            interpolatedColor.g,
            interpolatedColor.b,
            0,
            "#"
          );
          textoBotonDificultad.setFill(colorHex);
        },
      });
    });

    // Animación al quitar el ratón del botón de dificultad
    botonDificultad.on("pointerout", () => {
      if (this.bordeTweenDificultad) {
        this.bordeTweenDificultad.stop();
      }
      this.tweens.addCounter({
        from: 1,
        to: 0,
        duration: 200,
        ease: "Power2",
        onUpdate: (tween) => {
          const value = tween.getValue();
          bordeDificultad.clear();
          bordeDificultad.lineStyle(3.5, 0x3f1a00); // Volver al color marrón claro estilo madera
          bordeDificultad.strokeRoundedRect(
            botonDificultad.x - botonDificultad.displayWidth / 2 - 3 * value,
            botonDificultad.y - botonDificultad.displayHeight / 2 - 3 * value,
            botonDificultad.displayWidth + 6 * value,
            botonDificultad.displayHeight + 6 * value,
            5 // Radio de las esquinas ajustado a 5
          );
        },
      });

      if (this.textoTweenDificultad) {
        this.textoTweenDificultad.stop();
        textoBotonDificultad.setFill("#000000"); // Volver al color negro
      }
    });

    // Añadir evento de clic para cambiar a la escena Dificultad
    botonDificultad.on("pointerup", () => {
      this.scene.start("Dificultad");
    });

    // Centrar el texto dentro del botón de dificultad
    textoBotonDificultad.setPosition(botonDificultad.x, botonDificultad.y);

    // Añadir el sprite del pájaro
    this.pajaro = this.physics.add.sprite(100, 100, "pajaro").setScale(2);
    this.pajaro.body.allowGravity = false;

    // Configurar la animación del pájaro
    this.anims.create({
      key: "volar",
      frames: this.anims.generateFrameNumbers("pajaro", { start: 0, end: 3 }),
      frameRate: 10,
      repeat: -1,
    });

    // Iniciar la animación del pájaro
    this.pajaro.play("volar");

    // Configurar la física del pájaro
    this.pajaro.setCollideWorldBounds(true);
    this.pajaro.setBounce(0.2);

    // Establecer la velocidad inicial del pájaro
    this.pajaro.setVelocityX(400); // Aumentar la velocidad horizontal

    // Configurar el movimiento vertical aleatorio del pájaro
    this.time.addEvent({
      delay: Phaser.Math.Between(1000, 3000), // Intervalo aleatorio entre 1 y 3 segundos
      callback: this.cambiarDireccionVertical,
      callbackScope: this,
      loop: true,
    });
  },
  cambiarDireccionVertical() {
    var velocidadY = Phaser.Math.Between(-100, 100); // Velocidad aleatoria hacia arriba o abajo
    this.pajaro.setVelocityY(velocidadY);
  },
  update() {
    // Movimiento automático del pájaro hacia los lados
    if (
      this.pajaro.x >=
      this.sys.game.config.width - this.pajaro.displayWidth / 2
    ) {
      this.pajaro.setVelocityX(-400); // Cambiar dirección a la izquierda con mayor velocidad
    } else if (this.pajaro.x <= this.pajaro.displayWidth / 2) {
      this.pajaro.setVelocityX(400); // Cambiar dirección a la derecha con mayor velocidad
    }
    
    // Limitar la posición vertical del pájaro para que no baje de la mitad de la pantalla
    if (this.pajaro.y > this.sys.game.config.height / 2) {
      this.pajaro.y = this.sys.game.config.height / 2;
      this.pajaro.setVelocityY(Phaser.Math.Between(-100, 0)); // Cambiar dirección hacia arriba
    }
  },
});

// En esta parte el usuario configurará la dificultad del juego
var Dificultad = new Phaser.Class({
  Extends: Phaser.Scene,
  initialize: function Dificultad() {
    Phaser.Scene.call(this, { key: "Dificultad" });
  },
  preload() {},
  create() {},
});

// Esta es la parte del juego pricipal
var JuegoMain = new Phaser.Class({
  Extends: Phaser.Scene,
  initialize: function JuegoMain() {
    Phaser.Scene.call(this, { key: "JuegoMain" });
  },
  preload() {},
  create() {},
});

// configuración de las físicas del juego y demás configuraciones
var config = {
  type: Phaser.AUTO,
  width: window.innerWidth,
  height: window.innerHeight,
  parent: "phaser-example",
  scene: [Inicio, JuegoMain],
  physics: {
    default: "arcade",
    arcade: {
      gravity: { y: 400 },
      debug: false,
    },
  },
};

// Añadir la nueva escena al array de escenas en la configuración del juego
config.scene.push(Dificultad);

var game = new Phaser.Game(config);

// Ajustar el tamaño del juego cuando se redimensiona la ventana
window.addEventListener("resize", () => {
  game.scale.resize(window.innerWidth, window.innerHeight);
});
