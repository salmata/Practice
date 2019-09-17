package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayMain {
    public static void main(String[] args) throws Exception {
        int array [] = { 1,3,5,5,7,9,0 };

        Arrays.sort(array);
        printArrays("Sorted array" , array);
        int index = Arrays.binarySearch(array,2);
        System.out.println("Found 2 @ " + index);


        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max((Arrays.asList(numbers)));
        System.out.println("Min number:"+ min);
        System.out.println(" Max number:" + max);

        int number[] = new int[]{8, 2, 7, 1, 4, 9, 5};
        int s = number[0];
        int l = number[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > l)l = numbers[i];
            else if (numbers[i] < s)s = numbers[i];
        }
        System.out.println("Largest Number is : " + l);
        System.out.println("Smallest Number is : " + s);

        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }


    private static void printArrays(String message, int[] array) {
        System.out.println( message + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
    }

