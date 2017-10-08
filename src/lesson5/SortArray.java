package lesson5;

import java.util.Arrays;

public class SortArray {

    /*Напишите два метода, которые будут сортировать массив в порядке
    возрастания и убывания соответственно.

     Возвращаемое значение - отсортированный массив
      Сигнатура методов:
int[] array sortAscending(int[] array)
int[] array sortDescending(int[] array)

Методы должны находиться в классе, название класса не важно

P.S. сортировку массива на практике с нуля пишут крайне мало, почти никогда.
Написать ее с нуля для новичка тоже не простая задача.
    Поэтому в задании приемлемо если вы найдете решение в интернете,
    предварительно разберетесь в нем и проверите на сайте */


    public static void main(String[] args) {
        int[] array = {10, 12, 3, 30, 4, 50, 11, 0};
        System.out.println(Arrays.toString(sortAscending( array)));
        System.out.println(Arrays.toString(sortDescending( array)));

    }



   static  int[] sortAscending(int[] array){


    for (int i = array.length - 1; i >= 1; i--) {

        boolean sorted = true;

        for (int j = 0; j < i; j++) {

            if (array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                sorted = false;
            }
        }

        if(sorted) {
            break;
        }
    }
       return array;
   }

    static int[] sortDescending(int[] array){

        for (int i = array.length - 1; i >= 1; i--) {

            boolean sorted = true;

            for (int j = 0; j < i; j++) {

                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    sorted = false;
                }
            }

            if(sorted) {
                break;
            }
        }
        return array;
    }

  }
