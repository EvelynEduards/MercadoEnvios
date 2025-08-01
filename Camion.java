package arraysmercadoenvios;

public class Camion extends Vehiculo implements TransportadorPaquete{
    private double carga;

    public Camion(double carga, String marca, String patente) {
        super(marca, patente);
        this.carga = carga;
    }

    @Override
    public void conducirRapido() {
        System.out.println("Soy el camion" + getPatente());
    }

    @Override
    public void entregarPedido() {
        System.out.println("Entregando pedido");
    }
    
    
}
