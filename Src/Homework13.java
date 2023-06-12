import java.util.Random;

public class Homework13 {
    public static void main(String[] args) {
        Random random = new Random();
        int myNumber = random.nextInt(100011 - 11) + 11;
        System.out.print("\nЗагадане число = " + myNumber);
        int myNumberLength = (int) Math.floor(Math.log10(myNumber) + 1);
        System.out.print("\nДовжина числа = " + myNumberLength);
        int myNumberSum = 0;
        int myNumberDigit = 0;
        for (int i = myNumberLength-1; i >= 0; i--) {
            myNumberDigit = (int) (myNumber / Math.pow(10, i))-(myNumberDigit*10);
            System.out.print("\nЦифра" + (myNumberLength-i) + " числа = " + myNumberDigit);
            myNumberSum = myNumberSum + myNumberDigit;
        }
        System.out.print("\nСума цифр числа = " + myNumberSum);
    }
}
