package lesson2;

public class SumOfNumbers {
    public static void main(String[] args) {
        long a=0;
        int i=0;
        while (i<=10000000){
            a=a+i;
            i++;
        }
        System.out.println(a);
    }
}
