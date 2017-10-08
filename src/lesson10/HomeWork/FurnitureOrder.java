package lesson10.HomeWork;

/*Класс FurnitureOrder описывает заказы мебели. У него есть дополнительное поле:
String furnitureCode
Класс реализовывает абстрактные методы по правилам:

валидация
Заказ возможен с городов: Киев, Львов и в любой город. Минимальная цена заказа 500. Так же имя клиента который
делает заказ не может быть "Тест", а пол может быть любым

расчет цены
Коммисия за доставку - 5% от суммы заказа если сумма меньше 5000 и 2% в других случаях

*/

import java.util.Date;

public class FurnitureOrder extends Order {

    String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice,
                          Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    void validateOrder(){

        if (getTotalPrice() >= 500){
            if (getCustomerOwned().getName() != "Тест"){
                if (getCustomerOwned().getCity()  == "Киев" || getCustomerOwned().getCity() == "Львов" ){
                            if (getDateConfirmed() ==null){
                            setDateConfirmed(new Date());
                        }

                }
            }
        }
    }

    void calculatePrice(){
        if (getBasePrice() < 5000){
            setTotalPrice(getBasePrice() * 1.05);
        }
        setTotalPrice(getBasePrice() * 1.02);

    }
}
