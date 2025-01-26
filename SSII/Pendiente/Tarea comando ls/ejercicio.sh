#!/bin/bash
if [ -d  /$HOME/Escritorio ]
then
mkdir /$HOME/Escritorio/ejercicio
echo "Voy a copiar los  ficheros"
touch /$HOME/Escritorio/ejercicio/aaaaa
touch /$HOME/Escritorio/ejercicio/bbbbb
touch /$HOME/Escritorio/ejercicio/ccccc
touch /$HOME/Escritorio/ejercicio/.oculto1
touch /$HOME/Escritorio/ejercicio/.oculto2
touch /$HOME/Escritorio/ejercicio/abcdef
touch /$HOME/Escritorio/ejercicio/bcdef
touch /$HOME/Escritorio/ejercicio/Brayan
touch /$HOME/Escritorio/ejercicio/Ana
touch /$HOME/Escritorio/ejercicio/brayan
touch /$HOME/Escritorio/ejercicio/nacho
touch /$HOME/Escritorio/ejercicio/dani1
touch /$HOME/Escritorio/ejercicio/dani2
touch /$HOME/Escritorio/ejercicio/david
touch /$HOME/Escritorio/ejercicio/angel
touch /$HOME/Escritorio/ejercicio/alberto
touch /$HOME/Escritorio/ejercicio/mario
touch /$HOME/Escritorio/ejercicio/ignacio
touch /$HOME/Escritorio/ejercicio/marcos
touch /$HOME/Escritorio/ejercicio/jaime
touch /$HOME/Escritorio/ejercicio/todos
touch /$HOME/Escritorio/ejercicio/ninguno
cd /$HOME/Escritorio/ejercicio
chmod 777 aaaaa
chmod 444 bbbbb
chmod 222 ccccc
echo "letras a" > aaaaa
echo "letras c" > ccccc
echo secreto1 > .oculto1
echo secreto2 > .oculto2
else "Error al copiar ficheros"
fi
