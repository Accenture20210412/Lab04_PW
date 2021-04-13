package fm.product.factories;

import fm.product.products.BrowserHandler;
import fm.product.products.OperaHandler;

public class OperaFactory implements Factory{
    @Override
    public BrowserHandler createBrowserFactory() {
        return new OperaHandler();
    }
}
