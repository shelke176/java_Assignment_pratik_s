import java.util.*;
public class CityArrayList { public static void main(String[] a){Scanner s=new Scanner(System.in);ArrayList<String> cities=new ArrayList<>();System.out.print("Number of cities: ");int n=s.nextInt();s.nextLine();for(int i=0;i<n;i++){System.out.print("City: ");cities.add(s.nextLine());}cities.sort(String.CASE_INSENSITIVE_ORDER);System.out.println(cities);s.close();} }
