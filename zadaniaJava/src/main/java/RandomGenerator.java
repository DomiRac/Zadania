import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomGenerator {
    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random generator = new Random();
        int number = generator.nextInt(10) + 1;
        boolean result = false;
        System.out.println("Podaj prawidłową liczbę z zakresu 1-11: ");

        while (result == false) {

            int guess = Integer.parseInt(reader.readLine());
            if (guess == number) {
                System.out.print("Dobra robota!");

            } else {

                System.out.println("Niestety, nie trafiłeś...");
            }
        }
    }
}
