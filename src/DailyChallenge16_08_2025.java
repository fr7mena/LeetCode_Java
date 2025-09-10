import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DailyChallenge16_08_2025 {
    public static void main(String[] args) {
        int num = 9669;
        int num2 = 9668;

        System.out.println(maximum69Number(6966));

    }
    public static int maximum69NumberChangingDigits (int num) { // Esta solucion no esta mal teniendo la logica que yo tenia que era teniendo en cuenta las cifras del numero que me pasa obtener el mayor numero posible utilizando esas cifras peero lo que quiere el ejercicio no es eso sino que cambiemos una de las componentes de array o por un 6 o un nueve y obtengamos el mayor numero posible haciendo eso una unica vez
        String str = Integer.toString(num);
        char[] arrayNum = str.toCharArray();

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] == '9' || arrayNum[i] == '6') {
                if (arrayNum[i] == '9') {
                    for (int j = 0; j < i; j++) {
                        if (arrayNum[j] == '6') {
                            arrayNum[i] = '6';
                            arrayNum[j] = '9';
                            break;
                        }
                    }
                }
            } else {
                return 0;
            }
        }

        str = "";
        for (Character c : arrayNum) {
            str += c;
        }

        return Integer.parseInt(str);

        //ArrayList<Character> list = new ArrayList<>();

        /*for (Character numList : list) { //Rellenamos un ArrayList con los con los indices compuestos por cada cifra del variable num
            if (numList != '9' || numList != '6') {
                return 0;
            } else {
                list.add(numList);
            }
        }*/



    }

    /*cambiemos una de las componentes de array o por un 6 o un nueve y obtengamos el mayor numero posible haciendo eso una unica vez*/

    public static int maximum69Number (int num) {
        String str = Integer.toString(num);
        char[] arrayNum = str.toCharArray();
        final char[] arrayNumReal = arrayNum.clone(); //Me hago una copia independiente inmutable del estado original del numero
        String strFlag = "";

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] == '9' || arrayNum[i] == '6') {
                for (int j = 0; j < arrayNum.length; j++) {
                    if (arrayNum[j] == '6') {
                        arrayNum[j] = '9';
                    } //Cambio esa cifra o digit por el numero mayor que es el 9
                    for (Character c : arrayNum) {
                        strFlag += c; //Creo ese numero cambiando solo una cifra
                    }
                    list.add(Integer.parseInt(strFlag)); //Lo anado a la lista de resultados
                    strFlag = ""; // Reinicio el estado del String solucion de cada iteracion
                    arrayNum = arrayNumReal.clone(); //Vuelvo a reiniciar el orinal para volver a cambiar la siguiente cifra correspondiente a la siguiente iteracion
                }
            } else {
                return num;
            }
        }

        Collections.sort(list); //Una vez tengo todos los resultados los ordeno, en este caso de forma ascendente 0, 1, 2, 3, ...
        return list.get(list.size() - 1); //Me cojo el ultimo que es el mayor
    }

    //Solucion corta y buena:
    public static int maximum69NumberFinal(int num) {
        char[] strToArray = Integer.toString(num).toCharArray();

        for (int i = 0; i < strToArray.length; i++) {
            if (strToArray[i] == '6') {
                strToArray[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(strToArray));
    }
}

