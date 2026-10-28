public class MyDate {
    int dd;
    int mm;
    int yy;

    MyDate() {
        this.dd = 1;
        this.mm = 1;
        this.yy = 2000;
    }

    MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    void displayDate() {
        System.out.printf("%02d-%02d-%02d%n", this.dd, this.mm, this.yy % 100);
    }

    public static void main(String[] args) {
        MyDate defaultDate = new MyDate();
        MyDate givenDate = new MyDate(25, 10, 2026);

        System.out.print("Default date: ");
        defaultDate.displayDate();
        System.out.print("Given date: ");
        givenDate.displayDate();
    }
}
