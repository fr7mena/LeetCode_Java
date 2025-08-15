import java.util.ArrayList;
import java.util.Comparator;

public class DailyChallenge14_08_2025 {
    public static void main(String[] args) {
        String num = "124445677789";
        System.out.println(largestGoodInteger(num));
    }
    public static String largestGoodInteger(String num) {
        String output = "";
        int cont = 0;
        String flag = "";
        ArrayList<String> listGood = new ArrayList<>();

        char[] arrayString = num.toCharArray();

        for (int i = 0; i < arrayString.length; i++) {
            if (i == 0) {
                flag = String.valueOf(arrayString[i]);
                continue;
            }
            if (cont == 0) {
                flag = String.valueOf(arrayString[i]);
            }

            if (arrayString[i] == arrayString[i - 1]) {
                cont++;
                flag = flag.concat(String.valueOf(arrayString[i]));
                if (cont == 2) {
                    listGood.add(flag);
                    flag = "";
                    cont = 0;
                }
            } else {
                cont = 0;
            }
        }

        listGood.sort(Comparator.reverseOrder());

        if (!listGood.isEmpty()) {
            output = String.valueOf(listGood.get(0));
        }

        return output;
    }
}
