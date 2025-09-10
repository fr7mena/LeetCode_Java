public class CourseArrayExercise12 {
    // Move Zeroes - Two pointers (in-place):
// slow = índice donde escribir el siguiente no-cero
// i    = índice de lectura que recorre todo el array
// Invariante: al inicio de cada iteración, los índices [0..slow-1]
// contienen los no-cero leídos hasta ahora, en el mismo orden.
// Si nums[i] != 0, lo colocamos en nums[slow] (si i != slow) y
// ponemos nums[i] = 0; luego slow++.
// Complejidad: O(n) tiempo, O(1) espacio.
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != slow) {
                    nums[slow] = nums[i];
                    nums[i] = 0;
                }
                slow++;
            }
        }
    }
}
/*Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]*/
