package codewars.SevenKyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveTheMinimum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeSmallest(new int[]{2, 3, 4, 1})));
        System.out.println(Arrays.toString(removeSmallest(new int[]{5, 4, 3, 2})));
    }

    public static int[] removeSmallest(int[] numbers){
        //! My Code
        // If array is empty, return an empty array
        if (numbers.length == 0) {
            return new int[0];
        }

        // Find the smallest element and its index
        int smallest = numbers[0];
        int smallestIndex = 0;
        for(int i = 0;i < numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
                smallestIndex = i;
            }
        }

        // Create a new list to store the updated array
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (i != smallestIndex) {
                list.add(numbers[i]);
            }
        }

        // Convert the list back to an array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;

        //! from github
//        int min = range(0, numbers.length).reduce((i, j) -> numbers[i] > numbers[j] ? j : i).orElse(-1);
//        return range(0, numbers.length).filter(i -> i != min).map(i -> numbers[i]).toArray();
    }
}