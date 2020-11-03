public class Taladro {
    
    // Marca del taladro
    private String marcaTaladro;
    // Potencia del taladro
    private int potenciaTaladro;
    // Automatica o manual
    private boolean manual;


    public Taladro(String marcaDelTaladro, int potenciaDelTaladro) {
        marcaTaladro = marcaDelTaladro;
        potenciaTaladro = potenciaDelTaladro;
        manual = true;
    }
    
    
    //Metodo getter que nos devuelve el nombre del taladro
    public String getMarcaDelTaladro() {
        return marcaTaladro;
    }
    
    //Metodo getter que nos devuelve la potencia del taladro
    public int getPotenciaDelTaladro() {
        return potenciaTaladro;
    }
    
    //Metodo getter que nos devuelve el booleano del taladro
    public boolean getManual() {
        return manual;
    }


    //Metodo setter para cambiar el valor del primer atributo
    public void setMarcaTaladro(String marcaDelTaladro) {
        marcaTaladro = marcaDelTaladro;
    }
    
    
    //Metodo modificador del segundo atributo del taladro
    public void Potencia(int potenciaDelTaladro) {
        potenciaTaladro = potenciaTaladro + potenciaDelTaladro;    
    }
    
    
    //Metodo modificador del boleano del taladro
    public void setCambiarBoolean() {
        if (manual == true){
            manual = false; 
        }
        else {
            manual = true; 
        }
           
    }
    
    
    //Metodo para imprimir por pantalla el estado del taladro
    public void imprimeEstadoDelTaladro() {
        System.out.println("##################");
        System.out.println("Marca del taladro: "+ marcaTaladro +" Potencia del taladro: "+ potenciaTaladro +" Es manual: " + manual);
        System.out.println("##################");

    }
    
    
    //Metodo para devolver un string con el estado del taladro
    public String getDevolverEstadoDelObjeto() {
        String estadoDelObjeto = "Marca del taladro: "+ marcaTaladro +" Potencia del taladro: "+ potenciaTaladro +" Es manual: " + manual;
        return estadoDelObjeto;
    }
}