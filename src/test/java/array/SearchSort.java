package array;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchSort {
    public static void main(String[] args)throws Exception {

       int arr1 [] = { 2,3,5,9,4};
       int arr2[] = { 2,3,5,9,4};
       if (arr1 == arr2)
           System.out.println("same");
       else System.out.println(" not same");
       System.out.println("Is array 1 equels array 2 " + Arrays.equals(arr1,arr2));

        ArrayList ssr = new ArrayList();
        ArrayList ssr2 = new ArrayList();
        ssr.retainAll(ssr2);
        System.out.println(ssr);



        int array[] = {-3,-2,-1,0,1,2,3,4,5};
        Arrays.sort(array);
        printArray("Sorted array" , array);

        int index = Arrays.binarySearch(array,2);
        System.out.println("Found 3 @ " + index);

        
    }

    private static void printArray(String message, int array []) {
        System.out.println(message + " : [length : " + array.length + "]");
        for (int i = 0; i < array.length; i++){
            if(i !=0){
                System.out.println(" ,  ");

            }
            System.out.print(array[i]);
        }
        System.out.println();

    }

}
