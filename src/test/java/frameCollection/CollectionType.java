package frameCollection;

import java.util.*;

public class CollectionType {
    public static void main(String[]args){
        List lnlst = new LinkedList();
        lnlst.add("Element1");
        lnlst.add("Element2");
        lnlst.add("Element3");
        lnlst.add("Element4");
        displayAll(lnlst);

        List arrylst = new ArrayList();
        arrylst.add("x");
        arrylst.add("y");
        arrylst.add("z");
        arrylst.add("W");
        displayAll(arrylst);

        Set hashSet = new HashSet();
        hashSet.add("set1");
        hashSet.add("set2");
        hashSet.add("set3");
        hashSet.add("set4");
        hashSet.add("set5");
        displayAll((List) hashSet);

        SortedSet treeSet = new TreeSet();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        displayAll((List) treeSet);

        LinkedList lnkHashset = new LinkedList();
        lnkHashset.add("one");
        lnkHashset.add("two");
        lnkHashset.add("three");
        lnkHashset.add("four");
        displayAll(lnkHashset);

        Map map = new HashMap();
        map.put("key1","J");
        map.put("key2","K");
        map.put("key3","L");
        map.put("key4","M");
        displayAll((List) map.keySet());
        displayAll((List) map.values());

        SortedMap map2 = new TreeMap();
        map2.put("key1", "JJ");
        map2.put("key2", "KK");
        map2.put("key3", "LL");
        map2.put("key4", "MM");
        displayAll((List) map2.keySet());
        displayAll((List) map2.values());

        LinkedHashMap map3 = new LinkedHashMap();
        map3.put("key1", "JJJ");
        map3.put("key2", "KKK");
        map3.put("key3", "LLL");
        map3.put("key4", "MMM");
        displayAll((List) map3.keySet());
        displayAll((List) map3.values());

    }

    private static void displayAll(Collection col) {
        Iterator itr = col.iterator();
        while (itr.hasNext()){
            String str = (String) itr.next();
            System.out.println(str + " ");
        }
        System.out.println();
    }


    public static void displayAll(List lnlst) {
    }
}
