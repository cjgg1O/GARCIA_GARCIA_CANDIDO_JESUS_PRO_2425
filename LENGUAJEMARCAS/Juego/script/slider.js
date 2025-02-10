let currentPosition = 0;
const maxPosition = 0;
const minPosition = -1918 * 4; // Ajusta este valor según la cantidad de elementos en el slider

function moveLeft() {
  if (currentPosition + 1918 <= maxPosition) {
    currentPosition += 1918;
    updateSliderPosition();
  }
}

function moveRight() {
  if (currentPosition - 1918 >= minPosition) {
    currentPosition -= 1918;
    updateSliderPosition();
  }
}

function updateSliderPosition() {
  document.getElementById("wrapper-holder").style.transform = `translateX(${currentPosition}px)`;
}

document.getElementById("boton-izquierda").addEventListener("click", moveLeft);
document.getElementById("boton-derecha").addEventListener("click", moveRight);