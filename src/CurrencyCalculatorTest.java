import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyCalculatorTest {

    private XMLParser xmlParser;
    private Map<String, Currency> currencyMap;

    @BeforeEach
    void beforeEach() {
        xmlParser = new XMLParser();
        currencyMap = xmlParser.insertCurrencyIntoMap();
    }

    @ParameterizedTest(name = "for given amount = {0} and currencyToConvert = {1} and currencyToGet = {2} " +
            "currencyConverter should return expectedCurrencyAmountToGet = {3}")
    @CsvSource({
            "100, EUR, PLN, 479.78",
            "100, EUR, USD, 101.52000000000001",
            "73,  EUR, IDR, 1110554.1099999999",
            "73,  EUR, JPY, 10138.97",
            "73,  EUR, CZK, 1793.975",
            "73,  EUR, DKK, 543.4558000000001",
            "73,  EUR, BGN, 142.7734",
            "73,  EUR, GBP, 61.42074",
            "73,  EUR, HUF, 29540.91",
            "73,  EUR, RON, 360.1382",
            "73,  EUR, SEK, 763.1785",
            "73,  EUR, CHF, 71.3064",
            "73,  EUR, ISK, 10154.30",
            "73,  EUR, NOK, 726.7734",
            "73,  EUR, HRK, 548.522",
            "73,  EUR, TRY, 1327.5707",
            "73,  EUR, AUD, 106.726",
            "73,  EUR, BRL, 394.48470000000003",
            "73,  EUR, CAD, 95.2577",
            "73,  EUR, CNY, 500.29819999999995",
            "73,  EUR, HKD, 581.7515999999999",
            "73,  EUR, ILS, 254.4415",
            "73,  EUR, INR, 5922.8550000000005",
            "73,  EUR, KRW, 97381.27",
            "73,  EUR, MXN, 1514.969",
            "73,  EUR, MYR, 330.4199",
            "73,  EUR, NZD, 119.0338",
            "73,  EUR, PHP, 4121.215",
            "73,  EUR, SGD, 102.8424",
            "73,  EUR, THB, 2730.2",
            "73,  EUR, ZAR, 1250.8330999999998"

    })
    void euroCurrencyConverterToAnyCurrencyTest(double amount, String currencyToConvert, String currencyToGet,
                                                double expectedCurrencyAmountToGet)
    {
        double eur100ToConvert = CurrencyCalculatorApp.currencyConventer(amount, currencyMap.get(currencyToConvert),
                currencyMap.get(currencyToGet));

        assertEquals(expectedCurrencyAmountToGet, eur100ToConvert);
    }

    @Test
    public void eurCurrencyConverterToEURTest() {
        double eur = CurrencyCalculatorApp.currencyConventer(175, currencyMap.get("EUR"), currencyMap.get("EUR"));
        double eurExpected = 175;
        assertEquals(eurExpected, eur);
        double eur1 = CurrencyCalculatorApp.currencyConventer(15, currencyMap.get("EUR"), currencyMap.get("EUR"));
        double eurExpected1 = 15;
        assertEquals(eurExpected1, eur1);
    }


    @ParameterizedTest(name = "for given amount = {0} and currencyToConvert = {1} and currencyToGet = {2} " +
            "currencyConverter should return expectedCurrencyAmountToGet = {3}")
    @CsvSource({
            "75, USD, JPY, 10260.786052009455",
            "75, BGN, CZK, 942.3893036097761",
            "75, DKK, GBP, 8.476412433173039",
            "75, HUF, PLN, 0.8892060197197715",
            "75, RON, SEK, 158.93450764178863",
            "75, CHF, ISK, 10680.282555282554",
            "75, NOK, HRK, 56.60519496173085",
            "75, TRY, AUD, 6.029396400508086",
            "75, BRL, CAD, 18.110531282962306",
            "75, CNY, HKD, 87.21072752210581",
            "75, IDR, ILS, 0.017183415313279965",
            "75, INR, KRW, 1233.1207247180623",
            "75, MXN, MYR, 16.35775550522816",
            "75, NZD, PHP, 2596.6668710903964",
            "75, SGD, THB, 1991.0562180579216",
            "75, ZAR, USD, 4.443614419861452",
            "75, ZAR, USD, 4.443614419861452",
            "5922.8550000000005, INR, EUR, 73"
    })
    void anyCurrencyConverterTest(double amount, String currencyToConvert, String currencyToGet,
                              double expectedCurrencyAmountToGet)

    {
        double eur100ToConvert = CurrencyCalculatorApp.currencyConventer(amount, currencyMap.get(currencyToConvert),
                currencyMap.get(currencyToGet));

        assertEquals(expectedCurrencyAmountToGet, eur100ToConvert);
    }

    @Test
    public void reverseCurrencyConverterTest() {
        double zarToUsd = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("ZAR"),
                currencyMap.get("USD"));
        double usdExpected = 4.443614419861452;
        assertEquals(usdExpected, zarToUsd);
        double usdToZar = CurrencyCalculatorApp.currencyConventer(4.443614419861452, currencyMap.get("USD"),
                currencyMap.get("ZAR"));
        double zarExpected = 75;
        assertEquals(zarExpected,usdToZar);
        double nzdToPHP = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("NZD"),
                currencyMap.get("PHP"));
        double phpExpected = 2596.6668710903964;
        assertEquals(phpExpected, nzdToPHP);
        double phpToNZD = CurrencyCalculatorApp.currencyConventer(2596.6668710903964, currencyMap.get("PHP"),
                currencyMap.get("NZD"));
        double nzdExpected = 75;
        assertEquals(nzdExpected,phpToNZD);
    }
}
