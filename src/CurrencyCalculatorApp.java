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
                    case 1:
                        convertCurrency();
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

    private static void printOption() {
        System.out.println(" Dostępne opcje:");
        System.out.println(" > Zamiana EUR na docelową walutę - 0");
        System.out.println(" > Zamiana dowolnej waluty na inną dowolną walutę - 1");
        System.out.println(" > Wyjście z kalkulatora - 2");
    }

    private static void convertCurrency() {
        try {
            String currencyNameToConvert;
            if (OPTION == 0) {
                currencyNameToConvert = "EUR";
                System.out.println("Podaj kwotę w EUR:");
            } else {
                System.out.print("Podaj nazwę waluty do zamiany dostępną na liście: ");
                currencyNameToConvert = getCurrencyName();
                System.out.println("Podaj kwotę waluty do zamiany:");
            }
            double amount = getAmount();
            System.out.print("Podaj docelową walutę dostępną na liście: ");
            String currencyName = getCurrencyName();
            double convertAmount = currencyConventer(amount, currencyMap.get(currencyNameToConvert),
                    currencyMap.get(currencyName));
            printAmountCovered(currencyName, convertAmount);
        } catch (InputMismatchException e) {
            System.out.println("Należy wprowadzać tylko liczby!");
            System.out.println();
            scanner.nextLine();
        } catch (NegativeNumberException e) {
            System.out.println("Podana kwota nie może być liczbą ujemną");
            System.out.println();
        }
    }

    private static String getCurrencyName() {
        printingExistingCurrencies(currencyMap);
        return scanner.nextLine().toUpperCase();
    }

    private static double getAmount() {
        double amount = scanner.nextDouble();
        if (amount < 0) {
            throw new NegativeNumberException();
        }
        scanner.nextLine();
        return amount;
    }

    private static void printAmountCovered(String currencyName, double convertAmount) {
        System.out.println("Podana kwota po zamianie: " + convertAmount
                + " " + currencyMap.get(currencyName).getCurrencyName());
        System.out.println();
    }

    private static void printingExistingCurrencies(Map<String, Currency> currencyMap) {
        for (Currency c : currencyMap.values()) {
            System.out.print(c.getCurrencyName() + " ");
        }
        System.out.println();
    }

    public static double currencyConventer(double amount, Currency currencyToConvert, Currency currencyToGet) {
        return (Math.round(((amount / currencyToConvert.getCurrencyRate())
                * currencyToGet.getCurrencyRate()) * 100.0) / 100.0);
    }
}
