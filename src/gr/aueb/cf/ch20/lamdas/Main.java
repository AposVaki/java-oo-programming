package gr.aueb.cf.ch20.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    private static final List<Product> products = Arrays.asList(
            new Product(1L,"Oranges", 1,4),
            new Product(2L, "Laptops", 1500,14),
            new Product(3L, "Apples",1.23,60),
            new Product(4L, "Keyboards", 10,4)
    );

    public static void main(String[] args) {
        List<Product> filteredProducts = getFilteredProducts(products, product -> product.getTitle().equals("Oranges"));
        System.out.println(filteredProducts);

        List<Product> filteredProducts2 = getFilteredProducts(products, product -> product.getPrice() >= 5);
        System.out.println(filteredProducts2);

        List<Product> filteredProducts3 = getFilteredProducts(products, product -> product.getQuantity() <= 14);
        System.out.println(filteredProducts3);
    }

    public static List<Product> getFilteredProducts(List<Product> products, Predicate<Product> filter) {
        List<Product> productsToReturn = new ArrayList<>();
        for(Product product : products) {
            if (filter.test(product)){
                productsToReturn.add(product);
            }
        }
        return productsToReturn;
    }
}
