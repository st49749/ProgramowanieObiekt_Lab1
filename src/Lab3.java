public class Lab3 {
    public static void RunLab3Pdf() {
        // Zad 1
        Zad1();

        // Zad 2
        Zad2();

        // Zad 3
        int[] myNum = {5, 6, 7, 8};
        Zad3(myNum);

        // Zad 4
        Zad4();

        // Zad 5
        Zad5IsPalindrome("kajak");
        Zad5IsPalindrome("test");
    }

    public static void Zad1() {
        System.out.println("Podaj n: ");
        var n = Util.GetInt();

        int i = 0;
        double sum = 0;
        while (i < n) {
            System.out.println("Podaj punkty studenta " + (i + 1));
            var points = Util.GetInt();
            sum += points;
            i++;
        }

        var average= sum / n;
        System.out.println("Srednia punktow to: " + average);
    }

    public static void Zad2() {
        var n = 10;
        int i = 0;

        int positiveCount = 0;
        double positiveSum = 0;
        int negativeCount = 0;
        double negativeSum = 0;


        while (i < n) {
            System.out.println("Podaj liczbe " + (i + 1));
            var num = Util.GetInt();

            if(num >= 0) {
                positiveCount++;
                positiveSum += num;
            }
            else {
                negativeCount++;
                negativeSum += num;
            }
        }

        System.out.println("Liczby ujemne: " + negativeCount + " liczb | suma: " + negativeSum);
        System.out.println("Liczby dodatnie: " + positiveCount + " liczb | suma: " + positiveSum);
    }

    public static void Zad3(int[] ar) {
        int sum = 0;

        for (var i = 0; i < ar.length; i++) {
            var num = ar[i];
            if(num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Suma liczb parzystych: " + sum);
    }

    public static void Zad4() {
        System.out.println("Podaj n: ");
        var n = Util.GetInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Util.GetRandomNumber(-10, 45);
        }

        Zad3(array);
    }

    public static boolean Zad5IsPalindrome(String word) {
        StringBuilder reverse = new StringBuilder();
        String orig = word.toLowerCase();
        var chars = word.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse.append(chars[i]);
        }

        return (reverse.toString()).equals(orig);
    }
}
