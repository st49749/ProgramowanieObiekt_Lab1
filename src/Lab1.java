public class Lab1 {
    public static void RunLab1Pdf() {
        // Zad 1
        System.out.println(Lab1.Zad1GetMyName());
        // Zad 2
        System.out.printf("Podaj pierwsza liczbe: ");
        int first = Util.GetInt();
        System.out.printf("Podaj druga liczbe: ");
        int second = Util.GetInt();
        Lab1.Zad2ShowCalculations(first, second);
        // // Zad 3
        System.out.println(Lab1.Zad3IsEven(10));
        System.out.println(Lab1.Zad3IsEven(11));
        // Zad 4
        System.out.println(Lab1.Zad4IsDividedBy3And5(15));
        System.out.println(Lab1.Zad4IsDividedBy3And5(16));
        // Zad 5
        System.out.println(Lab1.Zad5Pow(2));
        // Zad 6
        System.out.println(Lab1.Zad6Sqrt(16));
        // Zad 7
        System.out.printf("Podaj random min: ");
        int min = Util.GetInt();
        System.out.printf("Podaj random max: ");
        int max = Util.GetInt();
        int a = Util.GetRandomNumber(min, max);
        int b = Util.GetRandomNumber(min, max);
        int c = Util.GetRandomNumber(min, max);
        System.out.println("Wylosowane liczby a b c: " + a + " " + b + " " + c);
        System.out.println(Lab1.Zad7IsTriangle(a, b, c));
    }

    public static String Zad1GetMyName() {
        return "Moje imie to Krzysztof Moryl mam XX lat";
    }

    public static void Zad2ShowCalculations(int first, int second) {
        System.out.println("Suma to: " + (first + second));
        System.out.println("Różnica to: " + (first - second));
        System.out.println("Iloczyn to: " + (first * second));
    }

    public static boolean Zad3IsEven(int number) {
        return (number % 2) == 0;
    }

    public static boolean Zad4IsDividedBy3And5(int number) {
        return (number % 3) == 0 && (number % 5) == 0;
    }

    public static double Zad5Pow(double number) {
        return Math.pow(number, 3);
    }

    public static double Zad6Sqrt(double number) {
        return Math.sqrt(number);
    }

    public static boolean Zad7IsTriangle(double a, double b, double c) {
        // przyp a b przeciwprostokatna c
        if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
            System.out.println("przyprostokatna " + a + " " + b + " przeciwprostokatna " + c);
            return true;
        }

        // przyp a c przeciwprostokatna b
        if ((Math.pow(a, 2) + Math.pow(c, 2)) == Math.pow(b, 2)) {
            System.out.println("przyprostokatna " + a + " " + c + " przeciwprostokatna " + b);
            return true;
        }

        // przyp b c przeciwprostokatna a
        if ((Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2)) {
            System.out.println("przyprostokatna " + b + " " + c + " przeciwprostokatna " + a);
            return true;
        }

        return false;
    }

}
