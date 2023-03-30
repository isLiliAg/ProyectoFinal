package herencia.pasteleria;

public class PastelFiestaCumple extends Pastel{


private double Velas;


    public PastelFiestaCumple(String sabor, double precio, double velas) {
        super(sabor, precio);
        Velas = velas;
    }

    public PastelFiestaCumple() {

        this.cumpleSabor("chocolate");

    }

    private void cumpleSabor(String chocolate) {
    }


    public double getVelas() {
        return Velas;
    }

    public void setVelas(double velas) {
        Velas = velas;
    }







}
