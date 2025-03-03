import java.awt.*;

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
        Color color = new Color(0xC5, 0x99, 0xB6);
        g.setColor(color);
        g.drawString("Saludos Programas!!!", 100, 100);
    }
    
    public static void main(String[] args) {
        Dibujo dibujo = new Dibujo();
        dibujo.resize(500, 500);
        dibujo.show();
    }
}