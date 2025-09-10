public class CourseArrayExercise9 {
    public static void main(String[] args) {

    }

    public boolean validMountainArray(int[] arr) {

        int max = arr[0];
        int index = 0;

        if (arr.length < 3) return false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]) {
                return false;
            }
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        if (max == arr[arr.length -1] || max == arr[0]) return false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i] && i < index) {
                return false;
            }
            if (arr[i - 1] < arr[i] && i > index) {
                return false;
            }
        }

        return true;
    }
}
