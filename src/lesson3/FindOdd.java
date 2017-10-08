package lesson3;

public class FindOdd {
    /* План решения
    1. Организуем перебор чисел от 0 до 1000;
    2. Каждое число делим по модулю на 2
    3. Если остаток деления не равен 0 прибавляем это число к сумме и выводим Found;
    4. Полученную сумму умножаем на 5 и сравниваем с 5000
    5. Если сумма умноженная на 5 больше 5000 выводим Bigger
    6. В другом случае выводим Smaller or equal
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int i = 0;
        while (i <= 1000) {
            a = i % 2;
            if (a != 0) {
                b = b + i;
                System.out.println("Found");
            }
            i++;
        }
        c = b * 5;
        // System.out.println(b);
        if (c > 5000) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller or equal");
        }

    }
}
