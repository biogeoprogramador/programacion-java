package JavaSwing.SumarApp;

// Crea una clase en JAVA Swing que reciba dos enteros en dos JTextField y
// muestre en un JLabel el resultado de sumar ambos enteros. Se debe comprobar
// si el contenido introducido en ambas cajas de texto se corresponde con un
// entero válido.

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SumarApp {

    // Atributos
    private int num1;
    private int num2;
    private int resul;

    // Atributos de GUI
    private final JFrame ventana;
    private JTextField input1;
    private JTextField input2;
    private final JButton btnSum;
    private JLabel resultado;
    private final ImageIcon icono;
    private final Font fuente = new Font("SansSerif", Font.BOLD, 24);

    // GUI
    public SumarApp() {

        ventana = new JFrame("Aplicación Sumar");
        ventana.setSize(460, 210);
        ventana.setLayout(new GridLayout());
        icono = new ImageIcon("JavaSwing/SumarApp/icon.png");

        ventana.setIconImage(icono.getImage());
        // fuente=new Font("fuente",Font.SANS_SERIF,16);
        input1 = new JTextField("0");
        input1.setHorizontalAlignment(JTextField.CENTER);
        input1.setFont(fuente);
        input1.setBackground(Color.DARK_GRAY);
        input1.setForeground(Color.WHITE);

        input2 = new JTextField("0");
        input2.setHorizontalAlignment(JTextField.CENTER);
        input2.setFont(fuente);
        input2.setBackground(Color.DARK_GRAY);
        input2.setForeground(Color.WHITE);

        btnSum = new JButton("Sumar");
        btnSum.setFont(fuente);
        btnSum.setBackground(Color.GRAY);
        btnSum.setForeground(Color.WHITE);

        resultado = new JLabel();
        resultado.setHorizontalAlignment(JLabel.CENTER);
        resultado.setFont(fuente);
        resultado.setBackground(Color.DARK_GRAY);
        resultado.setForeground(Color.WHITE);
        resultado.setOpaque(true);

        ventana.add(input1);
        ventana.add(input2);
        ventana.add(btnSum);
        ventana.add(resultado);

        btnSum.addActionListener(e -> {
            try {
                setNum1(Integer.parseInt(input1.getText()));
                setNum2(Integer.parseInt(input2.getText()));
                setResul(sumar(getNum1(), getNum2()));
                resultado.setText(String.valueOf(getResul()));
                resultado.setBackground(new Color(8, 142, 28));
            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(null, "Debes introducir números enteros", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                resultado.setBackground(Color.RED);
            }
        });

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

    // setters y getters
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setResul(int resul) {
        this.resul = resul;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getResul() {
        return resul;
    }

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        new SumarApp();
    }
}
