function tablas() {
  document.write(
    "<table border='1' style='border-spacing: 10px; margin: auto;'>"
  );
  for (let i = 0; i < 1; i++) {
    document.write("<tr>");
    for (let j = 0; j < 1; j++) {
      document.write(
        "<td style='padding-left: 10px; padding-right: 10px;' onclick='generarCeldasAleatorias(this)'>VIRUS</td>"
      );
    }
    document.write("</tr>");
  }
  document.write("</table><br>");
}

function generarCeldasAleatorias(td) {
  const cantidad = prompt("¿Cuántas copias quieres generar?");
  const numCopias = parseInt(cantidad, 10);

  if (isNaN(numCopias) || numCopias <= 0) {
    alert("Por favor, ingresa un número válido.");
    return;
  }

  for (let i = 0; i < numCopias; i++) {
    setTimeout(() => {
      const newTd = document.createElement("div");
      newTd.textContent = td.textContent;
      newTd.style.position = "absolute";
      newTd.style.border = "1px solid";
      newTd.style.padding = "10px";
      newTd.style.left = Math.random() * window.innerWidth + "px";
      newTd.style.top = Math.random() * window.innerHeight + "px";
      newTd.style.backgroundColor = getRandomColor();
      newTd.onclick = function () {
        generarCeldasAleatorias(newTd);
      };
      document.body.appendChild(newTd);
    }, i * 5); // 10 ms delay for each cell
  }
}

function getRandomColor() {
  const letters = "0123456789ABCDEF";
  let color = "#";
  for (let i = 0; i < 6; i++) {
    color += letters[Math.floor(Math.random() * 16)];
  }
  return color;
}

document.addEventListener("DOMContentLoaded", function () {
  tablas();
});
