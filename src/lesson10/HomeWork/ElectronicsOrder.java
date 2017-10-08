package lesson10.HomeWork;

/*Класс ElectronicsOrder описывает заказы электроники. У него есть дополнительное поле:
        int guaranteeMonths

        Класс реализовывает абстрактные методы по правилам:

        валидация
        заказ возможен с городов: Киев, Одесса, Днепр, Харьков и в один из этих городов. Минимальная цена заказа 100.
        Так же имя клиента который делает заказ может быть любым, а пол только женским

        расчет цены
        Цена может состоит из цены товара и цены за доставку. Так же могут быть скидки. Если доставка производится в
        любой город, кроме Киева и Одессы, то цена за доставку - 15% от суммы заказа. В других случаях 10%. Так же если
         цена больше 1000 то скидка на заказ 5% после оплаты комиссии за доставку

*/

import java.util.Date;

public class ElectronicsOrder extends Order {

    int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice,
                            Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    void validateOrder() {

        if (getBasePrice() >= 100){
            if (getCustomerOwned().getGender() == "женский"){
                if (getCustomerOwned().getCity()  == "Киев" || getCustomerOwned().getCity() == "Одесса" ||
                        getCustomerOwned().getCity() == "Днепр" || getCustomerOwned().getCity() == "Харьков"){
                    if (getShipToCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" ||
                            getShipToCity() == "Харьков"){
                        if (getDateConfirmed() ==null){
                            setDateConfirmed(new Date());
                        }
                    }
                }
            }
        }
    }


    void calculatePrice() {

        if (getShipToCity() != "Киев" || getShipToCity() != "Одесса") {
            setTotalPrice(getBasePrice() * 1.15);
        }
        setTotalPrice(getBasePrice() * 1.1);

        if (getTotalPrice() > 1000){
            setTotalPrice(getTotalPrice() * 0.95);
        }

    }


}
