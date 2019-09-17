package array;

import java.util.Arrays;

public class Initialize {

    public static void main(String args[]) {

        String[]names = new String[]{"A","B","C"};
        String [] extended = new String[5];
        extended [3] = "D";
        extended[4] = "E";
        System.arraycopy(names,0,extended,0,names.length);
        for (String str : extended){
            System.out.println(str);
        }

        int array[] = new int[6];
        Arrays.fill(array, 100);

        for (int i = 0, n = array.length; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        Arrays.fill(array, 3, 6, 50);

        for (int i = 0, n = array.length; i < n; i++) {
            System.out.println(array[i]);
        }
    }

}
