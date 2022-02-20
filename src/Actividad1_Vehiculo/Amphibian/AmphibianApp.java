package Actividad1_Vehiculo.Amphibian;

public class AmphibianApp {
        public static void main(String[] args) {
            Amphibian amp = new Frog(4, "verde");
            amp.comer();
            amp.mover();
            amp.respirar();
            //amp.saltar(); // MÉTODO QUE PRODUCE EL ERROR YA QUE NO SE PUEDE HACER USO DE LA GENERALIZACION
        }
    }
}
