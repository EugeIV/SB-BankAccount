package bankaccount;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DepositAccount extends BankAccount
{
    SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
    Calendar dateOfDeposit = new GregorianCalendar();

    public void putTheMoney(int money)
    {
        dateOfDeposit.set(2020, 0, 10);
        this.money += money;
        System.out.println("Внесена сумма: " + money + "; Дата: " + dateFormat.format(dateOfDeposit.getTime()));
    }

    public void takeTheMoney(int money)
    {
        Calendar dateOfWithdrawal = new GregorianCalendar();
        dateOfWithdrawal.add(Calendar.MONTH, -1);
        if (dateOfWithdrawal.before(dateOfDeposit))
        {
            this.money -= money;
            System.out.println("Снята сумма: " + money);
        }
       else
        {
            System.out.println("Вы не можете снять деньги. Не прошло и месяца после пополнения!");
        }
    }
}
