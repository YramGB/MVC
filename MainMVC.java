public class MainMVC {
    public static void main(String[] args) {
        VistaCalculadora vista = new VistaCalculadora();
        ModeloCalculadora modelo = new ModeloCalculadora();
        ControladorCalculadora control = new ControladorCalculadora(vista,modelo);
        vista.setVisible(true);

    }
}