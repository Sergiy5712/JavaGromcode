package lesson2;

public class SumAndDivision {
    public static void main(String[] args) {
        int a = 0;
        int i = 0;
        while (i <= 1000) {
            a = a + i;
            i++;
        }
        int c1 = a / 1234;
        int c2 = a % 1234;
        boolean rez = c2 <= 1234;
        // System.out.println(a);
        // System.out.println(c2);
        System.out.println(rez);
    }
}
