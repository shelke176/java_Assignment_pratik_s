import java.util.*;
public class FriendsLinkedList { public static void main(String[] a){Scanner s=new Scanner(System.in);LinkedList<String> friends=new LinkedList<>();System.out.print("Number of friends: ");int n=s.nextInt();s.nextLine();for(int i=0;i<n;i++){System.out.print("Name: ");friends.add(s.nextLine());}System.out.println(friends);s.close();} }
