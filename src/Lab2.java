public class Lab2 {
    public static void RunLab2Pdf() {
        // Zad 1
        Lab2.Zad1SolveQuadraticEquation(3, 5, 6);

        // Zad 2
        Zad2FunA(5);
        Zad2FunB(1);
        Zad2FunC(2);

        // Zad 3
        Lab2.Zad3Sort3Variables(9, 8, 7);

        // Zad 4
        System.out.printf("Czy pada deszcz: ");
        var isRaining = Util.GetBoolean();
        System.out.printf("Czy autobus czeka na przystanku: ");
        var busWaitingAtBusStop = Util.GetBoolean();
        Lab2.Zad4OperatorTest(isRaining, busWaitingAtBusStop);

        // Zad 5
        System.out.printf("Czy otrzymano znizke: ");
        var discountReceived = Util.GetBoolean();
        System.out.printf("Czy dostales podwyzke: ");
        var bonusReceived = Util.GetBoolean();
        Lab2.Zad5OperatorTest2(discountReceived, bonusReceived);

        // Zad 6
        int action = 0;
        while (action < 1 || action > 5) {
            System.out.println("Jakie dzialanie chcesz wykonac (1 dodawanie | 2 odejmowanie | 3 iloczyn | 4 iloraz | 5 reszta z dzielenia)");
            action = Util.GetInt();
        }
        System.out.printf("Podaj a: ");
        var a = Util.GetDouble();
        System.out.printf("Podaj b: ");
        var b = Util.GetDouble();
        var wynik = Zad6Calculator(action, a, b);
        System.out.println("Wynik dzialania to " + wynik);

    }

    public static void Zad1SolveQuadraticEquation(double a, double b, double c) {
        var delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            var x1 = (-b - Math.sqrt(delta)) / (2 * a);
            var x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Rozwiazania rownania to x1: " + x1 + " i x2: " + x2);
        } else if (delta == 0) {
            var x0 = (-b) / (2 * a);
            System.out.println("Rozwiazania rownania to x0: " + x0);
        } else {
            System.out.println("Brak rozwiazan rownania");
        }
    }

    public static double Zad2FunA(double x) {
        if (x > 0) {
            return 2 * x;
        } else if (x == 0) {
            return 0;
        } else {
            return -3 * x;
        }
    }

    public static double Zad2FunB(double x) {
        if (x >= 1) {
            return x * x;
        } else {
            return x;
        }
    }

    public static double Zad2FunC(double x) {
        if (x > 2) {
            return 2 + x;
        } else if (x == 2) {
            return 8;
        } else {
            return x - 4;
        }
    }

    public static void Zad3Sort3Variables(double a, double b, double c) {
        double temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Posortowane liczby: " + a + " " + b + " " + c);
    }

    public static void Zad4OperatorTest(boolean isRaining, boolean busWaitingAtBusStop) {
        if (isRaining && busWaitingAtBusStop) {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnie");
        } else if (isRaining) {
            System.out.println("Nie dostaniesz się na uczelnie");
        } else if (busWaitingAtBusStop) {
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }

    public static void Zad5OperatorTest2(boolean discountReceived, boolean bonusReceived) {
        if (!discountReceived || bonusReceived) {
            System.out.println("Możesz kupić samochód");
            System.out.println("Zniżki na samochód nie ma");
        }

        if (!discountReceived || !bonusReceived) {
            System.out.println("Zakup samochód trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        }

        if (discountReceived || bonusReceived) {
            System.out.println("Możesz kupić samochód");
        }
    }

    public static double Zad6Calculator(int action, double a, double b) {
        switch (action) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                if (b == 0) {
                    System.out.println("Nie mozna dzielic przez zero");
                    return 0;
                }

                return a / b;
            case 5:
                if (b == 0) {
                    System.out.println("Nie mozna dzielic przez zero");
                    return 0;
                }

                return a % b;
            default:
                System.out.println("Nie rozpoznano dzialania");
                return 0;
        }
    }
}
