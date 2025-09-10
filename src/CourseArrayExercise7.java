public class CourseArrayExercise7 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,2,2,2,2,2,3,3,3,3,4,5,4}; // Input array
        int[] expectedNums = {0,1,2,3,4,5};
        System.out.println(removeDuplicates(nums));

    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int length = nums.length;

        while (i < length - 1) {
                if (nums[i] == nums[i + 1]) {
                    for (int j = i + 1; j < length; j++) {
                        nums[j - 1] = nums[j];
                    }
                    length--;
                } else {
                    i++;
                }

        }
        return length;
    }
}
