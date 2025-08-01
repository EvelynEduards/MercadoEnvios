package arraysmercadoenvios;

public class Drone extends DispositivoElectronico implements TransportadorPaquete{
    private boolean camaraEncendida;

    public Drone(String marca) {
        super(marca);
    }
    
    
    public void encenderCamara(){
    if(!camaraEncendida){
        camaraEncendida = true;
        }
    }
    
    
    @Override
    public void encender(){
        System.out.println("Drone encendido");
    }
    
    
    @Override
    public void entregarPedido(){
        System.out.println("Voy volando");
    }
}
