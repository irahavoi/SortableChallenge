import com.rahavoi.util.ProductHandler;
import com.rahavoi.util.TextFileReader;

public class TestRunner {
	public static void main(String[] args){
		//new TextFileReader().readFile("/home/irahavoi/workspace/SortableChallenge/src/listings.txt");
		ProductHandler productHandler = new ProductHandler();
		new TextFileReader()
			.readFile("/home/irahavoi/workspace/SortableChallenge/src/products.txt", productHandler);
		
		System.out.println("Got products: " + productHandler.getProducts().size());
	}
}
