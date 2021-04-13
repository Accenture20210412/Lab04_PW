package fm.product;

import fm.product.factories.Factory;
import fm.product.products.BrowserHandler;

import java.util.List;

public class BrowserAnalyzer {

    public void analyze(List<String> urls, Factory factory) {

        BrowserHandler browserHandler = factory.createBrowserFactory();
        int time = browserHandler.openPages(urls);
        System.out.printf("%s, time: %ds.%n", browserHandler.getName(), time);

    }

}
