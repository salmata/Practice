package string;

public class StringCompare {
    public static void main (String[]args){

        String str = "Hello World";
        String str1 = "hello world";
        Object obj = str;
        String str2 = new String("HelloWorld");
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nString before reverse: "+ str);
        System.out.println(" String after reverse: " + reverse);




        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.compareTo(obj.toString()));
        System.out.println(str.equals(str1));
        System.out.println(str == str1);

    }

}
