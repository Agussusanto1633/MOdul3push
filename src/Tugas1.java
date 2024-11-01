import java.util.ArrayList;
import java.util.Scanner;

class MenuItem {

    String name;
    double price;
    int quantity;

    MenuItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }

    public class Tugas1 {
        private static final ArrayList<MenuItem> orderList = new ArrayList<>();
        private static final Scanner scanner = new Scanner(System.in);

        

            printReceipt();
        }

        private static void printReceipt() {
            System.out.println("\n=== Nota Pemesanan ===");
            double totalCost = 0;

            for (MenuItem item : orderList) {
                double itemTotal = item.getTotalPrice();
                System.out.printf("%s (x%d) - Rp%.2f\n", item.name, item.quantity, itemTotal);
                totalCost += itemTotal;
            }

            System.out.printf("\nTotal Pembayaran: Rp%.2f\n", totalCost);
            System.out.println("Terima kasih telah memesan di Restoran Kami!");
            System.out.println();
        }
    }
}

