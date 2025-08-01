package arraysmercadoenvios;

public abstract class DispositivoElectronico {
    private String marca;

    public DispositivoElectronico(String marca) {
        this.marca = marca;
    }
    
    public abstract void encender();
}
