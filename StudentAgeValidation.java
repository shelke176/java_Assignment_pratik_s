import java.util.Scanner;
class AgeNotWithinRangeException extends Exception { AgeNotWithinRangeException(){super("Age Not Within The Range");} }
class StudentRecord { int rollNo;String name;int age;StudentRecord(int r,String n,int a)throws AgeNotWithinRangeException{if(a<15||a>21)throw new AgeNotWithinRangeException();rollNo=r;name=n;age=a;}void show(){System.out.println(rollNo+" | "+name+" | "+age);} }
public class StudentAgeValidation { public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Roll number: ");int r=s.nextInt();s.nextLine();System.out.print("Name: ");String n=s.nextLine();System.out.print("Age: ");int age=s.nextInt();try{new StudentRecord(r,n,age).show();}catch(AgeNotWithinRangeException e){System.out.println(e.getMessage());}s.close();} }
