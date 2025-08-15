import java.util.ArrayList;
import java.util.Arrays;

public class DailyChallenge11_08_2025 {
    public static void main(String[] args) {
        int n = 15;
        int[][] arr = {{0, 1}, {2, 2}, {0, 3}};

        System.out.println(Arrays.toString(productQueries(n, arr)));


    }
    public static int[] productQueries(int n, int[][] queries) {
        int[] powers = numberToPow2(n);             // Array con las potencias de 2 que suman n
        int[] output = new int[queries.length];     // Array final de resultados, tamaño = número de queries

        loadPowers(queries, output, powers);        // Calcular el producto de cada query

        return output;                              // Devolver resultados
    }

    private static void loadPowers(int[][] queries, int[] output, int[] powers) {
        int MOD = 1_000_000_007; // Para evitar overflow
        for (int i = 0; i < queries.length; i++) {
            int init = queries[i][0];
            int end = queries[i][1];
            long product = 1; // usamos long para no overflow temporal

            for (int j = init; j <= end; j++) {
                product = (product * powers[j]) % MOD; // multiplicamos directamente TODO ¿POR QUE ES TAN IMPORTANTE EL MODULO AQUI Y COMO FUNCIONA? Pues bien es muy importante para evitar como ya se ha comentado antes el tema de que los valores obtenidos desborden el almacenamiento que se puede guardar en una variable de tipo int o long que evidentemente puede tener un almacenamiento superior. Pero como funciona el modulo: pues bien para entender esto hay que tener claro que el modulo es el resto en matematicas al hacer una divison entera y que la prueba de la division es D = d * c + r, pero a partir de esta podemos optener el resto o modulo como variable, despejando de la anterior ecuacion r = D - d * c , si nos ponemos en el caso de que el divisor sea mayor que el Dividendo, entonces el resto es el valor del Dividendo. Por ejemplo, D = 2, d = 5, c = 0 (porque estamos en un contexto de division entera) y r = x, Entonces sustituyendo en la ecuacion tendriamos esto -> r = 2 - 5 * 0; r = 2 - 0; r = 2. Como podemos ver el resto es el propio dividendo lo que tiene todo el sentido del mundo porque 5 cabe 0 veces en 2 y por lo tanto sobra 5 si agrupar porque directamente no cabe.
            }

            output[i] = (int) product; // Guardamos en el array de resultados
        }
    }

    public static int[] numberToPow2(int n) {
        ArrayList<Integer> powers = new ArrayList<>();

        String nBinary = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(nBinary).reverse();
        char[] arrayNumBinary = sb.toString().toCharArray();

        for (int i = 0; i < arrayNumBinary.length; i++) {
            if (arrayNumBinary[i] == '1') {
                powers.add((int) Math.pow(2, i)); // Guardamos la potencia de 2 correspondiente
            }
        }

        // Convertimos ArrayList a array
        int[] output = new int[powers.size()];
        for (int i = 0; i < powers.size(); i++) {
            output[i] = powers.get(i);
        }

        return output;
    }
}
