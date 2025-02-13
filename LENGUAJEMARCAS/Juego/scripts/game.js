var Inicio = new Phaser.Class({
  Extends: Phaser.Scene,
  initialize: function Inicio() {
    Phaser.Scene.call(this, { key: "Inicio" });
  },
  preload() {
    this.load.image("titulo", "img/png/titulo.png");
    this.load.image("botonplay", "img/jpg/piedras-hierba.jpg");
    this.load.script(
      "webfont",
      "https://ajax.googleapis.com/ajax/libs/webfont/1.6.26/webfont.js"
    );
  },
  create() {
    var titulo = this.add
      .image(game.config.width / 2, game.config.height / 5, "titulo")
      .setOrigin(0.5)
      .setScale(0.5);

    titulo.alpha = 0;

    this.time.delayedCall(1000, () => {
      this.tweens.add({
        targets: titulo,
        alpha: 1,
        duration: 2000,
        ease: "Power2",
      });
    });

    // Crear botón

    var botonPlay = this.add
      .image(game.config.width / 2, game.config.height / 2, "botonplay")
      .setOrigin(0.5)
      .setDisplaySize(400, 70)
      .setInteractive();

    var textoBoton = this.add
      .text(game.config.width / 2, game.config.height / 2, "INICIAR", {
        fontSize: "32px",
        fill: "#fff",
      })
      .setOrigin(0.5);

    botonPlay.on("pointerdown", () => {
      this.scene.start("JuegoMain");
    });

    // Aplicar borde redondeado
    botonPlay.setCrop(0, 0, 400, 70);
  },
});

var JuegoMain = new Phaser.Class({
  Extends: Phaser.Scene,
  initialize: function JuegoMain() {
    Phaser.Scene.call(this, { key: "JuegoMain" });
  },
  preload() {},
  create() {},
});

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

var game = new Phaser.Game(config);

window.addEventListener("resize", () => {
  game.scale.resize(window.innerWidth, window.innerHeight);
});
