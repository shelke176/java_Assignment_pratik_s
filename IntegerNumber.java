public class IntegerNumber {
    private int number;

    IntegerNumber(int number) {
        this.number = number;
    }

    int calculateSquare() {
        return number * number;
    }

    int calculateCube() {
        return number * number * number;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a number as a command line argument.");
            return;
        }

        int value = Integer.parseInt(args[0]);
        IntegerNumber obj = new IntegerNumber(value);

        System.out.println("Number: " + value);
        System.out.println("Square: " + obj.calculateSquare());
        System.out.println("Cube: " + obj.calculateCube());
    }
}
