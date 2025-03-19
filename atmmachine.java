import java.util.Scanner;

public class atmmachine 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        double balance=0;

        while (true) 
        { 
            System.out.println("\n ATM Menu:-");
            System.out.println("1. Check Balance:-");
            System.out.println("2. Deposite:-");
            System.out.println("3. Withdawal:-");
            System.out.println("4. Exit:-");
            System.out.print("Choose Option:- ");
            int choice = scanner.nextInt();

            switch(choice)
            {

                case 1:
                        System.out.println("Your Balance is: "+balance);
                        break;

                case 2:
                        System.out.println("Enter Depostie Amount: ");
                        double deposite_Amount=scanner.nextDouble();

                        if(deposite_Amount >0)
                        {
                            balance +=deposite_Amount;
                            System.out.println("Deposite Successfully.");
                            System.out.println("Your new Balance is: "+balance);
                        }
                        else{
                            System.out.println("Invalied depostie amount");
                        }
                        break;

                case 3:
                        System.out.println("Enter Withdrawal Amount.");
                        double withdrawalamount=scanner.nextDouble();

                        if(withdrawalamount >0 && withdrawalamount<=balance)
                        {
                            balance -=withdrawalamount;
                            System.out.println("withdrawal Successfully.");
                            System.out.println("New Balance."+balance);
                        }
                        else{
                            System.out.println("Invalied Withdrawal Amount or insufficent balance");
                        }
                        break;

                case 4:

                        System.out.println("Thank You For using the ATM. Goodbye !");
                        scanner.close();

                default:
                        System.out.println("Invalid Option Please try again");
            }
        }
    }
}