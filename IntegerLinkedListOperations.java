import java.util.LinkedList;
public class IntegerLinkedListOperations { public static void main(String[] a){LinkedList<Integer> list=new LinkedList<>();list.addFirst(10);list.add(20);list.add(30);System.out.println("List: "+list);list.removeLast();System.out.println("After deleting last: "+list);System.out.println("Size: "+list.size());} }
