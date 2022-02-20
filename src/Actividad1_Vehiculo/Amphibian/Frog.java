package Actividad1_Vehiculo.Amphibian;

public class Frog extends Amphibian{
    public Frog(int extremidades, String color){
        super(extremidades, color);
    }

    public void saltar(){
        System.out.println("Saltando");
    }

    public void comer(){
        System.out.println("Comiendo ALGAS");
    }

    public void respirar(){
        System.out.println("Respirando DOS");
    }

    public void mover(){
        System.out.println("Moviendo CROC");
    }
}
