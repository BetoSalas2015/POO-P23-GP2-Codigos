import java.awt.*;
import java.awt.geom.*;

public class Dibujo extends Frame {

    public Dibujo() {
        super("Objetos Gráficos");
    }

    public boolean handleEvent(Event e) {
        if (e.id == Event.WINDOW_DESTROY) {
            hide();
            dispose();
            return true;
        }
        return super.handleEvent(e);
    }
    
    public void paint( Graphics g) {
        Graphics2D gc2d = (Graphics2D) g;
        Color color = new Color(50, 26, 94);
        gc2d.setColor(Color.BLACK);
        gc2d.setBackground(Color.black);
        gc2d.clearRect(0, 0, getWidth(), getHeight());
        gc2d.setStroke(new BasicStroke(4.0f));
        gc2d.setColor(Color.GRAY);
        gc2d.fill( new Arc2D.Float(68, 68, 170, 179, 35, 280, Arc2D.PIE) );
        gc2d.setPaint(new GradientPaint(145, 180, Color.YELLOW, 
                                        50, 50, Color.LIGHT_GRAY, true));
        gc2d.fill( new Arc2D.Float(70, 70, 175, 175, 35, 280, Arc2D.PIE) );
        gc2d.fill( new Arc2D.Float(70, 70, 175, 175, 35, 200, Arc2D.PIE) );
        gc2d.setColor(color);
        gc2d.fill(new Ellipse2D.Float(140,110,18,18));
        gc2d.setPaint(new GradientPaint(200, 100, new Color(232,214,19), 
                                        230, 160, Color.YELLOW, true));
        gc2d.fill(new Ellipse2D.Float(200, 145, 30, 30));
        gc2d.fill(new Ellipse2D.Float(270, 145, 30, 30));
        gc2d.fill(new Ellipse2D.Float(340, 145, 30, 30));

        /*Color color = new Color(255, 255, 0);
        Font f = new Font("Arial", Font.ITALIC + Font.BOLD, 18);
        g.setColor(Color.BLUE);
        g.setFont(f);
        g.drawString("Saludos Programas!!!", 100, 100);

        g.setColor(Color.magenta);
        g.drawLine(50, 90, 120, 130);
        g.fillRoundRect(200, 200, 90, 40, 25, 25);
        g.setColor(Color.pink);
        g.fillOval(50, 150, 90, 90);
        g.fillArc(250, 100, 100, 50, 0, 180);

        Color color = new Color(50, 26, 94);
        g.setColor(Color.black);
        g.fillRect(0,0,getWidth(), getHeight());
        g.setColor(Color.yellow);
        g.fillArc(70, 70, 175, 175, 35, 280);
        g.setColor(color);
        g.fillOval(140, 110, 18, 18);
        g.setColor(new Color(232, 214, 19));
        g.fillOval(200, 145, 30, 30); 
        g.fillOval(270, 145, 30, 30);
        g.fillOval(340, 145, 30, 30);*/

    }
    
    public static void main(String[] args) {
        Dibujo dibujo = new Dibujo();
        dibujo.resize(500, 350);
        dibujo.show();
    }
}