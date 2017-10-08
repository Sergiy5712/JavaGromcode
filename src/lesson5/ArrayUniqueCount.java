package lesson5;

public class ArrayUniqueCount {

   /* Напишите метод uniqueCount, который будет находить количество уникальных чисел в массиве.
   Если число повторяется больше одного раза, то его стоит учитывать, но только один раз. Длина массива > 0


    Сигнатура метода - uniqueCount(int[] array)
    Метод должен содержаться в классе. Название класса не важно

    Пример
    Входящие данные
    {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11}

    Ответ
7

    Объяснение
    Массив без повторений будет выглядеть
4, 5, 10, 11, 12, 44, 100 - длинна 7

    Числа 10, 11, 44 посторяются больше одного раза, но в ответе они учитываются один раз  */

   //1.Отсортировать по возростанию и сравнить пары.
    //2. Вычесть из длины массива кол-во повторений !!!!!!!

    public static void main(String[] args) {
        int[] array = {1, 2,3,2,5,4,3,8,2,2,5};
        //             1,2,3,5,4,8

        System.out.println(array.length);

        System.out.println(uniqueCount(array));
    }

    public static int uniqueCount(int[] array) {
        int count = 0;
        int un = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    break;
                }
            }
        }
        un = array.length - count;

        return un;




    }


}



