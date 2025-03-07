import java.util.Random;
import java.util.Scanner;
public class number_guess 
{
    public static void main(String[] args) 
    {
        
        Random random_no = new Random();
        Scanner scanner = new Scanner(System.in);

        int lowenumber=0;
        int uppernumber=100;
        int number_to_guess=random_no.nextInt(uppernumber - lowenumber +1)+lowenumber;
        int user_guess;
        int attempts=0;


        System.out.println(": Welcome To The Number Guess game :-");
        System.out.println("Enter number between "+lowenumber+"To"+uppernumber);

        while (true) 
        { 
            
            System.out.println("Enter A Number:-");
            user_guess=scanner.nextInt();
            attempts++;

            if(user_guess < number_to_guess)
            {
                System.out.println("Too low number ! Please try Again");
            }
            else if(user_guess > number_to_guess)
            {
                System.out.println("Too high number ! Please try Again");   
            }
            else
            {
                System.out.println("Congrats !Guess number in"+""+attempts+" attempts");
                break;
            }
        }
        scanner.close();
    } 
}
