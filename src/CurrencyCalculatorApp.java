import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class CurrencyCalculatorApp {

    private static Scanner scanner = new Scanner(System.in);
    private static XMLParser xmlParser = new XMLParser();
    private static Map<String, Currency> currencyMap = xmlParser.insertCurrencyIntoMap();
    private static int OPTION;

    public static void main(String[] args) {


        while (OPTION != 2) {
            try {
                printOption();
                OPTION = scanner.nextInt();
                scanner.nextLine();
                if (OPTION > 2 || OPTION < 0) {
                    System.out.println("Nie ma takiej opcji!");
                    System.out.println();
                }
                switch (OPTION) {
                    case 0:
                        convertEUR();
                        break;
                    case 1:
                        convertAnyCurrency();
                        break;
                    case 2:
                        System.out.println("Koniec programu");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wybrana opcja powinna być liczbą całkowitą od 0 do 2!");
                System.out.println();
                scanner.nextLine();
            } catch (NullPointerException e) {
                System.out.println("Nazwy walut powinny zawierać trzy litery i znajdować się na liście!");
                System.out.println();
            }
        }
       scanner.close();
    }

    private static void convertEUR() {
        try {
            System.out.println("Podaj kwotę w EUR:");
            double amount = scanner.nextDouble();
            if (amount < 0) {
                throw new NegativeNumberException();
            }
            scanner.nextLine();
            System.out.print("Podaj docelową walutę dostępną na liście: ");
            printingExistingCurrencies(currencyMap);
            String currencyName = scanner.nextLine().toUpperCase();
            double convertAmount = euroCurrencyConventer(amount, currencyMap.get(currencyName));
            System.out.println("Podana kwota po zamianie: " + convertAmount
                    + " " + currencyMap.get(currencyName).getCurrencyName());
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Należy wprowadzać tylko liczby!");
            System.out.println();
            scanner.nextLine();
        } catch (NegativeNumberException e) {
            System.out.println("Podana kwota nie może być liczbą ujemną");
            System.out.println();
        }
    }

    private static void convertAnyCurrency() {
        try {
            System.out.print("Podaj nazwę waluty do zamiany dostępną na liście: ");
            printingExistingCurrencies(currencyMap);
            String currencyNameToConvert = scanner.nextLine().toUpperCase();
            System.out.println("Podaj kwotę waluty do zamiany:");
            double amount = scanner.nextDouble();
            if (amount < 0) {
                throw new NegativeNumberException();
            }
            scanner.nextLine();
            System.out.print("Podaj docelową walutę dostępną na liście: ");
            printingExistingCurrencies(currencyMap);
            String currencyName = scanner.nextLine().toUpperCase();
            double convertAmount = anyCurrencyConventer(amount, currencyMap.get(currencyNameToConvert),
                    currencyMap.get(currencyName));
            System.out.println("Podana kwota po zamianie: " + convertAmount
                    + " " + currencyMap.get(currencyName).getCurrencyName());
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Należy wprowadzać tylko liczby!");
            System.out.println();
            scanner.nextLine();
        } catch (NegativeNumberException e) {
            System.out.println("Podana kwota nie może być liczbą ujemną");
            System.out.println();
        }
    }

    private static void printOption() {
        System.out.println(" Dostępne opcje:");
        System.out.println(" > Zamiana EUR na docelową wlutę - 0");
        System.out.println(" > Zamiana dowolnej waluty na inną dowolną walutę - 1");
        System.out.println(" > Wyjście z kalkulatora - 2");
    }

    private static void printingExistingCurrencies(Map<String, Currency> currencyMap) {
        for (Currency c : currencyMap.values()) {
            System.out.print(c.getCurrencyName() + " ");
        }
        System.out.println();
    }

    static double euroCurrencyConventer(double amount, Currency currencyToGet) {
        return (Math.round((amount * currencyToGet.getCurrencyRate()) * 100.0) / 100.0);
    }

    static double anyCurrencyConventer(double amount, Currency currencyToConvert, Currency currencyToGet) {
        return (Math.round(((amount / currencyToConvert.getCurrencyRate())
                * currencyToGet.getCurrencyRate()) * 100.0) / 100.0);
    }
}
