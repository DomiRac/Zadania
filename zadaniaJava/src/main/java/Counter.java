import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        float num1;
        float num2;
        float result = 0;
        char sign;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź pierwszą liczbę: ");
        num1 = scanner.nextInt();
        System.out.print("Wprowadź drugą liczbę: ");
        num2 = scanner.nextInt();
        System.out.println("Jaką operację chcesz wykonać? Wybierz  \"/\" jeśli dzielenie, \"*\" jeżeli mnożenie.");
        sign = scanner.next().charAt(0);

        switch (sign) {
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
        }

        System.out.print("Twój wynik to: " + result);
    }
}