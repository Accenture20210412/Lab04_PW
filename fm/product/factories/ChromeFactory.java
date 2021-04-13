package fm.product.factories;

import fm.product.factories.Factory;
import fm.product.products.BrowserHandler;
import fm.product.products.ChromeHandler;

public class ChromeFactory implements Factory {


    @Override
    public BrowserHandler createBrowserFactory() {
        return new ChromeHandler();
    }
}
