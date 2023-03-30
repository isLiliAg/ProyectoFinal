package herencia.pasteleria;

public class Pastel {


     private String Sabor;
     private double Precio;

     public Pastel(String sabor, double precio) {

          this.Precio = precio;
     }

     public Pastel(String sabor) {
          this.Sabor= sabor;
     }

     public String Pastel(String sabor){
          return sabor;
     }
     public Pastel() {

         this("vainilla");
     }


     public void setSabor(String sabor) {
          Sabor = sabor;
     }

     public void setPrecio(Double precio) {
          Precio = precio;
     }

     public String getSabor() {

          return this.Sabor;
     }

     public Double getPrecio() {
          return Precio;
     }

     public void setPrecio(double precio) {
          Precio = precio;
     }



}




