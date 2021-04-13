package fm.product;

import fm.product.factories.ChromeFactory;
import fm.product.factories.Factory;
import fm.product.factories.FirefoxFactory;
import fm.product.factories.OperaFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
        List<String> urls = Arrays.asList("google.pl", "altkom.pl", "github.com");

        Factory factory;
        int randBrowser = random.nextInt(3);
        switch (randBrowser) {
            case 0:
                factory = new ChromeFactory();
                break;
            case 1:
                factory = new FirefoxFactory();
                break;
            case 2:
                factory = new OperaFactory();
                break;
            default:
                factory = null;
        }

        BrowserAnalyzer browserAnalyzer = new BrowserAnalyzer();
        for (int i = 0; i < 5; i++) {
            browserAnalyzer.analyze(urls, factory);
        }
    }


}
