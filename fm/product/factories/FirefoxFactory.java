package fm.product.factories;

import fm.product.products.BrowserHandler;
import fm.product.products.FirefoxHandler;

public class FirefoxFactory implements Factory{

    @Override
    public BrowserHandler createBrowserFactory() {
        return new FirefoxHandler();
    }
}
