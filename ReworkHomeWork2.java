    /**
    *ReworkHomeWork2
    *
    * @author Ksenia
    * @version 10.11.2021
    */

    public class ReworkHomeWork2 {
        public static void main (String[] args) {

            System.out.println("Sub_task_1.");

            System.out.println(sumTenToTwenty(10, -8));
            System.out.println(sumTenToTwenty(0,0));
            System.out.println(sumTenToTwenty(13, 6));
            System.out.println(sumTenToTwenty(20,0));
            System.out.println(sumTenToTwenty(20, 20));

            System.out.println("Sub_task_2.");

            countPositiveOrNagative(-1);
            countPositiveOrNagative(0);
            countPositiveOrNagative(1);

            System.out.println("Sub_task_3.");

            System.out.println(isNagative(-1));
            System.out.println(isNagative(0));
            System.out.println(isNagative(1));

            System.out.println("Sub_task_4.");

            repeatString("Test_Kitaeva_GB_Java_ReworkHomeWork2", 5);

            System.out.println("Sub_task_5.");

            System.out.println(countLeapYear(1904));
            System.out.println(countLeapYear(1900));
            System.out.println(countLeapYear(2020));
            System.out.println(countLeapYear(2005));
        }

    static boolean sumTenToTwenty(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void countPositiveOrNagative (int a) {
        System.out.println(a >= 0? "Positive number" : "Negative number");
    }

    static boolean isNagative(int a) {
        return a < 0;
    }

    static void repeatString(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }

    static boolean countLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 ==0;
    }
}