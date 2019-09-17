package frameCollection;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class Enum {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println(list);
        //System.out.println("max: " + Collections.max(list));
        //System.out.println("min: " + Collections.min(list));


        Hashtable ht = new Hashtable();
        ht.put("1"," I");
        ht.put("2"," me");
        ht.put("3","mine");
        Enumeration e = ht.elements();
        Enumeration e1 = ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
