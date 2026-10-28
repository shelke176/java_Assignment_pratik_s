import java.util.Scanner;
class InvalidDoctorNameException extends Exception { InvalidDoctorNameException(){super("Name is Invalid");} }
public class DoctorNameValidation { static void validate(String name)throws InvalidDoctorNameException{if(!name.matches("[A-Za-z ]+"))throw new InvalidDoctorNameException();}public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Doctor name: ");String n=s.nextLine();try{validate(n);System.out.println("Valid name: "+n);}catch(InvalidDoctorNameException e){System.out.println(e.getMessage());}s.close();} }
