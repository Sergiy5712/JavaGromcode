package lesson8;


public class Arithmetic {

   /* Напишите класс Arithmetic с методом check, который принимает массив, как параметр и возвращает true если
   сумма его максимального и минимального элемента > 100, false в другом случае

    Напишите другой класс Adder, который наследуется от Arithmetic. Класс Adder содержит метод add, который
    принимает два параметра и возвращает их сумму

    Создайте класс демо, где в main методе через объект класса Adder вы вызовите два этих метода

    Сигнатура методов:
    check(int[] array)
    add(int a, int b) */

    public static boolean check(int[] array) {
        return (maxElement(array) + minElement(array)) > 100;

    }

    public static int maxElement(int[] array) {
        int max = array[0];

        for (int el : array) {
            if (el > max)
                max = el;
        }
        return max;
    }

    public static int minElement(int[] array) {
        int min = array[0];

        for (int el : array) {
            if (el < min)
                min = el;
        }
        return min;
    }

}
