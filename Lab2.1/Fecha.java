public class Fecha {
    
    private int dia = 12;
    private int mes = 2;
    private int year = 1980;
    
    // Setters
    public void setDia(int value){
        dia = value;
    }
    public void setMes(int value){
        
        mes = value;
    }
    public void setYear(int value){
        year = value;
    }
    
    // Getters
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getYear(){
        return year;
    }
    
    // reiniciar
    public void reiniciarFecha(){
        dia = 1;
        mes = 2;
        year = 1;
    }

    // Adelantar
    public void adelantar(int d, int m, int a) {
        

        int temporal_mes = mes + m;
        int temporal_a = year + a;
        int temporal_dia = dia + d;

        
        mes = temporal_mes;
        dia = temporal_dia;
        year = temporal_a;
        
        if(temporal_mes > 12){
            mes = m;
            year += 1;
        }
        
    }

    // Imprimir
    public void imprimirFecha(){
        System.out.println("" + dia + "/" + mes + "/" + year);
    }


}
