public class ModeloCalculadora {
    private int valorCalculado;
    public void addTwoNumbers(int primeroNumero, int segundoNumero){
        valorCalculado = primeroNumero + segundoNumero;
    }

    public int getValorCalculado(){
        return valorCalculado;
    }
}