import java.util.HashSet;
import java.util.Set;

public class DailyChallenge09_08_2025 {
    public boolean isPowerOfTwo(int n) {
        // Paso 1: Manejar los casos especiales (n <= 0)
        // Las potencias de dos son siempre números enteros positivos.
        if (n <= 0) {
            return false;
        }

        // Paso 2: Usar la propiedad de las potencias de dos en binario.
        // Un número que es potencia de dos tiene solo un bit '1' en su representación binaria.
        // n:        ...01000...
        // n-1:      ...00111...
        // n & (n-1): ...00000...
        // La operación n & (n-1) será 0 si y solo si n es una potencia de 2.
        return (n & (n - 1)) == 0;
    }
}

/*Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.



Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false


Constraints:

-231 <= n <= 231 - 1

¿Qué hace (n & (n - 1)) en concreto?
Esta expresión es un truco muy ingenioso y eficiente para determinar si un número es una potencia de dos. Se basa en una propiedad clave de la representación binaria de las potencias de dos.

Propiedad clave:
Una potencia de dos (2, 4, 8, 16, etc.) tiene solo un bit encendido (1) en su representación binaria. Los demás bits son 0.

1 = 0001

2 = 0010

4 = 0100

8 = 1000

16 = 10000

Cuando le restas 1 a una potencia de dos, el único bit 1 se apaga, y todos los bits a su derecha se encienden (1).

8 (1000) - 1 = 7 (0111)

16 (10000) - 1 = 15 (01111)

¿Cómo funciona el &?
Ahora, apliquemos el & a n y n-1:

Si n es una potencia de dos (8):

  n    =  8  ->  1000
n - 1  =  7  ->  0111
-----------------------
n & (n - 1) =  0  ->  0000
Como el único bit 1 de n está en una posición diferente a la de los bits 1 de n-1, la operación AND da como resultado 0.

Si n NO es una potencia de dos (12):

  n    =  12 ->  1100  (tiene más de un bit en 1)
n - 1  =  11 ->  1011
-----------------------
n & (n - 1) =  8  ->  1000  (el resultado no es 0)
En este caso, la operación AND resulta en 8 porque ambos números comparten un bit 1 en la misma posición.

Resumen
El símbolo & realiza una operación de AND a nivel de bits. La expresión (n & (n - 1)) == 0 es un "atajo" o truco de programación que, de forma extremadamente eficiente, comprueba si un número positivo n tiene un solo bit 1 encendido en su representación binaria. Si es así, significa que es una potencia de dos.

Una operación AND a nivel de bits (&) se realiza comparando los bits de dos números, posición por posición. El resultado es un nuevo número donde cada bit es 1 solo si los bits correspondientes de ambos números originales eran 1.

Aquí te explico cómo funciona paso a paso con un ejemplo.

Ejemplo: Calcular 5 & 3
Paso 1: Convertir los números a binario
Primero, tienes que convertir los números decimales (5 y 3) a su representación binaria. Para un int de 32 bits, los números se representan con 32 bits, pero para simplificar, usaremos los bits necesarios para el ejemplo.

5 en binario: 0101

3 en binario: 0011

Paso 2: Alinear los números
Alinea los bits de los dos números verticalmente para facilitar la comparación:

  0101   (el número 5)
& 0011   (el número 3)
------
Paso 3: Aplicar la regla del AND bit a bit
Recuerda la regla del AND: el resultado es 1 solo si ambos bits son 1.

Posición	Bit de 5	Bit de 3	Resultado AND
8s	0	0	0
4s	1	0	0
2s	0	1	0
1s	1	1	1

Exportar a Hojas de cálculo
Aquí tienes el proceso completo visualmente:

  0101   (5)
& 0011   (3)
------
  0001   (el resultado)
Columna 1: 0 & 0 = 0

Columna 2: 1 & 0 = 0

Columna 3: 0 & 1 = 0

Columna 4: 1 & 1 = 1

Paso 4: Convertir el resultado a decimal
El resultado de la operación binaria es 0001. Si convertimos este número binario de nuevo a decimal, obtenemos 1.

Por lo tanto, 5 & 3 es igual a 1.

Código de ejemplo en Java
Puedes ver esto en acción con un simple programa en Java:

Java

public class BitwiseAndExample {
    public static void main(String[] args) {
        int a = 5;  // 0101 en binario
        int b = 3;  // 0011 en binario

        int result = a & b;

        System.out.println("El resultado de 5 & 3 es: " + result);
        // Salida: El resultado de 5 & 3 es: 1
    }
}
El operador & se usa mucho en programación de bajo nivel, criptografía y en algoritmos de optimización (como el que vimos para las potencias de dos) porque son extremadamente rápidos, ya que operan directamente sobre la representación binaria de los números.
*/
