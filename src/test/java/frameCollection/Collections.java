package frameCollection;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add( " I ");
        list.add(" am ");
        list.add(" going");
        list.add(" to be ");
        list.add(" a programmer");
        String[]s1 = list.toArray(new String[0]);
        for (int i =0; i<s1.length; i++){
            String contents = s1[i];
            System.out.println(contents);
        }

    }
}
