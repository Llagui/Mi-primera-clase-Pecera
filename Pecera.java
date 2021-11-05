public class Pecera{
    int litrosEnPecera;
    String    propietearioDePecera;
    boolean    conPeces;

    public Pecera(int capacidad, String propietario){
        litrosEnPecera = capacidad;
        propietearioDePecera = propietario;
        conPeces = false;
    }
    
    public String getPropietearioDePecera(){
        return propietearioDePecera;
    }
    
    public int getLitrosEnPecera(){
        return litrosEnPecera;
    }
    
    public boolean getConPeces(){
        return conPeces;
    }
    
    public void setPropietario(String nuevoPropietario){
        propietearioDePecera = nuevoPropietario;
    }
    
    public void echarAgua(int numeroLitros){
        litrosEnPecera = litrosEnPecera + numeroLitros;
    }
    
    public void cambioDeAgua(boolean seTermino){
        conPeces = seTermino;
    }
    
    public void imprimeDetalles(){
        System.out.println("Propietario: " + propietearioDePecera + " |Litros en la pecera " + litrosEnPecera + " |Tiene peces " +conPeces );
    }

    public String imprimeDetalle(){
        return("Propietario: " + propietearioDePecera + " |Litros en la pecera " + litrosEnPecera + " |Tiene peces " +conPeces );
    }
    
}