import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class XMLParser {

    private static NodeList currencyList;

    private static void fileParser() {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("currency.xml"));
            document.getDocumentElement().normalize();
            currencyList = document.getElementsByTagName("Cube");

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Currency> insertCurrencyIntoMap() {
        fileParser();
        Map<String, Currency> currencyMap = new HashMap<>();
        for (int i = 2; i < currencyList.getLength(); i++) {
            Node currencyNode = currencyList.item(i);
            if (currencyNode.getNodeType() == Node.ELEMENT_NODE) {
                Element currencyName = (Element) currencyNode;
                Element rate = (Element) currencyNode;
                String currName = currencyName.getAttribute("currency");
                String rateString = rate.getAttribute("rate");
                double rateCurrency = Double.parseDouble(rateString);
                Currency currency = new Currency(currName, rateCurrency);
                currencyMap.put(currency.getCurrencyName(), currency);
            }
            currencyMap.put("EUR", new Currency("EUR", 1));
        }
        return currencyMap;
    }
}
