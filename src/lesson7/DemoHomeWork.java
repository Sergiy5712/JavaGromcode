package lesson7;

import lesson6.Order;

import java.util.Date;

public class DemoHomeWork {

    /*В классе DemoHomeWork создайте два метода

createOrder()
createOrderAndCallMethods()

Первый метод должен возвращать объект класса Order с предыдущего ДЗ созданного с параметрами
price = 100, dateCreated = текущая, isConfirmed = false, dateConfirmed = null,
city = "Dnepr", country = "Ukraine", type = "Buy"

Второй метод доллжен создавать объект с другими параметрами
price = 100, dateCreated = текущая, isConfirmed = true, dateConfirmed = текущая, city = "Kiev",
country = "Ukraine", type = "SomeValue"
Вызывате все методы с класса Order через его объект и возвращать объект


Засабмитить нужно два класса */


    Order createOrder(){

        Order order = new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
        return order;
    }

    Order createOrderAndCallMethods(){

        Order order1 = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");

        order1.confirmOrder();
        order1.checkPrice();
        order1.isValidType();
        return order1;
    }


}
