import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    public void euroCurrencyConventerToAnyCurrentTest() {
        double eur100ToPLN = CurrencyCalculatorApp.currencyConventer(100, currencyMap.get("EUR"),
                currencyMap.get("PLN"));
        double expectedPLN = 479.78;
        assertEquals(expectedPLN, eur100ToPLN);
        double eur100ToUSD = CurrencyCalculatorApp.currencyConventer(100, currencyMap.get("EUR"),
                currencyMap.get("USD"));
        double expectedUSD = 101.52000000000001;
        assertEquals(expectedUSD, eur100ToUSD);
        double eur73ToIDR = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("IDR"));
        double expectedIDR1 = 1110554.1099999999;
        assertEquals(expectedIDR1, eur73ToIDR);
        double eur73ToJPY = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("JPY"));
        double expectedJPY = 10138.97;
        assertEquals(expectedJPY, eur73ToJPY);
        double eur73ToBGN = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("BGN"));
        double expectedBGN = 142.7734;
        assertEquals(expectedBGN, eur73ToBGN);
        double eur73ToCZK = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("CZK"));
        double expectedCZK = 1793.975;
        assertEquals(expectedCZK, eur73ToCZK);
        double eur73ToDKK = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("DKK"));
        double expectedDKK = 543.4558000000001;
        assertEquals(expectedDKK, eur73ToDKK);
        double eur73ToGBP = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("GBP"));
        double expectedGBP = 61.42074;
        assertEquals(expectedGBP, eur73ToGBP);
        double eur73ToHUF = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("HUF"));
        double expectedHUF = 29540.91;
        assertEquals(expectedHUF, eur73ToHUF);
        double eur73ToRON = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("RON"));
        double expectedRON = 360.1382;
        assertEquals(expectedRON, eur73ToRON);
        double eur73ToSEK = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("SEK"));
        double expectedSEK = 763.1785;
        assertEquals(expectedSEK, eur73ToSEK);
        double eur73ToCHF = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("CHF"));
        double expectedCHF = 71.3064;
        assertEquals(expectedCHF, eur73ToCHF);
        double eur73ToISK = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("ISK"));
        double expectedISK = 10154.30;
        assertEquals(expectedISK, eur73ToISK);
        double eur73TNOK = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("NOK"));
        double expecteNOK = 726.7734;
        assertEquals(expecteNOK, eur73TNOK);
        double eur73ToHRK = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("HRK"));
        double expectedHRK = 548.522;
        assertEquals(expectedHRK, eur73ToHRK);
        double eur73ToTRY = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("TRY"));
        double expectedTRY = 1327.5707;
        assertEquals(expectedTRY, eur73ToTRY);
        double eur73ToAUD = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("AUD"));
        double expectedAUD = 106.726;
        assertEquals(expectedAUD, eur73ToAUD);
        double eur73ToBRL = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("BRL"));
        double expectedBRL = 394.48470000000003;
        assertEquals(expectedBRL, eur73ToBRL);
        double eur73ToCAD = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("CAD"));
        double expectedCAD = 95.2577;
        assertEquals(expectedCAD, eur73ToCAD);
        double eur73ToCNY = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("CNY"));
        double expectedCNY = 500.29819999999995;
        assertEquals(expectedCNY, eur73ToCNY);
        double eur73ToHKD = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("HKD"));
        double expectedHKD = 581.7515999999999;
        assertEquals(expectedHKD, eur73ToHKD);
        double eur73ToILS = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("ILS"));
        double expectedILS = 254.4415;
        assertEquals(expectedILS, eur73ToILS);
        double eur73ToINR = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("INR"));
        double expectedINR = 5922.8550000000005;
        assertEquals(expectedINR, eur73ToINR);
        double eur73ToKRW = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("KRW"));
        double expectedKRW = 97381.27;
        assertEquals(expectedKRW, eur73ToKRW);
        double eur73ToMXN = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("MXN"));
        double expectedMXN = 1514.969;
        assertEquals(expectedMXN, eur73ToMXN);
        double eur73ToMYR = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("MYR"));
        double expectedMYR = 330.4199;
        assertEquals(expectedMYR, eur73ToMYR);
        double eur73ToNZD = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("NZD"));
        double expectedNZD = 119.0338;
        assertEquals(expectedNZD, eur73ToNZD);
        double eur73ToPHP = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("PHP"));
        double expectedPHP = 4121.215;
        assertEquals(expectedPHP, eur73ToPHP);
        double eur73ToSGD = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("SGD"));
        double expectedSGD = 102.8424;
        assertEquals(expectedSGD, eur73ToSGD);
        double eur73ToTHB = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("THB"));
        double expectedTHB = 2730.2;
        assertEquals(expectedTHB, eur73ToTHB);
        double eur73ToZAR = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("ZAR"));
        double expectedZAR = 1250.8330999999998;
        assertEquals(expectedZAR, eur73ToZAR);
    }

    @Test
    public void eurCurrencyConventerToEURTest() {
        double eur = CurrencyCalculatorApp.currencyConventer(175, currencyMap.get("EUR"), currencyMap.get("EUR"));
        double eurExpected = 175;
        assertEquals(eurExpected, eur);
        double eur1 = CurrencyCalculatorApp.currencyConventer(15, currencyMap.get("EUR"), currencyMap.get("EUR"));
        double eurExpected1 = 15;
        assertEquals(eurExpected1, eur1);
    }

    @Test
    public void anyCurrencyConverterTest() {
        double usd75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("USD"),
                currencyMap.get("JPY"));
        double expected = 10260.786052009455;
        assertEquals(expected, usd75);
        double bgn75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("BGN"),
                currencyMap.get("CZK"));
        double expected1 = 942.3893036097761;
        assertEquals(expected1, bgn75);
        double dkk75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("DKK"),
                currencyMap.get("GBP"));
        double expected2 = 8.476412433173039;
        assertEquals(expected2, dkk75);
        double huf75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("HUF"),
                currencyMap.get("PLN"));
        double expected3 = 0.8892060197197715;
        assertEquals(expected3, huf75);
        double ron75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("RON"),
                currencyMap.get("SEK"));
        double expected4 = 158.93450764178863;
        assertEquals(expected4, ron75);
        double chf75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("CHF"),
                currencyMap.get("ISK"));
        double expected5 = 10680.282555282554;
        assertEquals(expected5, chf75);
        double nok75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("NOK"),
                currencyMap.get("HRK"));
        double expected6 = 56.60519496173085;
        assertEquals(expected6, nok75);
        double try75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("TRY"),
                currencyMap.get("AUD"));
        double expected7 = 6.029396400508086;
        assertEquals(expected7, try75);
        double brl75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("BRL"),
                currencyMap.get("CAD"));
        double expected8 = 18.110531282962306;
        assertEquals(expected8, brl75);
        double cny75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("CNY"),
                currencyMap.get("HKD"));
        double expected9 = 87.21072752210581;
        assertEquals(expected9, cny75);
        double idr75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("IDR"),
                currencyMap.get("ILS"));
        double expected10 = 0.017183415313279965;
        assertEquals(expected10, idr75);
        double inr75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("INR"),
                currencyMap.get("KRW"));
        double expected11 = 1233.1207247180623;
        assertEquals(expected11, inr75);
        double mxn75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("MXN"),
                currencyMap.get("MYR"));
        double expected12 = 16.35775550522816;
        assertEquals(expected12, mxn75);
        double nzd75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("NZD"),
                currencyMap.get("PHP"));
        double expected13 = 2596.6668710903964;
        assertEquals(expected13, nzd75);
        double sgd75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("SGD"),
                currencyMap.get("THB"));
        double expected14 = 1991.0562180579216;
        assertEquals(expected14, sgd75);
        double zar75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("ZAR"),
                currencyMap.get("USD"));
        double expected15 = 4.443614419861452;
        assertEquals(expected15, zar75);
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
        assertEquals(zarExpected, usdToZar);
        double nzdToPHP = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("NZD"),
                currencyMap.get("PHP"));
        double phpExpected = 2596.6668710903964;
        assertEquals(phpExpected, nzdToPHP);
        double phpToNZD = CurrencyCalculatorApp.currencyConventer(2596.6668710903964, currencyMap.get("PHP"),
                currencyMap.get("NZD"));
        double nzdExpected = 75;
        assertEquals(nzdExpected, phpToNZD);
    }
}
