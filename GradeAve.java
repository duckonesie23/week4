import java.util.Scanner;
public class GradeAve {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter grade 1: ");
        int grade1 = input.nextInt();
        System.out.print("Enter grade 2: ");
        int grade2 = input.nextInt();
        System.out.print("Enter grade 3: ");
        int grade3 = input.nextInt();
        System.out.print("Enter grade 4: ");
        int grade4 = input.nextInt();
        System.out.print("Enter grade 5: ");
        int grade5 = input.nextInt();

        System.out.println("The average is " + ((grade1 + grade2 + grade3 + grade4 + grade5)/5));
    }
}
