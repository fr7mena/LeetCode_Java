import java.util.Arrays;
import java.util.HashMap;

public class Solution1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,5};
        int suma = 10;
        int[] solucion = twoSum(array, suma);
        System.out.println(solucion);
        /*System.out.println(Arrays.toString(solucion));*/
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i]; //El valor que nos falta para conseguir el target, es el que vamos a analizar a ver si se encuentra ese valor en el map/diccionario para devolver si índice.
            if (map.containsKey(remaining)) { //se hace esto porque en la key estoy guardando el valor de los componentes del array
                return new int[]{map.get(remaining), i}; //esto sería una solución porque si el mapa contiene como clave el valor que necesito para sumar el target, que básicamente es el remainig, puede devolver el valor de la clave remaining que ya estaba en el mapa, que básicamente representa el índice del array de nums donde se encuentra el valor equivalente al remaining, y a su vez en la segunda componente del array solución el índice actual del array que es i.
            }
            map.put(nums[i], i); //En el caso de que no lo encuentre añado al map esa clave-valor (valor de la componente del array(key) - índice del array(value)) es decir le meto el valor como clave y el índice actual del array como valor
        }
        return new int[]{-1, -1}; //Si no devuelvo este array con dos componenetes con ambas componentes a menos -1
    }
}


