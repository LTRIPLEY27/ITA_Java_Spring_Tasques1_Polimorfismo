package Actividad1_Vehiculo.Vehiculo;
/*
* @utor: Isabel Calzadilla
* activity: Ejercicio 1 Exercici 1. Crea una classe Vehicle amb un constructor i un mètode anomenat iniciar(), que es invocat pel main() (aquest mètode pot estar en la mateixa classe o en una classe apart) . Demostra la seqüència d'execució dels mètodes de la classe (per exemple, enviant un missatge a la consola).
* */
public class Vehiculo {
    private int doors;
    private double heigth;
    private String colour;
    private int seats;
    private static int MOTOR = 300;//atributo estático
    private static final int SPEED = 200;//CONSTANTE CON CAMPO FINAL, SERÁ LA VELOCIDAD INVARIABLE DEL COCHE

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

    ////BLOQUE DE INICIALIZACION, SE EJECUTARÁ INMEDIATAMENTE
    {
        System.out.println("Bloque de inicialización de la clase, se jecutará luego del llamado al constructor");
        System.out.println("La suma de 1 + 1 no necesariamente es siempre " + (1 + 1));
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

    // MÉTODO ESTÁTICO
    public static void parar(){
       System.out.println("El coche actualmente está averiado, por lo cual, su estado es de parado");
    }

    //MÉTODO NO ESTÁTICO
    public void acelerar(){
        System.out.println("El coche actualmente está en una aceleración de " + SPEED + " Kilometros por hora");
    }

    @Override
    public String toString() {
       //SPEED = 500;  // LA VARIABLE DECLARADA COMO FINAL ES INVARIABLE, NO SE PUEDE REASIGNAR SU VALOR
       MOTOR = 200; // LA VARIABLE DECLARADA COMO STATIC SI ES MUTABLE, SE LE PUEDE REASIGNAR SU VALOR, EL ATRIBUTO "STATIC" LA DEFINE COMO UN CONTEXTO GENERAL
        return "Las características del coche son :" +
                "\ndoors=" + doors +
                "\nheigth=" + heigth +
                "\ncolour=" + colour +
                "\nMOTOR=" + (MOTOR + 300);
    }
}
