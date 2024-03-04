import java.util.*;
public class DivAndMod{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int int1 = input.nextInt();
        System.out.print("Enter a second integer: ");
        int int2 = input.nextInt();

        System.out.println(int1 + " / " + int2 + " = " + (int1/int2));
        System.out.println(int1 + " % " + int2 + " = " + (int1%int2));
        System.out.println("");
        System.out.println(int2 + " / " + int1 + " = " + (int2/int1));
        System.out.println(int2 + " % " + int1 + " = " + (int2%int1));
        input.close();
    }
}