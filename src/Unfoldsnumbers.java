import java.util.Arrays;

public class Unfoldsnumbers {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int[] inversednumbers = inverseArray(numbers);
        System.out.println(Arrays.toString(inversednumbers));
    }
    public static int[] inverseArray(int[] numbers) {
        int length = numbers.length;
        int[] inverseArray = new int[length];
        for (int i = 0; i < length; i++) {
            inverseArray[i] = numbers[length - 1 - i];
        }
        return inverseArray;
    }
}
