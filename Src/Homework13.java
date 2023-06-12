import java.util.Arrays;
import java.util.Random;

public class Homework13 {
    public static void main(String[] args) {
        //формуєм рандомне натуральне число
        Random random = new Random();
        int myNumber = random.nextInt(100011 - 11) + 11;
        System.out.print("\nРандомне натуральне число = " + myNumber);

        //формуєм массив чисел де у загаданого числа "відрізаєм" по цифрі
        int myNumberLength = (int) Math.floor(Math.log10(myNumber) + 1);
        int[] myNumberDigitDraft = new int[myNumberLength];
        for (int i = myNumberLength - 1; i >= 0; i--) {
            myNumberDigitDraft[myNumberLength - i - 1] = (int) ((myNumber / Math.pow(10, i)));
        }

        //формуєм массив із цифрами числа і рахуєм їх сумму
        int[] myNumberDigit = new int[myNumberLength];
        myNumberDigit[0] = myNumberDigitDraft[0];
        int myNumberSum = myNumberDigitDraft[0];
        for (int j = 1; j < myNumberLength; j++) {
            myNumberDigit[j] = myNumberDigitDraft[j] - myNumberDigitDraft[j - 1] * 10;
            myNumberSum = myNumberSum + myNumberDigit[j];
        }
        System.out.print("\nЦифри числа " + Arrays.toString(myNumberDigit));
        System.out.print("\nСума цифр числа " + myNumberSum);
    }
}
