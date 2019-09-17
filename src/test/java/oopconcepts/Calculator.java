package oopconcepts;

// inheritance

public class Calculator {
    int c;
    public void add(int a, int b){
        c = a+ b;
        System.out.println(" sum of: " + c);
    }

    public void subtract(int a, int b){
        c = a-b;
        System.out.println(" subtract of : " +c );
    }

    public static class MyCalculator extends Calculator{
        public void multiple(int a, int b){
            c = a * b;
            System.out.println(" multiply of : " + c);
        }

        public static void main(String[] args) {
            int a = 20; int b = 10;
            MyCalculator calculator = new MyCalculator();
            calculator.add(a,b);
            calculator.subtract(a,b);
            calculator.multiple(a,b);

        }
    }
}
