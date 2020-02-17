package bankaccount;

public class CardAccount extends BankAccount
{
    private int FEE = 100;

    public void takeTheMoney(int money)
    {
        super.takeTheMoney(money + money / FEE);
    }
}
