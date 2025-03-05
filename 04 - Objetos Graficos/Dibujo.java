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
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString("Saludos Programas!!!", 100, 100);


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