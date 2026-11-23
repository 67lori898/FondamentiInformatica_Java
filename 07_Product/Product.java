


public class Product {

    // Attributi
    String name;
    double price;

    // Costruttore
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    // Metodo per ridurre il prezzo
    public void reducePrice(double rate) {
        this.price = this.price - rate;
    }
}
