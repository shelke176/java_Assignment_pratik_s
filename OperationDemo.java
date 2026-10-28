import java.util.Scanner;
interface Operation { double PI=3.142; double area(); double volume(); }
class CircleOperation implements Operation { double r; CircleOperation(double r){this.r=r;} public double area(){return PI*r*r;} public double volume(){return 0;} }
class CylinderOperation implements Operation { double r,h; CylinderOperation(double r,double h){this.r=r;this.h=h;} public double area(){return 2*PI*r*(r+h);} public double volume(){return PI*r*r*h;} }
public class OperationDemo { public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Radius: ");double r=s.nextDouble();System.out.print("Height: ");double h=s.nextDouble();Operation c=new CircleOperation(r), cy=new CylinderOperation(r,h);System.out.println("Circle area: "+c.area());System.out.println("Cylinder area: "+cy.area()+" Volume: "+cy.volume());s.close();} }
