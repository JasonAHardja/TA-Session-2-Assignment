public class CheckArray {
    public static void main(String[] args) {
        int[] array = {100, 521, -76, -12, 174};
        boolean result = containsNoZeroOrMinusOne(array);

        if (result) {
            System.out.println("The array contains no 0 or -1.");
        } else {
            System.out.println("The array contains 0 or -1.");
        }
    }

    public static boolean containsNoZeroOrMinusOne(int[] array) {
        for (int num : array) {
            if (num == 0 || num == -1) {
                return false;
            }
        }
        return true;
    }
}


