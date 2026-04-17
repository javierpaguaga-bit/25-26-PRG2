package entregas.paguagaJavier.scr;

class Cola {

    private Cliente[] clientes;
    private final int CAPACIDAD_MAXIMA = 100;
    private int minutosSinCLientes;
    int tamaño;
    private Console console;

    public Cola(){
        clientes = new Cliente[CAPACIDAD_MAXIMA];
        minutosSinCLientes = 0;
        tamaño = 0;
        console = new Console();
    }

    public void registrarEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarEstado'");
    }

    public void añadirCliente(Cliente cliente) {
        clientes[tamaño] = cliente;
        tamaño = tamaño + 1;
    }

    public boolean hayClientes() {
        return tamaño > 0;
    }

    public void mostrar() {
        final String PERSONA = "_o/";
        console.writeln();
    }

    public int obtenerMinutosSinCLientes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerMinutosSinCLientes'");
    }

    public int obtenerCantidadPersonasEnCola() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerCantidad'");
    }

    public Cliente quitarCLiente() {
        Cliente cliente = clientes[0];
        for(int i = 0;i<tamaño-1;i++){
            clientes[i] = clientes[i+1];
        }
        clientes[tamaño-1]=null;
        tamaño = tamaño -1;
        return cliente;
    }

}
