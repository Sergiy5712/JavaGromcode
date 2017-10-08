package lesson10.HomeWork;

/*В классе Demo в main методе создайте по 2 объекта каждого из классов Order. Вызовите у них все три метода в
правильной очередности
*/

import java.util.Date;

public class Demo {

    public static void main(String[] args) {
        //itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned

        ElectronicsOrder elOrder1 = new ElectronicsOrder("Tool1", new Date(), "Odessa",
                "Харьков", 800, new Customer("Jeck", "Odessa", "мужской"),
                12);

        ElectronicsOrder elOrder2 = new ElectronicsOrder("Tool2", new Date(), "Полтава",
                "Ужгород", 2800, new Customer("Юрий", "Измаил", "мужской"),
                12);


        elOrder1.calculatePrice();
        elOrder1.validateOrder();
        elOrder1.confirmShipping();

        elOrder2.calculatePrice();
        elOrder2.validateOrder();
        elOrder2.confirmShipping();

        //itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned, furnitureCode
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Шкаф", new Date(), "Львов",
                "Днепр", 3000, new Customer("Натали", "Рига", "женский"),
                "1256" );

        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Тумба", new Date(), "Киев",
                "Днепр", 1200, new Customer("Ольга", "Житомир", "женский"),
                "156" );

        furnitureOrder1.calculatePrice();
        furnitureOrder1.validateOrder();
        furnitureOrder1.confirmShipping();

        furnitureOrder2.calculatePrice();
        furnitureOrder2.validateOrder();
        furnitureOrder2.confirmShipping();

    }


}
