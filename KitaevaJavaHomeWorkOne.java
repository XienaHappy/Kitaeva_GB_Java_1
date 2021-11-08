public class KitaevaJavaHomeWorkOne {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 10;
        int b = 8;
        if (a + b >= 0) {
            System.out.println ("Сумма положительная");
        } else if (a + b <= 0) {
            System.out.println ("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println ("КРАСНЫЙ");
        } else if (value > 0 && value < 100) {
            System.out.println ("ЖЕЛТЫЙ");
        } else if (value > 100) {
            System.out.println ("ЗЕЛЕНЫЙ");
        }
    }

    static void compareNumbers() {
        int a = 8;
        int b = 9;
        if (a >= b) {
            System.out.println ("a >= b");
        } else {
            System.out.println ("a < b");
        }
    }
}
