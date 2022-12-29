import java.util.Arrays;

public class LarioAndMuigi {
    public static void main(String[] args) {
        int[] numbers = {-1,7,4};
        System.out.println(Arrays.toString(pipeFix(numbers)));
    }
    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!
        int counter = 0;
        int min = numbers[0];
        int max = numbers[numbers.length-1];
        int[] newArr = new int[max-min+1];

        while (counter < newArr.length) {
            for (int i = min; i <= max; i++) {
                newArr[counter] = i;
                counter++;
            }
        }
        return newArr;
    }
}