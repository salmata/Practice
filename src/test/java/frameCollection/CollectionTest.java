package frameCollection;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest {
    public static void main (String[]args){
        System.out.println("Collection Example!\n");
        int size;
        HashSet<String > collection = new HashSet<String>();
        String str1 = "Red", str2 ="Yello",str3 = "Blue",str4 = "Green";
        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        System.out.println(" Collection data");
        iterator = collection.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next()+ " ");
        }
        System.out.println();
        size = collection.size();

        if (collection.isEmpty()){
            System.out.println("Collection is empty");
        }else {
            System.out.println(" collection size " + size);
        }
        System.out.println();
    }

}
