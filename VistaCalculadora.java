import java.awt.event.ActionListener;
import javax.swing.*;
public class VistaCalculadora extends JFrame{
    private JTextField primerNumero  = new JTextField(10);
    private JLabel etiquetaSuma = new JLabel("+");
    private JTextField segundoNumero = new JTextField(10);
    private JButton botonCalcular = new JButton("Calcular");
    private JTextField solucion = new JTextField(10);

    VistaCalculadora(){
        JPanel panel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        panel.add(primerNumero);
        panel.add(etiquetaSuma);
        panel.add(segundoNumero);
        panel.add(botonCalcular);
        panel.add(solucion);
        this.add(panel);
    }

    public int getPrimerNumero(){
        return Integer.parseInt(primerNumero.getText());
    }

    public int getSegundoNumero(){
        return Integer.parseInt(segundoNumero.getText());
    }

    public int getSolucion(){
        return Integer.parseInt(solucion.getText());
    }

    public void setSolucion(int solution){
        solucion.setText(Integer.toString(solution));
    }
    void addCalculateListener(ActionListener listenForCalcButton){
        botonCalcular.addActionListener(listenForCalcButton);
    }
    void mensajeError(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
