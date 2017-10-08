package lesson4;

public class SumsExample {

    /*Напишите метод, который будет сравнивать сумму числе на промежутках [a,b], [c, d] включительно и
    возвращать true если первая сумма больше, и false в другом случае

Сигнатура метода - compareSums(int a, int b, int c, int d). Для нахождения суммы напишите отдельный метод
 sum(int from, int to), который будете потом исспользовать.

Метод должен содержаться в классе. Название класса не важно
        План решения
        1. В методе sum организуем перебор чисел на промежутке от from до to с вычислением и возвратом суммы.
        2. В методе compareSums вызываем дважды метод sum с подстановкой в первом случае a, b а во втором с, d.
        3. Первый результат заносим в sum1, второй в sum2. Если sum1 > sum2 то возвращаем true, иначе возвращаем false.
        4. В методе main вызываем метод compareSums с подстановкой параметров a,b,c,d (для проверки).
    */
    public static void main(String[] args) {
        System.out.println(compareSums(500,1000,50,100));

    }

    public static boolean compareSums(int a, int b, int c, int d) {
        long sum1 = 0;
        long sum2 = 0;
        //boolean res;
        sum1 = sum(a, b);
        sum2 = sum(c, d);
        if (sum1 > sum2) {
            return  true;
        } else {
            return  false;
        }


    }


    public static long sum(int from, int to) {
        long s = 0;
        long i = from;
        while (i <= to) {
            s += i;
            i++;
        }
        return s;
    }

}
