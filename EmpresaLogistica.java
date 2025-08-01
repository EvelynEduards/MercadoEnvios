package arraysmercadoenvios;

import java.util.ArrayList;
import java.util.List;

public class EmpresaLogistica {

    private String nombre;
    private List<TransportadorPaquete> transportadores;

    public EmpresaLogistica(String nombre) {
        this.nombre = nombre;
        transportadores = new ArrayList<>();
    }

    public void agregarTransportador(TransportadorPaquete t) {
        if (t != null) {
            transportadores.add(t);
        }
    }

    public void iniciarEntregas() {
        System.out.println(nombre + " entregando");
        for(TransportadorPaquete t: transportadores) {
        t.entregarPedido();
        }
    }
}

