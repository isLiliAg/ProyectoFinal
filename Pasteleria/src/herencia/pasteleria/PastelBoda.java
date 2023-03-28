package herencia.pasteleria;

public class PastelBoda extends Pastel{


    private int Niveles;

    public PastelBoda(String sabor, double precio, int niveles) {
        super(sabor, precio);
        Niveles = niveles;
    }

    public PastelBoda() {

    }

    public int getNiveles() {
        return Niveles;
    }

    public void setNiveles(int niveles) {
        Niveles = niveles;
    }
}
