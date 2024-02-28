// Esto nos ayudara con todo lo que es una seleccion aleatoria.
import java.util.Random;

public class Persona {
    private Random valores = new Random();
    private String nombre;
    private int edad;
    private double alturaMetros;
    private double peso;
    private char sexo;

    private String[] hombresNombres = {
        "Hugo", "Martin", "Mateo", "Lucas", "Leo", "Daniel", "Alejandro",
        "Manuel", "Pablo", "Álvaro", "Enzo", "Adrian", "Mario", "Diego",
        "David", "Thiago", "Oliver", "Alex", "Bruno", "Marcos"
    };

    private String[] mujeresNombres = {
        "Lucía", "Sofía", "Martina", "Maria", "Julia", "Valeria", "Paula",
        "Emma", "Daniela", "Carla", "Alma", "Sara", "Carmen", "Alba",
        "Vega", "Noa", "Olivia", "Lara", "Mia", "Valentina"
    };
    // Constructor 1
    public Persona(String nombre,int edad, double alturaMetros, double peso, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.alturaMetros = alturaMetros;
        this.peso = peso;
        this.sexo = sexo;
    }

    // Constructor 2
    public Persona(){
        nombre = seleccionarNombreAleatorio(hombresNombres, mujeresNombres);
        sexo = seleccionarSexo(mujeresNombres, nombre);
        edad = valores.nextInt(18, 100);
        alturaMetros = valores.nextDouble(1,2);
        peso = valores.nextDouble(100,230);

    }


    public void desplegarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + alturaMetros);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
    }

    // Tomamos de aqui el nombre
    private static String seleccionarNombreAleatorio(String[] hombres, String[] mujeres) {
        Random random = new Random();

        /*
        * El metodo nextBoolean renorna un true o false, si es verdadero seleccionara un nombre de hombre
        * si es falso seleccionara un nombre de mujer 
        */
        boolean esHombre = random.nextBoolean();
        
        if (esHombre) {
            int index = random.nextInt(hombres.length);
            return hombres[index];
        } else {
            int index = random.nextInt(mujeres.length);
            return mujeres[index];
        }
    }

    private static char seleccionarSexo(String[] arreglo, String v) {
        /*
         * Recorremos cada elemento y hacemos uso del metodo equals para comparar si los valores son iguales
         */
        for (String elemento : arreglo) {
            if (elemento.equals(v)) {
                return 'F';
            }
        }
        return 'M';
    }
}
