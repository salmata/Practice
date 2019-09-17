package oopconcepts;

// Overriding;

public class Car {
    public void toyota() {
        System.out.println(" catch the market very fast");
    }

    public static class Factory extends Car{
        public void toyota() {
            System.out.println(" one of the famous car ");
        }
    }

    public static class TestCar {
        public static void main(String[] args) {
           Car a = new Car();
           Car b = new Factory();
            a.toyota();
            b.toyota();

        }
    }
}