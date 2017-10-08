package lesson4;

public class FindDivExample {

    /*Напишите метод который на промежутке [a, b] будет находить количество чисел, которые кратны числу n
    Сигнатура метода - findDivCount(short a, short b, int n)
    n > 0, 0 <= a <= b
            План решения
      1. Создаем метод findDivCount(short a, short b, int n)
      2. Организуем перебор чисел на промижутке от а до в
      3. Во время перебора делим по модулю каждое число на n
      4. Если остаток равен нулю увеличиваем счетчик на 1
      5. В main методе вызываем метод  findDivCount с аргументами и выводим результат в консоль (для проверки).
     */
    public static void main(String[] args) {
        System.out.println(findDivCount((short)1, (short)10, 3));
    }

    public static int findDivCount(short a, short b, int n) {

        int i = a;
        int rem = 1;
        int count = 0;
        while (i <= b) {
            rem = i % n;
            if (rem == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}
