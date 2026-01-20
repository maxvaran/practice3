import java.util.Scanner;
import java.util.Locale;

public class Lab3_Danilov_KN21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Введіть ціле число: ");
        int integerNum = sc.nextInt();
        sc.nextLine(); // очистка буфера после nextInt

        System.out.print("Введіть число з плаваючою точкою: ");
        double floatNum = sc.nextDouble();
        sc.nextLine(); // очистка буфера после nextDouble

        System.out.print("Введіть рядок: ");
        String strVal = sc.nextLine();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean boolVal = sc.nextBoolean();

        System.out.println();

        System.out.println("1. " + integerNum + " " + floatNum + " " + strVal + " " + boolVal);

        System.out.printf("2. int=%d float=%.2f str=%s bool=%b%n",
                integerNum, floatNum, strVal, boolVal);

        System.out.printf("3. %d %o %x%n",
                integerNum, integerNum, integerNum);

        System.out.printf("4. |%10s| |%-10s|%n",
                strVal, strVal);

        System.out.printf("5. %.3f%n",
                floatNum);

        String f1 = String.format("6. %6d", integerNum);
        System.out.println(f1);

        String f2 = String.format("7. %.3s", strVal);
        System.out.println(f2);

        String f3 = String.format("8. %08.2f", floatNum);
        System.out.println(f3);

        System.out.printf("9. %-6b%n", boolVal);

        System.out.printf("10. %-10s %5d %8.2f %b%n",
                strVal, integerNum, floatNum, boolVal);

        sc.close();
    }
}
