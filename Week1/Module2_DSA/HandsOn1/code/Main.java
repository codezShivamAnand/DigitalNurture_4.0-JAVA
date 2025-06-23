import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shoes", "Fashion"),
            new Product(309, "Watch", "Accessories"),
            new Product(115, "Phone", "Electronics"),
            new Product(410, "Bag", "Fashion")
        };

        // --- Linear Search ---
        System.out.println("Linear Search:");
        Product result1 = SearchUtil.linearSearch(products, "Phone");
        System.out.println(result1 != null ? result1 : "Product not found");

        // --- Binary Search (requires sorted array by productName) ---
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\nBinary Search:");
        Product result2 = SearchUtil.binarySearch(products, "Phone");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
