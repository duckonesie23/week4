public class Digits {
    public static void main(String[]args){
        int hundreds;
        int tens;
        int ones;
        int number = 526;

        ones = number%10;
        tens = ((number%100)-ones)%9;
        hundreds = (number-(number%100))%99;

        System.out.println("Hundreds place: "+ hundreds);
        System.out.println("Tens place: "+ tens);
        System.out.println("Ones place: "+ ones);
    }
}
