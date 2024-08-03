import java.util.*;
class  atminterface
{
    public static void main(String[] args)
    {
    int choice,withdraw,deposit;
double Balance=100000;
Scanner scan=new Scanner(System.in);
while (true) {
System.out.println("1.Withdraw\n2.Depostit\n3.Check Balance\n4.Exit");
System.out.println("Enter Your Choice..");
choice=scan.nextInt();
switch(choice)
{

case 1:
System.out.println("Enter Your Money To Withdraw");
withdraw=scan.nextInt();
if(Balance>=withdraw)
{
    Balance=Balance-withdraw;
    System.out.println("Successfully Withdrawal");
}
else 
{
    System.out.println("insuffucient Balance");
}
break;

case 2:
System.out.println("Enter Money TO Deposit");
deposit=scan.nextInt();
Balance=Balance+deposit;
System.out.println("Successfully Deposited");
break;

case 3:
System.out.println("Checking Balance!");
System.out.println("Total Balance is :"+Balance);
break;

case 4:
System.out.println("Exit");
break;
    }
}
    }
}




