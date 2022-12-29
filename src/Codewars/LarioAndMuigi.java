package Codewars;

import java.util.Arrays;

public class LarioAndMuigi {
    public static void main(String[] args) { // Main method just for printing the output
        int[] numbers = {-1,7,4};
        System.out.println(Arrays.toString(pipeFix(numbers)));
    }
    public static int[] pipeFix(int[] numbers) {
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

// ----------------- "BEST PRACTICE" SOLUTION BELOW -----------------

//public class Kata {
//    public static int[] pipeFix(int[] numbers) {
//        int min = numbers[0];
//        int max = numbers[numbers.length - 1];
//        int size = max - min + 1;
//        int[] result = new int[size];
//        for (int i = 0; i < size; i++){
//            result[i] = i + min;
//        }
//        return result;
//    }
//}