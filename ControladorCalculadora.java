import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalculadora {

    private VistaCalculadora vista;
    private ModeloCalculadora modelo;

    public ControladorCalculadora(VistaCalculadora vista, ModeloCalculadora modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int primeroNumero, segundoNumero = 0;
            try{
                primeroNumero = vista.getPrimerNumero();
                segundoNumero = vista.getSegundoNumero();
                modelo.addTwoNumbers(primeroNumero, segundoNumero);
                vista.setSolucion(modelo.getValorCalculado());
            }catch(NumberFormatException ex){
                System.out.println(ex);
                vista.mensajeError("Necesitas ingresar 2 enteros");
            }
        }
    }
}