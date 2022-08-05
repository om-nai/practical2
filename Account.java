/*Design a class named Account that contains:
•A private int data field namedid for the account (default 0).0
•A private double data field named balance for the account (default 500₹)
.•A  private  double  data  field  named  annualInterestRate  that  stores  the  currentinterest rate (default 7%). Assume all accounts have the same interest rate
.•A  private  Date  data  field  named  dateCreated  that  stores  the  date  when  theaccount was created.•A no-arg constructor that creates a default account.
•A constructor that creates an account with the specified id and initial balance
.•The accessor and mutator methods for id, balance, and annualInterestRate.
•The accessor method for dateCreated.
•A method named getMonthlyInterestRate() that returns the monthlyinterest rate.
•A method named getMonthlyInterest() that returns the monthly interest.
•A method named withdraw that withdraws a specified amount from theaccount.
•A method named deposit that deposits aspecified amount to the account.*/

//OM NAYI
//21CE003
import java.util.Scanner;
public class Account {

    private int ID;
    public int Withdraw_balance;
    Scanner sc = new Scanner(System.in);
   public float balance = 300000;
   public int Depisit_Money ;
   public int b=0;
   public  int transfer_ID;

   public float getBalance() {
       return balance;
   }

    public int  get()
    {
        System.out.println("Please Enter Your Id no  :");
        ID =sc.nextInt();
        return ID;
    }

    public void checkID()
    {
        if(ID >= 1 && ID<=10  )
        {
                System.out.println("Your ID is correct please next enter your choice : ");

                

                System.out.println("1 = Balance inquiry");
                System.out.println("2 = Withdraw Money");
                System.out.println("3 = Deposit Money");
                System.out.println("4= Money transfer");
                System.out.println("5 = Create Acoount");
                System.out.println("6 = Deactive Accounty");
                System.out.println("7 = Exit");
                final  int choice = sc.nextInt();

                switch(choice)
                {
                    case 1:
                    {
                        printBalanace();
                        break;
                    }

                    case 2:
                    {
                          Withdraw_Money();
                        break;
                    }
                    case 3:
                    {
                        Deposit();
                        break;
                    }
                    case 4 :
                    {
                        transfer();
                        break;
                    }

                    case 5:
                    {
                      System.out.println("not created");
                      break;
                    }
                    case 6 :
                    {
                        System.out.println("not created");
                        break;
                    }
                    case  7:
                    {
                        System.out.println("not created");
                        break;
                    }
                }


        }
    }

   public void printBalanace()
    {
            System.out.println("The current balance in your Account are "+balance);
    }

    public void  Withdraw_Money()
    {
        System.out.println("Please enetr how much money you want to withdraw");
         Withdraw_balance = sc.nextInt();
         if(Withdraw_balance <=  balance)
         {
            System.out.println("Please take your Money");
         }
         balance = balance - Withdraw_balance;
    }
    public void Deposit()
    {
        System.out.println("Please enter the money you want to deposit : ");
        Depisit_Money =sc.nextInt();
        balance = balance + Depisit_Money;

    }

    public void transfer()
    {
        System.out.println("Please enter the Id you want to tansfer the money : ");
        if(transfer_ID == ID)
        {
            System.out.println("Error!!!!!!!!!!!!!!!!!!");
            System.out.println("please reenetr your transfer ID ");
        }
        else{

        }
    }
   


}
