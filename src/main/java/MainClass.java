import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {

    public static void main(String arg[]){
        final List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("e");

//        Iterator a = list.iterator();
//        while (a.hasNext()){
//            Object b = a.next();
//            System.out.println(b);
//        }

        Thread thread= new Thread(new Runnable() {
            public void run() {

                try {
                    Thread.sleep(3000);
                    System.out.println(list.get(0));
                }catch (Exception ex){

                }
            }
        });
        Thread thread1= new Thread(new Runnable() {
            public void run() {

                System.out.println(list.get(1));

            }
        });

        thread.start();
        thread1.start();



    }

}
