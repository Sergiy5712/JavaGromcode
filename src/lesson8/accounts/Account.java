package lesson8.accounts;

public class Account {

    String bankName;
    String ownerName;
    int moneyAmount;

    public Account(String bankName, String ownerName, int moneyAmount) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }

    void depositMoney(int amount) {
        moneyAmount += amount;
    }

    //Перегрузка метода
    //overloading
    void depositMoney(){
        moneyAmount += 1000;
        System.out.println("deposit was successful");
    }

    void chengeOvnerName(String newOvnerName){
        ownerName = newOvnerName;
    }


}
