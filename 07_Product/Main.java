
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Creazione primo prodotto
        System.out.println("Inserisci nome primo prodotto:");
        String name1 = in.nextLine();

        System.out.println("Inserisci prezzo primo prodotto:");
        double price1 = in.nextDouble();

        in.nextLine();

        // Creazione secondo prodotto
        System.out.println("Inserisci nome secondo prodotto:");
        String name2 = in.nextLine();

        System.out.println("Inserisci prezzo secondo prodotto:");
        double price2 = in.nextDouble();

        // Creazione oggetti
        Product p1 = new Product(name1, price1);
        Product p2 = new Product(name2, price2);

        // Stampa prodotti in ordine decrescente
        System.out.println("\nProdotti in ordine decrescente:");

        if (p1.getPrice() >= p2.getPrice()) {
            System.out.println(p1.getName() + " - " + p1.getPrice() + " euro");
            System.out.println(p2.getName() + " - " + p2.getPrice() + " euro");
        } else {
            System.out.println(p2.getName() + " - " + p2.getPrice() + " euro");
            System.out.println(p1.getName() + " - " + p1.getPrice() + " euro");
        }

        // Inserimento percentuale di sconto
        System.out.println("\nInserisci la percentuale di sconto:");
        double sconto = in.nextDouble();

        // Applicazione sconto al prodotto più caro
        if (p1.getPrice() >= p2.getPrice()) {
            p1.reducePrice(sconto);
        } else {
            p2.reducePrice(sconto);
        }

        // Nuova stampa in ordine decrescente
        System.out.println("\nProdotti dopo lo sconto:");

        if (p1.getPrice() >= p2.getPrice()) {
            System.out.println(p1.getName() + " - " + p1.getPrice() + " euro");
            System.out.println(p2.getName() + " - " + p2.getPrice() + " euro");
        } else {
            System.out.println(p2.getName() + " - " + p2.getPrice() + " euro");
            System.out.println(p1.getName() + " - " + p1.getPrice() + " euro");
        }

        in.close();
    }
}
