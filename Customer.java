import java.util.Scanner;

public class Customer {
    int cid;
    String cname;
    double billAmount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        Customer[] customers = new Customer[n];

        for (int i = 0; i < n; i++) {
            customers[i] = new Customer();
            System.out.println("Enter details of customer " + (i + 1) + ":");

            System.out.print("Customer ID: ");
            customers[i].cid = sc.nextInt();
            sc.nextLine();

            System.out.print("Customer name: ");
            customers[i].cname = sc.nextLine();

            System.out.print("Bill amount: ");
            customers[i].billAmount = sc.nextDouble();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (customers[j].billAmount > customers[j + 1].billAmount) {
                    Customer temp = customers[j];
                    customers[j] = customers[j + 1];
                    customers[j + 1] = temp;
                }
            }
        }

        System.out.println("\nCustomers sorted by bill amount:");
        for (Customer customer : customers) {
            System.out.println("ID: " + customer.cid
                    + ", Name: " + customer.cname
                    + ", Bill Amount: " + customer.billAmount);
        }
        sc.close();
    }
}
