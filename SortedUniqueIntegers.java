import java.util.*;
public class SortedUniqueIntegers { public static void main(String[] a){Scanner s=new Scanner(System.in);TreeSet<Integer> values=new TreeSet<>();System.out.print("Number of integers: ");int n=s.nextInt();for(int i=0;i<n;i++)values.add(s.nextInt());System.out.println("Sorted collection (duplicates rejected): "+values);s.close();} }
