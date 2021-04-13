package fm.product.products;

import java.util.List;

public interface BrowserHandler {

	public String getName();
	
	/**
	 * Returns time in seconds
	 * 
	 * @param urls
	 * @return
	 */
	public int openPages(List<String> urls);
}
