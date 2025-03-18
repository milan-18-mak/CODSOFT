import java.util.Scanner;

public class student_grade_cal 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);

        int num_of_subjects=0;
        int total_marks=0;

        System.out.println("Enter Numbers of Subject: ");
        num_of_subjects=scanner.nextInt();

        System.out.println("Enter marks of subjects between 0 to 100");
        for(int i=1;i<=num_of_subjects;i++)
        {
            System.out.println("Enter Marks of Subjet: "+i);
            int marks=scanner.nextInt();
            total_marks+=marks;
        }

        double avg_per=(double)total_marks/num_of_subjects;

        String grade;
        if(avg_per>90)
        {
            grade="+A";
        }
        else if(avg_per>80)
        {
            grade="A";
        }
        else if(avg_per>70)
        {
            grade="B";
        }

        else if(avg_per>60)
        {
            grade="C";
        }
        else if(avg_per>50)
        {
            grade="D";
        }
        else{
            grade="Fail";
        }

        System.out.println("Total Marks: "+total_marks);
        
        System.out.println("Percentage: "+avg_per);

        System.out.println("Grade: "+grade);

        scanner.close();
    }    
}