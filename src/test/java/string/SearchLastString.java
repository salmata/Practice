package string;

public class SearchLastString<i> {
    public static void main(String[] args) {
        String strOrig = "Hello World , Hello Reader";
        String[] words = strOrig.split("\\s");
        for (String w:words){
            System.out.println(w);
        }

        int lastIndex = strOrig.lastIndexOf("Hello");
        int index = strOrig.lastIndexOf("H");
        String input = "practicepoint";
        char[] try1 = input.toCharArray();

        for(int i = try1.length - 1;i >=0;i--)

        {
            System.out.println(try1[i]);

        }


        if (lastIndex == 0) {
            System.out.println("Hello found");

        } else {
            System.out.println("Last occurrence of Hello is at index " + lastIndex);
        }

        System.out.println(index);
    }



    }
