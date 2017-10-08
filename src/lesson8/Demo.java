package lesson8;


public class Demo {

    /*В классе Demo создайте два метода: createHighestParent, createLowestChild который создают и возвращают
    Объекты самого высокого родиделя и самого низкого наследника в данной иерархии */


    public static void main(String[] args) {
        int[] array = {1000, 5, 10, 4, 3};
        int a = 10;
        int b = 50;


        Adder adder = new Adder();

        adder.check(array);
        adder.add(a,b);


        System.out.println(adder.check(array));
        System.out.println(adder.add(a,b));
    }

    public static Student createHighestParent(){
         Student HighestParent = new Student("Ivan", "Vadim", 34, new Course [3]);
        return HighestParent;
    }

    public static SpecialStudent createLowestChild(){

        SpecialStudent lowestChild = new SpecialStudent("Alex", "Ivanovich", 45, new Course [2], 5112, "vnb@");
        return lowestChild;
    }
}
