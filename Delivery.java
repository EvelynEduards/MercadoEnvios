package arraysmercadoenvios;

public class Delivery implements TransportadorPaquete {
    private String nombre;

    public Delivery(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void entregarPedido(){
        System.out.println("Me llamo" + nombre + "y te llevo el pedido");
    }
}
