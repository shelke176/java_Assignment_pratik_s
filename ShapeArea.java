import java.util.Scanner;
interface MeasurableArea { double area(); }
class RoundShape implements MeasurableArea { private final double r; CircleShape(double r){this.r=r;} public double area(){return 3.142*r*r;} }
class BallShape implements MeasurableArea { private final double r; SphereShape(double r){this.r=r;} public double area(){return 4*3.142*r*r;} }
public class ShapeArea { public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Radius: ");double r=s.nextDouble();System.out.println("Circle area: "+new CircleShape(r).area());System.out.println("Sphere surface area: "+new SphereShape(r).area());s.close();} }
