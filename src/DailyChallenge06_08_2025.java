public class DailyChallenge06_08_2025 {
    public static void main(String[] args) {
        int[] fruits = {4,2,5};
        int[] baskets = {3,5,4};
        int length = fruits.length;
        int result = numOfUnplacedFruits(fruits, baskets);
        System.out.println(result);
    }
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cont = 0; //Inicializo el contador a 0
        int n = fruits.length; //Marco la longitud porque el array de frutas y cestas tiene siempre la misma longitud, eso lo marca el enunciado
        boolean flag = false; //MARCO UNA FLAG PARA COMPROBAR EL ESTADO DE SI CABE O NO LA CANTIDAD DE FRUTAS EN LA CESTA O NO, SI CABE LA PONGO A TRUE
        for (int fruit : fruits) { //SE PUEDE recorrer un array con un foreach, recorro el valor de las frutas, fruit = valor y fruits = longitud del array que se recorre
            flag = false; // Inicializo en cada iteracion la flag a false para poder controlar el estado de si la fruta cabe o no en una cesta
            for (int i = 0; i < n; i++) {
                if (fruit <= baskets[i]) { // Si cabe Pongo el valor de ese indice del array a 0 para que no puede caber ninguna fruta y marcar que esta lleno y cambio el estado de la flag a true, como diciendo que esas frutas se colocaron en las cestas
                    baskets[i] = 0;
                    flag = true;
                    break; //Hago el break y paso a la siguiente fruta, es decir a la siguiente iteracion del bucle externo
                }
            }
            if (!flag) {
                cont++; //Si no se pudo colocar la fruta porque la flag se mantiene en false, sumo 1 al contador.
            }
        }
        return cont;
    }
}
