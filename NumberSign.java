import java.util.Scanner;
interface IntegerCheck { void check(); }
public class NumberSign implements IntegerCheck { private int number; NumberSign(int n){number=n;} public void check(){if(number>0)System.out.println("Positive");else if(number<0)System.out.println("Negative");else System.out.println("Zero");} public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Enter integer: ");new NumberSign(s.nextInt()).check();s.close();} }
