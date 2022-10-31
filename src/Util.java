import java.util.Scanner;

public class Util {
    public static int GetInt() {
        return new Scanner(System.in).nextInt();
    }

    public static double GetDouble() {
        return new Scanner(System.in).nextDouble();
    }

    public static boolean GetBoolean() {
        return new Scanner(System.in).nextBoolean();
    }

    public static int GetRandomNumber(int min, int max) {
        return (int) (Math.random() * (max + 1 - min)) + min;
    }
}
