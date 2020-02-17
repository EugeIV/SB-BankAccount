package bankaccount;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class DepositAccount extends BankAccount
{
    Calendar dateOfDeposit = new GregorianCalendar();

    public void putTheMoney(int money)
    {
        dateOfDeposit.set(2020, 0, 10);
        super.putTheMoney(money);
    }

    public void takeTheMoney(int money)
    {
        Calendar dateOfWithdrawal = new GregorianCalendar();
        dateOfWithdrawal.add(Calendar.MONTH, -1);
        if (dateOfWithdrawal.before(dateOfDeposit))
        {
            super.takeTheMoney(money);
        }
       else
        {
            System.out.println("Вы не можете снять деньги. Не прошло и месяца после пополнения!");
        }
    }
}
