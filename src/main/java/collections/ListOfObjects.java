package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListOfObjects {
    List<Product> products = new ArrayList<>();

    ListOfObjects() {
        products.add(new Product("copy", 10, "1"));
        products.add(new Product("pen", 8, "2"));
        products.add(new Product("pencil", 4, "3"));
        products.add(new Product("bag", 30, "4"));
        products.add(new Product("eraser", 1, "5"));
    }

    public void filterProducts(int price) {
        List<String> filteredProducts = products
                .stream()
                .filter((p) -> p.getPrice() > price)
                .map((p) -> p.getName())
                .collect(Collectors.toList());
        printStrings(filteredProducts);

        Set<String> names = products.stream().map((p) -> p.getName()).collect(Collectors.toSet());
//        printStrings(names);
    }

    public void begin() {
        print(products);
    }

    public static void main(String[] args) {
        ListOfObjects self = new ListOfObjects();
        self.filterProducts(4);
//        self.begin();
    }

    public void print(Collection<Product> products) {
        for (Product p : products) {
            System.out.println(p);
        }
    }
    public void printStrings(Collection<String> items){
        for(String s: items){
            System.out.println(s);
        }
    }
}

class Product {
    private String name;
    private int price;
    private String id;

    public Product(String name, int price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }
}