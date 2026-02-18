# Reto cuál resolver

Dado el código a continuación, que puede contener errores funcionales además de malas prácticas, el objetivo es obtener una versión correcta y limpia del mismo.

## Códigos
Examen de minas
Buscaminas

# Opciones de trabajo

Puede abordar este reto de dos formas:

Refactorización incremental: Modificar el código existente mediante baby steps, aplicando una corrección por commit.
Reescritura desde cero: Partir de la funcionalidad deseada y escribir un nuevo código limpio, documentando cada decisión de diseño.

# Enunciado original

Desarrolle la siguiente versión del juego de buscaminas:

Cree un tablero de 5 filas x 7 columnas y asigne cinco minas (de modo aleatorio) sobre su superficie.

El jugador indica las posiciones X e Y y el programa determina si hay una mina en esa casilla.

Si no hay mina, el tablero muestra un punto.
En caso de haber una mina, se muestra un asterisco y se suma una explosión.
El juego finaliza al liberar todas las casillas (en cuyo caso gana) o bien cuando al jugador le explotan tres minas (donde lógicamente pierde).

```
================
  1 2 3 4 5 6 7
1 - - - - - - - 
2 - - - - - - -
3 - - - - - - -
4 - - - - - - -
5 - - - - - - -
================
Ingrese X
2
Ingrese Y
2
----------------
Libre!
================
  1 2 3 4 5 6 7
1 - - - - - - - 
2 - . - - - - -
3 - - - - - - -
4 - - - - - - -
5 - - - - - - -
================
Ingrese X
1
Ingrese Y
5
----------------
Mina!
================
  1 2 3 4 5 6 7
1 - - - - * - - 
2 - . - - - - -
3 - - - - - - -
4 - - - - - - -
5 - - - - - - -
================
Ingrese X
```

# Pasos tomados para la solución

1. Pegar el codigo inicial y buscar las malas pra´ticas cometidas.