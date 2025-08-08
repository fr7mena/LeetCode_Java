public class Main {
    public static void main(String[] args) {
        int target = 10;
        int[] arr = new int[]{1,2,5,5};
        System.out.println("Hello World");
        TwoSum solution1 = new TwoSum();
        System.out.println(solution1.twoSum(arr, target).toString());
    }
}
