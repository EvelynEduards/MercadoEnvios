package arraysmercadoenvios;

public abstract class Vehiculo {
    private String marca;
    private String patente;

    public Vehiculo(String marca, String patente) {
        this.marca = marca;
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }
    
    public abstract void conducirRapido();
}
