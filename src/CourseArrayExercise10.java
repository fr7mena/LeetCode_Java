import java.util.Arrays;

public class CourseArrayExercise10 {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        arr = replaceElements(arr);

        System.out.println(Arrays.toString(arr));
    }
    /*Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation:
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.*/
    public static int[] replaceElements2(int[] arr) {
        int last = arr.length - 1;
        int i = 0;

        while (i < arr.length) {
            int max = 0;
            for (int j = i + 1; j < arr.length; j++) {
                //if (i + 1 == j) continue;
                if (arr[i+1] <= arr[j] && arr[j] > max) max = arr[j];
            }
            if (i == last) {
                arr[i] = -1;
                break;
            }

            arr[i] = max;
            i++;
        }
        return arr;
    }

    // Este es el código válido. La idea es que recorremos el array de derecha a izquierda,
// siendo el último elemento que verificamos la componente n-1 (el final del array).
// En cada iteración reemplazamos el elemento actual por el valor más alto que existe
// a su derecha. Al recorrer de derecha a izquierda, siempre que la siguiente iteración
// no tenga un número superior al máximo actual, usamos el máximo que ya hemos encontrado.
// Para el último elemento, ponemos -1 porque no tiene elementos a su derecha.
// Esto permite resolver el problema en O(n) sin bucles anidados.
    public static int[] replaceElements(int[] arr) {
        int last = arr.length - 1;
        int max = -1;

        //int[] arr = {17,18,5,4,6,1};
        for (int i = last; i >=0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (temp > max) max = temp;
        }

        return arr;
    }
    /*Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation:
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
Example 2:

Input: arr = [400]
Output: [-1]
Explanation: There are no elements to the right of index 0.*/
}
