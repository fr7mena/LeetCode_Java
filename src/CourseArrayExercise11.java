public class CourseArrayExercise11 {

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,2,2,2,2,2,3,3,3,3,4,4};

        System.out.println(removeDuplicates(nums));

    }

    /*Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).*/

    public static int removeDuplicates(int[] nums) {
        int slow = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[slow] != nums[i]) {
                slow++;
                nums[slow] = nums[i];
            }
        }
        return slow + 1;

    }






}
