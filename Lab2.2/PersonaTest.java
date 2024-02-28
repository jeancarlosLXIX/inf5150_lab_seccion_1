public class PersonaTest {
    public static void main(String[] args) {
        
        Persona[] personas = new Persona[10];
        Persona[] personasManual = new Persona[10];

        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona();
        }
        int contador = 1;

        for (Persona persona : personas) {
            System.out.println("Persona aleatoria #" + contador);
            persona.desplegarPersona();
            System.out.println("\n*************************************\n");
            contador += 1;
        }

        contador = 1;
        personasManual[0] = new Persona("Jean Carlos",27,1.80d,150d,'M');
        personasManual[1] = new Persona("Jessica",18,1.35d,100d,'F');
        personasManual[2] = new Persona("Altagracia",57,1.30d,180d,'F');
        personasManual[3] = new Persona("Amaury",45,1.75d,230d,'M');
        personasManual[4] = new Persona("Yoselyn",45,1.74d,235,'F');
        personasManual[5] = new Persona("Katheryn",34,1.50d,201.5d,'F');
        personasManual[6] = new Persona("Franyelis",25,1.75d,150d,'F');
        personasManual[7] = new Persona("Martin",96,2,198d,'M');
        personasManual[8] = new Persona("Julio",54,1.65,135d,'M');
        personasManual[9] = new Persona("Juliana",74,1.60d,175d,'F');
        for (Persona persona : personasManual) {
            System.out.println("Persona registrada manualmente #" + contador);
            persona.desplegarPersona();
            System.out.println("\n*************************************\n");
            contador += 1;
        }
    }
}
