function meterDatos(array) {
  let suma = 0;
  for (let i = 0; i < array.length; i++) {
    array[i] = parseFloat(prompt(`Introduce un número para la posición ${i}:`));
  }
}

function sumarCasillaImpar(arr) {
  let suma = 0;
  for (let i = 1; i < arr.length; i += 2) {
    suma += arr[i];
  }
  return suma;
}

function llamarArray() {
  let array = new Array(10);
  meterDatos(array);
  let sumaImpares = sumarCasillaImpar(array);
  console.log("Array ingresado:", array);
  console.log("Suma de las casillas impares:", sumaImpares);
  alert(`Suma de las casillas impares: ${sumaImpares}`);
}
