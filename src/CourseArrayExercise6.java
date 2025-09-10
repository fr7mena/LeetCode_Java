import java.util.Arrays;

public class CourseArrayExercise6 {

    public static void main(String[] args) {


    }

    public static int removeElement1(int[] nums, int val) {
        int length = nums.length - 1;
        int i = 0;
        //int pointer = 0;

        /*Input: nums = [0,1,2,2,3,0,4,2], val = 2
            Output: 5, nums = [0,1,4,0,3,_,_,_]
            Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
            Note that the five elements can be returned in any order.
            It does not matter what you leave beyond the returned k (hence they are underscores).*/

        /*for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                    i--;
                }

                length--;
            }
        }*/

        while (i <= nums.length -1) {
            if (nums[i] == val) {
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j] = nums[j -1];
                }
                i--;
                length--;
            }
            i++;
        }



        //Arrays.sort(nums);
        return length;
    }
    public static int removeElement(int[] nums, int val) {
        int length = nums.length; // tamaño lógico
        int i = 0;

        while (i < length) {
            if (nums[i] == val) {
                // desplazamos todo hacia la izquierda
                for (int j = i + 1; j < length; j++) {
                    nums[j - 1] = nums[j];
                }
                length--; // reducimos tamaño lógico
                // NO incrementamos i, porque hay que revisar el valor que se movió aquí
            } else {
                i++; // solo avanzamos si no borramos
            }
        }
        return length;
    }

}
