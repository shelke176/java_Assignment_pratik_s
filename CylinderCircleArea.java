import java.util.Scanner;
class CircleBase { protected double r; CircleBase(double r){this.r=r;} double area(){return Math.PI*r*r;} }
class Cylinder extends CircleBase { private double h; Cylinder(double r,double h){super(r);this.h=h;} double surfaceArea(){return 2*super.area()+2*Math.PI*r*h;} }
public class CylinderCircleArea { public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Radius: ");double r=s.nextDouble();System.out.print("Cylinder height: ");double h=s.nextDouble();System.out.println("Circle area: "+new CircleBase(r).area());System.out.println("Cylinder total surface area: "+new Cylinder(r,h).surfaceArea());s.close();} }
