class Carrera {

    private Caballo[] caballos;
    private Pista pista;
    private Turno turno;
    private Console console;
    private int numeroJugadores;

    public Carrera(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
        pista = new Pista(40, numeroJugadores);
        caballos = new Caballo[numeroJugadores];
        for (int i = 0; i < numeroJugadores; i++) {
            caballos[i] = new Caballo(i + 1);
        }
    }

    public void jugar() {
        do {
            pista.mostrar();
            for (int i = 0; i < 2; i++) {
                caballos[i].moverse(pista);
            }
        } while (!pista.hayGanadores());
        pista.mostrarResultadoFinal();
    }

}
