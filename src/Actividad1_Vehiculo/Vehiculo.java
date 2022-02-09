package Actividad1_Vehiculo;
/*
* @utor: Isabel Calzadilla
* activity: Ejercicio 1 Exercici 1. Crea una classe Vehicle amb un constructor i un mètode anomenat iniciar(), que es invocat pel main() (aquest mètode pot estar en la mateixa classe o en una classe apart) . Demostra la seqüència d'execució dels mètodes de la classe (per exemple, enviant un missatge a la consola).
* */
public class Vehiculo {
    private int doors;
    private double heigth;
    private String colour;
    private int seats;

   public Vehiculo(int doors, double heigth, String colour, int seats) {
        this.doors = doors;
        this.heigth = heigth;
        this.colour = colour;
        this.seats = seats;
    }
    //POR DEFAULT
    public Vehiculo(){
        this.doors = 0;
        this.heigth = 0.0;
        this.colour = "";
        this.seats = 0;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void iniciar(){
        System.out.println("El coche tiene " + this.seats + " asientos");
    }

    @Override
    public String toString() {
        return "Las características del coche son :" +
                "\ndoors=" + doors +
                "\nheigth=" + heigth +
                "\ncolour='" + colour;
    }
}
