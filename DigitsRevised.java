import java.util.*;
public class DigitsRevised {
    public static void main(String[]args){
        int hundreds;
        int tens;
        int ones;
        int number = 128;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3 digit number: ");
        number = input.nextInt();
        input.close();

        ones = number%10;
        tens = ((number%100)-ones)%9;
        hundreds = (number-(number%100))%99;

        System.out.println("Hundreds place: "+ hundreds);
        System.out.println("Tens place: "+ tens);
        System.out.println("Ones place: "+ ones);
    }
}
