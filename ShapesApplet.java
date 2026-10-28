import java.applet.Applet;import java.awt.Graphics;
@SuppressWarnings("removal") public class ShapesApplet extends Applet { public void paint(Graphics g){g.drawRect(40,40,160,90);g.drawOval(240,40,160,90);g.drawString("Rectangle",90,150);g.drawString("Oval",300,150);} }
