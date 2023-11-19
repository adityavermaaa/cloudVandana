import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original array: " + Arrays.toString(numbers));

        Random random = new Random();

        for (int i = numbers.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        System.out.println("Shuffled array: " + Arrays.toString(numbers));
    }
}
