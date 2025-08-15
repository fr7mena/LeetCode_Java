import java.util.ArrayList;

public class DailyChallenge15_08_2025 {

    public static void main(String[] args) {
        int n = 257;
        boolean output = isPowerOfFour(n);
        System.out.println(output);
    }

    //Tambien sirviria este metodo:
    public static boolean isPowerOfFour(Integer n) { //He puesto por parametro que sea un Integer para que no me de error en la sobrecarga del metodo
        return (n & (n - 1)) == 0 && n % 3 == 1;
    }

    public static boolean isPowerOfFour(int n) {
        boolean output = false;
        ArrayList<Integer> powerOfFour = new ArrayList<>();

        for ( int i = 0; i <= 15; i++) {
            // powerOfFour.add(Integer.valueOf( (int) Math.pow(4, i )));
            powerOfFour.add((int) Math.pow(4, i));
        }

        //output = powerOfFour.contains(Integer.valueOf(n)); //Probar sin hacer el valueOf(int n)
        output = powerOfFour.contains(n);
        return output;
    }
}

/*
ENUNCIADO: LO HE HECHO SIN MIRAR EL CHAT EN NINGÚN MOMENTO.

Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.



        Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true


Constraints:

        -231 <= n <= 231 - 1


Follow up: Could you solve it without loops/recursion?*/
