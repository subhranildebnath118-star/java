import java.util.Scanner;

class Tender {
    double cost;
    String companyName;

   
    void input(String name, double c) {
        companyName = name;
        cost = c;
    }
}

public class TenderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender[] t = new Tender[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();

            System.out.print("Enter company name for tender " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter cost: ");
            double cost = sc.nextDouble();
            sc.nextLine(); // clear buffer

            t[i].input(name, cost);
        }
        double minCost = t[0].cost;
        String minCompany = t[0].companyName;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < minCost) {
                minCost = t[i].cost;
                minCompany = t[i].companyName;
            }
        }
        System.out.println("\nCompany with minimum cost: " + minCompany);
        System.out.println("Minimum Cost: " + minCost);

   
    }
}