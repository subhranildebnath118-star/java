import java.util.Scanner;

class Item {
    int code;
    double price;

   
    void input(int c, double p) {
        code = c;
        price = p;
    }

   
    void display() {
        System.out.println(code + "\t" + price);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[5];
        double total = 0;

   
        for (int i = 0; i < 5; i++) {
            items[i] = new Item();

            System.out.print("Enter code for item " + (i + 1) + ": ");
            int code = sc.nextInt();

            System.out.print("Enter price for item " + (i + 1) + ": ");
            double price = sc.nextDouble();

            items[i].input(code, price);
            total += price;
        }

      
        System.out.println("\nCode\tPrice");
        System.out.println("----------------");

        for (int i = 0; i < 5; i++) {
            items[i].display();
        }


        System.out.println("----------------");
        System.out.println("Total Price = " + total);

   
    }
}