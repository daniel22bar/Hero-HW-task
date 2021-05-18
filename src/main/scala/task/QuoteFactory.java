package task;

import org.fluttercode.datafactory.impl.DataFactory;

import javax.xml.crypto.Data;

public class QuoteFactory {
    private DataFactory dataFactory = new DataFactory();
    public String randomQuote(){
        return dataFactory.getRandomText(40);
    }
}
