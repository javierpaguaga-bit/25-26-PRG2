package entregas.paguagaJavier.scr;

import java.io.Console;

class CentroComercial {

    private static final double PROBABILIDAD_LLEGADA = 0.4;
    private static final String Cliente = null;
    private Cola cola;
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
        cola.minutosSinClientes = cola.obtenerMinutosSinCLientes();
        cola.Cantidad = cola.obtenerCantidadPersonasEnCola();
        this.obtenerPersonasAtendidas();
        this.obtenerItemVendidos();
    }

    private int obtenerItemVendidos() {
        int totalItems = 0;
        for (int numeroCaja = 0; numeroCaja < cajas.length; numeroCaja++) {
            totalItems = totalItems + cajas[numeroCaja].obtenerPersonasAtendidas();
        }
        return totalItems;
    }

    private int obtenerPersonasAtendidas() {
        int totalItems = 0;
        for (int numeroCaja = 0; numeroCaja < cajas.length; numeroCaja++) {
            cajas[numeroCaja].obtenerPersonasAtendidas();
        }

        return totalItems;
    }

    private void pausar() {
        console.pausar(5);
    }

    private void mostrarEstado() {
        cola.mostrar();
        this.mostrarCajas();
    }

    private void mostrarCajas() {
        for (int numeroCaja = 0; numeroCaja < cajas.length; numeroCaja++) {
            cajas[numeroCaja].mostrar();
        }
    }

    private void procesarAtencionCajas() {
        for (int numeroCaja = 0; numeroCaja < cajas.length; numeroCaja++) {
            cajas[numeroCaja].avanzarAtencion();
        }
    }

    private void asignarClienteACajas() {
        for (int numeroCaja = 0; numeroCaja < cajas.length; numeroCaja++) {
            if (cajas[numeroCaja].estaLibre() && cola.hayClientes()) {
                cajas[numeroCaja].asignarCliente(cola.quitarCLiente());
            }
        }
    }

    private void procesarLlegadaCliente() {
        llegarClienteEsteMinuto = Math.random() <= PROBABILIDAD_LLEGADA;

        if (llegarClienteEsteMinuto) {
            cola.añadirCliente(new Cliente());
        }
    }
}
