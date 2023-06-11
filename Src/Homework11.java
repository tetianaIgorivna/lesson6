import java.util.Arrays;
import java.util.Random;

public class Homework11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] organizerNumbers;
        organizerNumbers = new int[7];
        for (int i = 0; i < organizerNumbers.length; i++) {
            organizerNumbers[i] = random.nextInt(9 - 0) + 0;
        }
        Arrays.sort(organizerNumbers);
        System.out.println("Числа організатора лотереї: " + Arrays.toString(organizerNumbers));
        int[] playerNumbers;
        playerNumbers = new int[7];
        for (int j = 0; j < playerNumbers.length; j++) {
            playerNumbers[j] = random.nextInt(9 - 0) + 0;
        }
        Arrays.sort(playerNumbers);
        System.out.println("Числа гравця лотереї :      " + Arrays.toString(playerNumbers));

        int coincidence = 0;
        for (int t = 0; t < organizerNumbers.length; t++) {
            if (organizerNumbers[t] == playerNumbers[t]) {
                coincidence = coincidence + 1;
            }
        }
        System.out.println("Кількість збігів: " + coincidence);
    }
}

