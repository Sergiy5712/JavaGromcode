package lesson5;

import java.util.Arrays;

public class FirstArray {

    public static void main(String[] args) {
        int a;
        a = 10;
        //type of array [] name of array = new type of array[length of array]
        int[] firstArray = new int[4]; //declaration
        System.out.println(Arrays.toString(firstArray));

        //array name [index] - get array element
        firstArray[0] = 11;
        firstArray[1] = 200;
        firstArray[2] = -10;

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }

        //System.out.println(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int b = 10;
        int[] secondarray = {1, 10, 15, -50};
        System.out.println(Arrays.toString(secondarray));
        //for-each
        for (int element : secondarray) {
            System.out.println(element);
        }


    }
}
