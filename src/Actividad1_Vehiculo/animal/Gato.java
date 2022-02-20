package Actividad1_Vehiculo.animal;

public class Gato extends Animal{

    public Gato(String especie, int patas, String nombre){
        super(especie, patas, nombre);
    }

    public void correr(){
        System.out.println("El gato promedio es rápido");
    }
}
