# Constante_magica
https://www.aceptaelreto.com/problem/statement.php?id=120&cat=4

 Una matriz de N×N números se considera cuadrado mágico si la suma de cada una de sus filas, cada una de sus columnas y sus diagonales principal y secundaria tienen el mismo valor (la llamada constante mágica).

Aunque la generación de cuadrados mágicos no siempre es fácil, cuando tienen tamaño impar existen varios métodos sencillos de generarlos. Uno muy conocido es el llamado método siamés, que debemos a Simon de La Loubère quién lo publicó en 1693. Según este método se empieza con un entero cualquiera (el 1 por ejemplo) que se coloca en el cuadrado central de la fila superior. Después se van rellenando los cuadrados en diagonal (hacia arriba y la derecha) con números consecutivos al inicial, teniendo en cuenta que:

    Si al avanzar "salimos fuera" del cuadrado por la parte superior en la columna i, se entra por la parte inferior en la columna i+1.
    Si al avanzar "salimos fuera" del cuadrado por la derecha en la fila j, se entra por la izquierda en la fila j-1.
    Si la siguiente posición está ocupada, colocamos el número justo debajo de la posición donde colocamos el último número. Si estamos en la última fila, volvemos a la primera.


 Este cuadrado mágico, una vez completo, tendrá 65 como constante mágica.
Entrada

La entrada estará compuesta de distintos casos de prueba. Cada caso de prueba consiste en una línea con dos números: n y k. El primero de ellos, n, indica el tamaño de cada lado del cuadrado y será siempre un número impar mayor o igual que 1 y menor que 100. El segundo, k, indica el número que aparecerá en el centro de la fila superior y será siempre mayor o igual que 0 y menor que 1000.

Los casos de entrada finalizan con el caso especial "0 0", que no debe generar salida.
Salida

Para cada caso de prueba, se mostrará la constante mágica del cuadrado resultante.<br/>

Entrada de ejemplo <br/>
5 1 <br/>
3 0 <br/>
3 4 <br/>
0 0 <br/>

Salida de ejemplo <br/>
65 <br/>
12 <br/>
24 

