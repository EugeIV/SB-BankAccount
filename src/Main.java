import bankaccount.BankAccount;
import bankaccount.CardAccount;
import bankaccount.DepositAccount;

public class Main
{
    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount();
        bankAccount.putTheMoney(50000);
        bankAccount.takeTheMoney(20000);
        System.out.println(bankAccount.howMuchMoney());
        System.out.println();

        CardAccount cardAccount = new CardAccount();
        cardAccount.putTheMoney(10000);
        System.out.println(cardAccount.howMuchMoney());
        cardAccount.takeTheMoney(5000);
        System.out.println(cardAccount.howMuchMoney());
        System.out.println();

        DepositAccount depositAccount = new DepositAccount();
        depositAccount.putTheMoney(10000);
        System.out.println(depositAccount.howMuchMoney());
        depositAccount.takeTheMoney(2000);
        System.out.println(depositAccount.howMuchMoney());
    }
}
