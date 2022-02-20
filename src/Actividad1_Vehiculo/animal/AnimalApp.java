package Actividad1_Vehiculo.animal;

public class AnimalApp {
    public static void main(String[] args){
        Animal animal = new Animal("felina", 4, "leopardo");
        System.out.println(animal.toString());
        animal.correr(15, 25, 6);

        Gato cat = new Gato("felina", 4, "khang mané");
        cat.correr();//MÉTODO SOBRECARAGADO Y PROPIO DE LA CLASE GATO
        cat.correr(15); //MÉTODO HEREDADO
        cat.correr(15, 25);//SEGUNDO MÉTODO HEREDADO
        cat.correr(15, 25,8);//TERCER MÉTODO HEREDADO
        System.out.println(cat.toString());

    }
}
