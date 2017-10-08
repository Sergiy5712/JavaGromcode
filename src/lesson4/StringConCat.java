package lesson4;

public class StringConCat {
    public static void main(String[] args) {
        System.out.println( concat("Java ","это ","хорошо!"));
    }

    public static String concat(String st1, String st2, String st3) {

        String res = st1 + st2 + st3;
        return res;

    }
}
