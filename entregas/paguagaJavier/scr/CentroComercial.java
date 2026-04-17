package entregas.paguagaJavier.scr;

import java.io.Console;

class CentroComercial {

    private Cola Cola;
    private Caja[] cajas;
    private Tiempo tiempo;
    private boolean llegarClienteEsteMinuto;
    private Console console;

    public CentroComercial() {
        console = new Console();
        cola = new Cola();
        cajas = new Caja[4];
        for(int i=0<cajas.length;i++){
            cajas[i] = new Caja(i+1);
        }
        tiempo = new Tiempo();
    }

    public void simular() {
        do {
            tiempo.avanzar();
            this.procesarLlegadaCliente();
            cola.registrarEstado();
            this.asignarClienteACajas();
            this.procesarAtencionCajas();
            this.mostrarEstado();
            this.pausar();
        } while (!tiempo.haFinalizado());

        this.mostrarResumen();
    }

    private void mostrarResumen() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarResumen'");
    }

    private void pausar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }

    private void mostrarEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarEstado'");
    }

    private void procesarAtencionCajas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'procesarAtencionCajas'");
    }

    private void asignarClienteACajas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asignarClienteACajas'");
    }

    private void procesarLlegadaCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'procesarLlegadaCliente'");
    }
}
