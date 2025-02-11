export class Game extends Phaser.Scene {
  constructor() {
    super({ key: "game" });
  }
  preload() {
    this.load.image("background", "img/jpg/fondo-main.jpg");
    this.load.image("gameover", "img/png/game-over.png");
  }
  create() {
    this.add.image(400, 250, "background");
    this.gameoverImage = this.add.image(400, 250, "gameover");
    this.gameoverImage.setScale(0.5);
    this.gameoverImage.visible = false;
  }
}
