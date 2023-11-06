package pack;
import java.util.Arrays;
import java.util.Random;

public class ShuffleNumber {

    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        shuffle(array);

        // Print the shuffled array
        System.out.println(Arrays.toString(array));
    }

    private static void shuffle(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i >= 1; i--) {
            int j = random.nextInt(i + 1);
            swap(array, i, j);
        }
    }

    private
 
static
 
void
 
swap(int[] array, int i, int j)
 
{
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}