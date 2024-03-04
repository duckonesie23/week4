import java.util.Scanner;
public class TempConverter {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Farenheit: ");
        int F =  input.nextInt();
        double C = 5.0/9*(F-32);
        System.out.println("Celcius is: " + C);
        input.close();

    }
}
