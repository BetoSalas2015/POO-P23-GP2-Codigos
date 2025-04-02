import java.awt.*;
import java.awt.event.*;

public class Calculadora extends Frame {
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Button btnMas, btnMenos, btnMult, btnDiv, btnPunto, btnIgual, btnC;
    private TextField txtDisplay;
    private Panel pnlDisplay, pnlTeclado;
    private double numero1, numero2, resultado;
    private char operacion;
    private boolean operando, punto;
    private String displayNum, sign;


    public Calculadora() {
        super("Calculadora"); 

        // Creación de Objetos
        btn0 = new Button("0");         btn1 = new Button("1");
        btn2 = new Button("2");         btn3 = new Button("3");
        btn4 = new Button("4");         btn5 = new Button("5");
        btn6 = new Button("6");         btn7 = new Button("7");
        btn8 = new Button("8");         btn9 = new Button("9");
        btnMas = new Button("+");       btnMenos = new Button("-");
        btnMult = new Button("*");      btnDiv = new Button("/");
        btnIgual = new Button("=");     btnPunto = new Button(".");
        btnC = new Button("C");

        txtDisplay = new TextField("0");

        pnlDisplay = new Panel();
        pnlTeclado = new Panel();

        // Organizar los páneles
        pnlTeclado.setLayout( new GridLayout(4, 4, 2, 2) );
        pnlTeclado.add(btn7);
        pnlTeclado.add(btn8);
        pnlTeclado.add(btn9);
        pnlTeclado.add(btnDiv);
        pnlTeclado.add(btn4);
        pnlTeclado.add(btn5);
        pnlTeclado.add(btn6);
        pnlTeclado.add(btnMult);
        pnlTeclado.add(btn1);
        pnlTeclado.add(btn2);
        pnlTeclado.add(btn3);
        pnlTeclado.add(btnMenos);
        pnlTeclado.add(btnIgual);
        pnlTeclado.add(btn0);
        pnlTeclado.add(btnPunto);
        pnlTeclado.add(btnMas);

        pnlDisplay.setLayout(new BorderLayout());
        pnlDisplay.add(txtDisplay,"Center");
        pnlDisplay.add(btnC, "East");

        add(pnlDisplay, "North");
        add(pnlTeclado, "Center");

        operando = punto = true;

        //  Declaración de source de eventos
        addWindowListener( new CierraVentana() );
        btn0.addActionListener( new BotonNumerico());
        btn1.addActionListener( new BotonNumerico());
        btn2.addActionListener( new BotonNumerico());
        btn3.addActionListener( new BotonNumerico());
        btn4.addActionListener( new BotonNumerico());
        btn5.addActionListener( new BotonNumerico());
        btn6.addActionListener( new BotonNumerico());
        btn7.addActionListener( new BotonNumerico());
        btn8.addActionListener( new BotonNumerico());
        btn9.addActionListener( new BotonNumerico());
        btnMas.addActionListener(new BotonOpera());
        btnMenos.addActionListener(new BotonOpera());
        btnMult.addActionListener(new BotonOpera());
        btnDiv.addActionListener(new BotonOpera());
        btnIgual.addActionListener(new BotonIgual());
        btnPunto.addActionListener(new BotonPunto());
        btnC.addActionListener( new BotonC() );

        // Mostrar Ventana
        setSize(300, 320);
        setVisible(true);
        txtDisplay.setEnabled(false);
        setResizable(false);
    }

    //  Clases internas de gestion de eventos
    private class CierraVentana extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
                setVisible(false);
                dispose();
        }  
    }
        
    private class BotonC implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtDisplay.setText("0");
            punto = operando = true;
            numero1 = numero2 = 0.0;
        }
    }

    private class BotonOpera implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (operando) {
                sign = new String(e.getActionCommand());
                operacion = sign.charAt(0);
                numero1 = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("0");
                operando = false;
                punto = true;
            }
        }
    }

    private class BotonPunto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (punto) {
                displayNum = new String(txtDisplay.getText());
                displayNum = displayNum + ".";
                txtDisplay.setText(displayNum);
                punto = false;
            }
        }        
    }

    private class BotonIgual implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            numero2 = Double.parseDouble(txtDisplay.getText());
            switch (operacion) {
                case '+': resultado = numero1 + numero2; break;
                case '-': resultado = numero1 - numero2; break;
                case '*': resultado = numero1 * numero2; break;
                case '/': resultado = numero1 / numero2; break;
            }
            txtDisplay.setText( String.valueOf(resultado) );
            operando = punto = true;
        }        
    }

    private class BotonNumerico implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            displayNum = new String(txtDisplay.getText());
            if (displayNum.equals("0")) {
                displayNum = "";
            }
            displayNum = displayNum + e.getActionCommand();
            txtDisplay.setText(displayNum);
        }        
    }

        
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
    }

}

