import java.util.Scanner;

public class FechaTest{

    /*
     * Esta funcion estatica se encargara de pedir los datos y como parametro tiene maxValue, 
     * este numero sera el que usaremos para prevenir
     * que se entren valores mayores a nuestros limites
     */
    static int pedirDatos(int maxValue,String n){
        // int valor = 0;
        Scanner datos = new Scanner(System.in);

        while (true) {
            // Un try catch para prevenir que el programa cierre
            try {
                System.out.print("Agregar cantidad de "+ n+ " valor menor o igual a " + maxValue + ": ");
                int valor = datos.nextInt();
                // Verificamos que el valor sea mayor o igual a nuestro maximo valor (si son dias 31 seria el maximo)
                if (valor <= maxValue && valor > 0) {
                    return valor;
                } else{
                    System.out.println("Valor no puede ser mayor a " + maxValue + " ni menor a 1.");
                    System.out.println("Valor ingresado: " + valor);
                }
                datos.close();
            } catch (Exception e) {
                System.out.println("Valor incorrecto, agregar numero entero.");
            }

            
        }
    }
    public static void main(String[] args) {
        Fecha f = new Fecha();
        int cantidadDias = pedirDatos(31,"dias");
        int cantidadMeses = pedirDatos(12,"meses");
        int cantidadYear = pedirDatos(9999,"años");

        f.setDia(cantidadDias);
        f.setMes(cantidadMeses);
        f.setYear(cantidadYear);

        System.out.println("Fecha registrada: ");
        f.imprimirFecha();
        
        int d = 1;
        int m = 3;
        int a = 1;
        System.out.println("Adelantada en " + d + " dia(s), " + m + " mes(es)" + " y " + a + " año(s).");
        f.adelantar(d, m, a);
        f.imprimirFecha();
        
        System.out.println("Reiniciada: ");
        f.reiniciarFecha();
        f.imprimirFecha();

    }
}