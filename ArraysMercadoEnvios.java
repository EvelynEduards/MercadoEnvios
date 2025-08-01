package arraysmercadoenvios;

public class ArraysMercadoEnvios {

  
    public static void main(String[] args) {
        EmpresaLogistica empresa = new EmpresaLogistica("Mercado envios");
        
        cargarEmpresa(empresa);
        
        empresa.iniciarEntregas();
        
        
    }
    
    
    
    public static void cargarEmpresa(EmpresaLogistica e){
     e.agregarTransportador(new Drone("Dji"));
     e.agregarTransportador(new Drone("AKME"));
     e.agregarTransportador(new Camion(3000, "Scania", "AAA222"));
     e.agregarTransportador(new Delivery("Jose"));
    }
}
