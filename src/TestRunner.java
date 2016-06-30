import com.rahavoi.util.TextFileReader;

public class TestRunner {
	public static void main(String[] args){
		new TextFileReader().readFile("/home/irahavoi/workspace/SortableChallenge/src/listings.txt");
		new TextFileReader().readFile("/home/irahavoi/workspace/SortableChallenge/src/products.txt");
	}
}
