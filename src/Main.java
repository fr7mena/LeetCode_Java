public class Main {
    public static void main(String[] args) {
        int target = 10;
        int[] arr = new int[]{1,2,5,5};
        System.out.println("Hello World");
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.twoSum(arr, target).toString());
    }
}
