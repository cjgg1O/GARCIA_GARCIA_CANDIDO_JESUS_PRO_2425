###### IES ALBARREGAS - PROGRAMACIÓN 1ºDAM A
# Manual de Usuario y Programador - Programa de Cajero Automático.

## Índice

1. [Introducción](#introducción)
2. [Manual de Usuario](#manual-de-usuario)
3. [Manual de Programador](#manual-de-programador)
   - [Estructura del Código](#estructura-del-código)
   - [Configuraciones Personalizables](#configuraciones-personalizables)

---

## Introducción

Este programa es una simulación de un cajero automático en Java. Permite al usuario realizar operaciones comunes como consultar el saldo, ingresar dinero, retirar dinero, y salir. Al finalizar la sesión, se muestran todos los movimientos realizados.

---

## Manual de Usuario

### Cómo Funciona el Programa

1. **Inicio del Programa**: Al ejecutar el programa, se mostrará un mensaje de bienvenida y un menú con varias opciones en la consola.

2. **Opciones del Menú**:
   - **Consultar Saldo**: Esta opción permite ver cuánto dinero tienes en tu cuenta.
   - **Depositar Dinero**: Puedes añadir dinero a tu saldo. El programa te pedirá que ingreses la cantidad que deseas depositar.
   - **Retirar Dinero**: Si necesitas dinero, selecciona esta opción. El programa te preguntará cuánto deseas retirar y comprobará si tienes suficiente saldo.
   - **Salir**: Al elegir esta opción, finalizarás la sesión y se mostrará un resumen de las transacciones realizadas.

3. **Interacción**:
   - Para seleccionar una opción, simplemente ingresa el número correspondiente y presiona "Enter".
   - Si intentas depositar o retirar una cantidad incorrecta (como un número negativo o una cantidad mayor que tu saldo), el programa te dará un mensaje de error y te permitirá intentar de nuevo.

4. **Resumen Final**: Cuando decidas salir del programa, se mostrará un resumen de todas las transacciones que realizaste, incluyendo cuántas veces depositaste y retiraste dinero, así como el saldo final en tu cuenta.

---

## Manual de Programador

### Estructura del Código

El programa consta de una sola clase `App` con los siguientes elementos principales:

- **Variables**:
  - `saldo`: almacena el saldo actual de la cuenta.
  - `ingresos` y `retiradas`: cuentan las transacciones de ingreso y retiro respectivamente.
  - `totaling` y `totalretir`: acumulan el total de dinero ingresado y retirado respectivamente.

- **Métodos**:
  - `cajero()`: Método principal que contiene el flujo del cajero automático.
  - `main()`: Método principal que inicia el programa llamando al método `cajero()`.

### Configuraciones Personalizables

El programa se puede modificar para adaptarse a diferentes necesidades. Aquí hay algunas configuraciones que un programador podría cambiar:

1. **Mensajes y Presentación**:
   - Todos los mensajes que se muestran al usuario están dentro de `System.out.println()`. Puedes personalizar estos mensajes para que sean más informativos o adaptados a un tema específico.

2. **Códigos de Limpieza de Pantalla**:
   - El código que se usa para limpiar la consola es `System.out.print("\033[H\033[2J");`. Este puede variar dependiendo del sistema operativo, por lo que puede ser necesario ajustarlo.

3. **Lógica de Transacciones**:
   - Las condiciones que determinan si una transacción es válida (como la verificación de saldo suficiente) están codificadas en el método `cajero()`. Puedes ajustar estas condiciones según las políticas deseadas (por ejemplo, permitir sobregiros o establecer límites en las transacciones).

4. **Nuevas Funcionalidades**:
   - Se pueden agregar nuevas funciones, como transferencias entre cuentas o un sistema de autenticación para el acceso al cajero.

5. **Persistencia de Datos**:
   - Actualmente, el saldo y las transacciones se reinician cada vez que se ejecuta el programa. Puedes implementar un sistema de almacenamiento (como un archivo o una base de datos) para guardar estos datos entre ejecuciones.

---

Este documento proporciona una guía básica de uso para principiantes y detalla las áreas que un programador puede modificar para personalizar el funcionamiento del programa.
