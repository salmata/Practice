package string;


public class RemoveChar {
    public static void main(String[] args) {
        String str = "This is Java";
        System.out.println(removeCharAt(str,3));
        System.out.println(str.replace('J', 'T'));
        System.out.println(str.replaceFirst("Th","Ja"));
        System.out.println(str.replaceAll("Ja","Ha"));

    }

    public static String removeCharAt(String s,int pos){
        return s.substring(0,pos) + s.substring(pos + 1);
    }

}
