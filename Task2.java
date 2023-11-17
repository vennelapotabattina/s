import java.util.Scanner;

class Grade{
    public String grade(int avgp){
        switch (avgp / 10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}

public class Task2{
    public static void main(String[] args){
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);

        //Taking input of how many subjects are there
        System.out.print("Enter the number of subjects =");
        int tsubs = sc.nextInt();
        int tmarks = 0;

        for (int i = 0; i < tsubs; i++) {
            System.out.println("Enter the marks obtained in subject " + (i + 1));
            int marks = sc.nextInt();
            tmarks += marks;
        }

        //Calculate
        int avgp = tmarks / tsubs;

        //Calculate
        String Grade = g.grade(avgp);

        //Display
        System.out.println("Total marks :- " + tmarks);
        System.out.println("Percentage :- " + avgp+"%");
        System.out.println("Grade :- " + Grade);

        sc.close();
    }
}