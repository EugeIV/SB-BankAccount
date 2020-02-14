package bankaccount;

public class CardAccount extends BankAccount
{
    public void takeTheMoney(int money)
    {
        this.money -= (money + money*0.01);
        System.out.println("Снята сумма: " + money);
    }
}
