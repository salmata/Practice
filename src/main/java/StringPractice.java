import java.util.*;

public class StringPractice  {

    public static void main(String[] args) {

 // madam

        //m
        //a
        //d
        //a
        //m

        //madam

       List<Student> list = new ArrayList<Student>();
        list.add(new Student("Araf", "SID2", "3.5", "dsfdsf"));
        list.add(new Student("sdf", "SID2", "3.5", "dsfdsf"));
        list.add(new Student("sdf", "SID2", "3.5", "dsfdsf"));
        list.add(new Student("sdf", "SID2", "3.5", "dsfdsf"));
        list.add(new Student("sfd", "SID2", "3.5", "dsfdsf"));
        list.add(new Student("Araf", "SID2", "3.5", "dsfdsf"));
        list.add(new Student("dsf", "SID2", "3.5", "dsfdsf"));
        list.add(new Student("Araf", "SID2", "3.5", "dsfdsf"));

//        for (Student s: list) {
//            System.out.println(s.getName());
//        }

        Collections.reverse(list);
        System.out.println("reverse order: " + list);


        System.out.println(isPelendrome("hello"));

    }

    private static boolean isPelendrome(String word){

        char[] arrays = word.toCharArray();

        String output = "";

        for(int i = arrays.length - 1; i >= 0; i--){
            output = output + arrays[i];
        }

        if(word.equals(output)){
            return true;
        }

        return false;
    }
}
