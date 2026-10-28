import java.util.Scanner;

public class Person {
    int pid;
    String pname;
    int age;
    String gender;

    Person() {
        this.pid = 0;
        this.pname = "";
        this.age = 0;
        this.gender = "";
    }

    Person(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.println("Person ID: " + this.pid);
        System.out.println("Name: " + this.pname);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Enter details of person " + (i + 1) + ":");

            System.out.print("Person ID: ");
            int pid = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String pname = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            people[i] = new Person(pid, pname, age, gender);
        }

        System.out.println("\nPerson Details:");
        for (Person person : people) {
            person.display();
            System.out.println();
        }
        sc.close();
    }
}
