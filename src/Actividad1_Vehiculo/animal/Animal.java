package Actividad1_Vehiculo.animal;

public class Animal {
    private String especie;
    private int patas;
    private String nombre;
    private int velocidad;

    public Animal(){ //PRIMER CONSTRUCTOR POR DEFAULT
        this.especie = "";
        this.patas = 0;
        this.nombre = "";
    }

    public Animal(String especie){ //SEGUNDO CONSTRUCTOR CON 1 PARÁMETROS
        this.especie = especie;
    }

    public Animal(String especie, int patas, String nombre){ //TERCER CONSTRUCTOR CON 2 PARÁMETROS
        this.especie = especie;
        this.patas = patas;
        this.nombre = nombre;
    }

    public void correr(int velocity){
        this.velocidad = velocity;
        System.out.println(this.velocidad);
    }

    public void correr(int aceleracion, int velocity){
        this.velocidad = aceleracion * velocity;
        System.out.println(this.velocidad);
    }

    public  void correr(int aceleracion, int velocity, int edad){
        if(edad < 5){ // SI EL ANIMAL ES MENOR A 5 AÑOS SU VELOCIDAD SE MAXIMIZA
            this.velocidad = (aceleracion * velocity) * 2;
            System.out.println(this.velocidad);
        } else { // SI NO, SE REDUCE
            this.velocidad = (aceleracion * velocity) / 2;
            System.out.println(this.velocidad);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", patas=" + patas +
                ", nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
