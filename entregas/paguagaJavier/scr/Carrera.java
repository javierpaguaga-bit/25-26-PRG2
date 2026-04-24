class Carrera {

    private Caballos[] caballos;
    private Carretera carretera;
    private Turno turno;
    private Console console;

    public Carrera() {
        console = new Console();
        carretera = new Carretera();
        caballos = new Caballos[2];
        for (int i=0; i < caballos.length; i++){
            caballos[i] = new Caballos(i + 1);
        }
        turno = new Turno();

    }

    public void jugar() {
        do {
            this.moverCaballos();
            carretera.mapearCarretera();
            turno.mostrarTurno();
        } while (!carreraTermino());
    }

    private void moverCaballos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moverCaballos'");
    }

    private boolean carreraTermino() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'carreraTermino'");
    }

}
