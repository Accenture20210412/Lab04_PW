package fm.product.products;

import fm.product.products.BrowserHandler;

import java.util.List;
import java.util.Random;

public class FirefoxHandler implements BrowserHandler {

	private static Random random = new Random();
	
	@Override
	public String getName() {
		return "Firefox";
	}


	@Override
	public int openPages(List<String> urls) {
		if (urls != null && urls.size() > 0) {
			return random.nextInt(15) + urls.size();
		} else {
			return 0;	
		}
	}

}
