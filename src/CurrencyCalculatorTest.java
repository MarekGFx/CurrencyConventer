import org.junit.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyCalculatorTest {

    @Test
    public void euroCurrencyConventerTest() {
        XMLParser xmlParser = new XMLParser();
        Map<String, Currency> currencyMap = xmlParser.insertCurrencyIntoMap();
        double eur100ToPLN = CurrencyCalculatorApp.currencyConventer(100, currencyMap.get("EUR"),
                currencyMap.get("PLN"));
        double expectedPLN = 479.78;
        assertEquals(expectedPLN, eur100ToPLN);
        double eur100ToUSD = CurrencyCalculatorApp.currencyConventer(100, currencyMap.get("EUR"),
                currencyMap.get("USD"));
        double expectedUSD = 101.52;
        assertEquals(eur100ToUSD, expectedUSD);
        double eur73ToIDR = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("IDR"));
        double expectedIDR1 = 1110554.11;
        assertEquals(eur73ToIDR, expectedIDR1);
        double eur73ToJPY = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("JPY"));
        double expectedJPY = 10138.97;
        assertEquals(eur73ToJPY, expectedJPY);
        double eur73ToBGN = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("BGN"));
        double expectedBGN = 142.77;
        assertEquals(eur73ToBGN, expectedBGN);
        double eur73ToCZK = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("CZK"));
        double expectedCZK = 1793.98;
        assertEquals(eur73ToCZK, expectedCZK);
        double eur73ToDKK = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("DKK"));
        double expectedDKK = 543.46;
        assertEquals(eur73ToDKK, expectedDKK);
        double eur73ToGBP = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("GBP"));
        double expectedGBP = 61.42;
        assertEquals(eur73ToGBP, expectedGBP);
        double eur73ToHUF = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("HUF"));
        double expectedHUF = 29540.91;
        assertEquals(eur73ToHUF, expectedHUF);
        double eur73ToRON = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("RON"));
        double expectedRON = 360.14;
        assertEquals(eur73ToRON, expectedRON);
        double eur73ToSEK = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("SEK"));
        double expectedSEK = 763.18;
        assertEquals(eur73ToSEK, expectedSEK);
        double eur73ToCHF = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("CHF"));
        double expectedCHF = 71.31;
        assertEquals(eur73ToCHF, expectedCHF);
        double eur73ToISK = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("ISK"));
        double expectedISK = 10154.30;
        assertEquals(eur73ToISK, expectedISK);
        double eur73TNOK = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("NOK"));
        double expecteNOK = 726.77;
        assertEquals(eur73TNOK, expecteNOK);
        double eur73ToHRK = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("HRK"));
        double expectedHRK = 548.52;
        assertEquals(eur73ToHRK, expectedHRK);
        double eur73ToTRY = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("TRY"));
        double expectedTRY = 1327.57;
        assertEquals(eur73ToTRY, expectedTRY);
        double eur73ToAUD = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("AUD"));
        double expectedAUD = 106.73;
        assertEquals(eur73ToAUD, expectedAUD);
        double eur73ToBRL = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("BRL"));
        double expectedBRL = 394.48;
        assertEquals(eur73ToBRL, expectedBRL);
        double eur73ToCAD = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("CAD"));
        double expectedCAD = 95.26;
        assertEquals(eur73ToCAD, expectedCAD);
        double eur73ToCNY = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("CNY"));
        double expectedCNY = 500.30;
        assertEquals(eur73ToCNY, expectedCNY);
        double eur73ToHKD = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("HKD"));
        double expectedHKD = 581.75;
        assertEquals(eur73ToHKD, expectedHKD);
        double eur73ToILS = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("ILS"));
        double expectedILS = 254.44;
        assertEquals(eur73ToILS, expectedILS);
        double eur73ToINR = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("INR"));
        double expectedINR = 5922.86;
        assertEquals(eur73ToINR, expectedINR);
        double eur73ToKRW = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("KRW"));
        double expectedKRW = 97381.27;
        assertEquals(eur73ToKRW, expectedKRW);
        double eur73ToMXN = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("MXN"));
        double expectedMXN = 1514.97;
        assertEquals(eur73ToMXN, expectedMXN);
        double eur73ToMYR = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("MYR"));
        double expectedMYR = 330.42;
        assertEquals(eur73ToMYR, expectedMYR);
        double eur73ToNZD = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("NZD"));
        double expectedNZD = 119.03;
        assertEquals(eur73ToNZD, expectedNZD);
        double eur73ToPHP = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("PHP"));
        double expectedPHP = 4121.22;
        assertEquals(eur73ToPHP, expectedPHP);
        double eur73ToSGD = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("SGD"));
        double expectedSGD = 102.84;
        assertEquals(eur73ToSGD, expectedSGD);
        double eur73ToTHB = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("THB"));
        double expectedTHB = 2730.2;
        assertEquals(eur73ToTHB, expectedTHB);
        double eur73ToZAR = CurrencyCalculatorApp.currencyConventer(73, currencyMap.get("EUR"),
                currencyMap.get("ZAR"));
        double expectedZAR = 1250.83;
        assertEquals(eur73ToZAR, expectedZAR);

    }

    @Test
    public void eurCurrencyConventerToEURTest() {
        XMLParser xmlParser = new XMLParser();
        Map<String, Currency> currencyMap = xmlParser.insertCurrencyIntoMap();
        double eur = CurrencyCalculatorApp.currencyConventer(175, currencyMap.get("EUR"), currencyMap.get("EUR"));
        double eurExpected = 175;
        assertEquals(eur, eurExpected);
        double eur1 = CurrencyCalculatorApp.currencyConventer(15, currencyMap.get("EUR"), currencyMap.get("EUR"));
        double eurExpected1 = 15;
        assertEquals(eur1, eurExpected1);
    }

    @Test
    public void anyCurrencyConverterTest() {
        XMLParser xmlParser = new XMLParser();
        Map<String, Currency> currencyMap = xmlParser.insertCurrencyIntoMap();

        double usd75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("USD"),
                currencyMap.get("JPY"));
        double expected = 10260.79;
        assertEquals(expected, usd75);
        double bgn75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("BGN"),
                currencyMap.get("CZK"));
        double expected1 = 942.39;
        assertEquals(expected1, bgn75);
        double dkk75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("DKK"),
                currencyMap.get("GBP"));
        double expected2 = 8.48;
        assertEquals(expected2, dkk75);
        double huf75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("HUF"),
                currencyMap.get("PLN"));
        double expected3 = 0.89;
        assertEquals(expected3, huf75);
        double ron75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("RON"),
                currencyMap.get("SEK"));
        double expected4 = 158.93;
        assertEquals(expected4, ron75);
        double chf75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("CHF"),
                currencyMap.get("ISK"));
        double expected5 = 10680.28;
        assertEquals(expected5, chf75);
        double nok75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("NOK"),
                currencyMap.get("HRK"));
        double expected6 = 56.61;
        assertEquals(expected6, nok75);
        double try75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("TRY"),
                currencyMap.get("AUD"));
        double expected7 = 6.03;
        assertEquals(expected7, try75);
        double brl75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("BRL"),
                currencyMap.get("CAD"));
        double expected8 = 18.11;
        assertEquals(expected8, brl75);
        double cny75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("CNY"),
                currencyMap.get("HKD"));
        double expected9 = 87.21;
        assertEquals(expected9, cny75);
        double idr75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("IDR"),
                currencyMap.get("ILS"));
        double expected10 = 0.02;
        assertEquals(expected10, idr75);
        double inr75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("INR"),
                currencyMap.get("KRW"));
        double expected11 = 1233.12;
        assertEquals(expected11, inr75);
        double mxn75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("MXN"),
                currencyMap.get("MYR"));
        double expected12 = 16.36;
        assertEquals(expected12, mxn75);
        double nzd75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("NZD"),
                currencyMap.get("PHP"));
        double expected13 = 2596.67;
        assertEquals(expected13, nzd75);
        double sgd75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("SGD"),
                currencyMap.get("THB"));
        double expected14 = 1991.06;
        assertEquals(expected14, sgd75);
        double zar75 = CurrencyCalculatorApp.currencyConventer(75, currencyMap.get("ZAR"),
                currencyMap.get("USD"));
        double expected15 = 4.44;
        assertEquals(expected15, zar75);
    }

}
