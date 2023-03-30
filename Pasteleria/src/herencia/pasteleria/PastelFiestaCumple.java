package herencia.pasteleria;

public class PastelFiestaCumple extends Pastel{


private double Velas;


    public PastelFiestaCumple(String sabor, double precio, double velas) {
        super(sabor, precio);
        Velas = velas;
    }

    public PastelFiestaCumple() {


    }

    public PastelFiestaCumple(String chocolate) {
    }

    public double getVelas() {
        return Velas;
    }

    public void setVelas(double velas) {
        Velas = velas;
    }


    public void cumpleSabor(String sabor){
        System.out.println(sabor);
    }





}
