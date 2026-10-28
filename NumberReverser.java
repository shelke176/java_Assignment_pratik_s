public class NumberReverser {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a number as a command line argument.");
            return;
        }

        long number = Long.parseLong(args[0]);
        long value = Math.abs(number);
        long reverse = 0;

        while (value > 0) {
            reverse = reverse * 10 + value % 10;
            value /= 10;
        }

        if (number < 0) {
            reverse = -reverse;
        }

        System.out.println("Reversed number: " + reverse);
    }
}
