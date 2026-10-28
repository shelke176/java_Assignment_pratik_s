import java.util.Scanner;
class NumberZeroException extends Exception { NumberZeroException(String m){super(m);} }
public class ZeroPrimeCheck { static boolean prime(int n){if(n<2)return false;for(int i=2;i<=n/i;i++)if(n%i==0)return false;return true;} public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Number: ");int n=s.nextInt();try{if(n==0)throw new NumberZeroException("Number is zero");System.out.println(prime(n)?"Prime":"Not prime");}catch(NumberZeroException e){System.out.println(e.getMessage());}s.close();} }
