package bankaccount;

public class BankAccount
{
    public int money;

    public int howMuchMoney()
    {
        System.out.print("На вашем счету: ");
        return money;
    }

    public void putTheMoney(int money)
    {
        this.money += money;
        System.out.println("Внесена сумма: " + money);
    }

    public void takeTheMoney(int money)
    {
        this.money -= money;
        System.out.println("Снята сумма: " + money);
    }
}
