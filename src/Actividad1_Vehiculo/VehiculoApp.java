package Actividad1_Vehiculo;

import java.util.Scanner;

public class VehiculoApp {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Indique color: ");
        String color = ask.next();
        System.out.println("Indique cantidad de asientos : ");
        int asientos = ask.nextInt();
        System.out.println("Indique logitud");
        double longi = ask.nextDouble();
        System.out.println("Indique cantidad de puertas: ");
        int doors = ask.nextInt();
        Vehiculo vehiculo = new Vehiculo(doors, longi, color, asientos);

        System.out.println(vehiculo.toString());//LLAMA AL MÉTODO TOSTRING PARA IMPRIMIR TODOS LOS ATRIBUTOS DEL OBJETO
        vehiculo.iniciar();//LLAMADA AL MÉTODO INICIAR.
    }
}
