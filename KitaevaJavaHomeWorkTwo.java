    /**
    *KitaevaJavaHomeWorkTwo
    *
    *@author Ksenia
    *@version 7.11.2021
    */

    public class KitaevaJavaHomeWorkTwo {

    public static void main (String[] args) {

        doTaskOne();
        doTaskTwo(5);
        doTaskThree(-2);
        doTaskFour();
    }

    static boolean doTaskOne() {
        int a = 8;
        int b = 20;
        int c = a + b;
        if (c > 10 && c <= 20) {
            System.out.println("True");
        } else if (c >20){
            System.out.println("False");
        }
        return false;
    }

    static void doTaskTwo(int a) {
        if (a == 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    static boolean doTaskThree(int c) {
        return c < 0;
    }

    static void doTaskFour() {
        int i = 0;
        while (i < 5) {
            System.out.println("Test");
            i++;
        }
    }
    }