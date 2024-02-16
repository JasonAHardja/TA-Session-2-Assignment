public class Main {
    public static void main(String[] args) {
        int[] array = {10, 101, -10, -100, 111};
        int max = findMax(array);
        System.out.println("The maximum value in the array is: " + max);
    }

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}



