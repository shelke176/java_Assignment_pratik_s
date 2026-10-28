import java.util.Scanner;
interface AreaShape { double area(); }
class RectangleShape implements AreaShape { protected double length,width; RectangleShape(double l,double w){length=l;width=w;} public double area(){return length*width;} }
class SquareShape extends RectangleShape { SquareShape(double side){super(side,side);} }
class CircleShape implements AreaShape { private double radius; CircleShape(double r){radius=r;} public double area(){return Math.PI*radius*radius;} }
public class ShapeInheritanceDemo { public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Rectangle length and width: ");RectangleShape r=new RectangleShape(s.nextDouble(),s.nextDouble());System.out.print("Square side: ");SquareShape q=new SquareShape(s.nextDouble());System.out.print("Circle radius: ");CircleShape c=new CircleShape(s.nextDouble());System.out.println("Rectangle: "+r.area()+" Square: "+q.area()+" Circle: "+c.area());s.close();} }
