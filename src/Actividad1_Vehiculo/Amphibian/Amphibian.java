package Actividad1_Vehiculo.Amphibian;

public class Amphibian {
    private int extremidades;
    private String color;

    public Amphibian(int extremidades, String color){
        this.extremidades = extremidades;
        this.color = color;
    }

    public void comer(){
        System.out.println("Comiendo");
    }

    public void respirar(){
        System.out.println("Respirando");
    }

    public void mover(){
        System.out.println("Moviendo");
    }
}
