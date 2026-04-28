class Pista {

    int[][] pista;
    private int distancia;
    private Console console;

    public Pista(int longitud, int numeroJugadores) {
        pista = new int[longitud][numeroJugadores];
        for (int i = 0; i < numeroJugadores; i++) {

        }
    }

    public void mostrar() {
        console.writeln("---+-----------+---------+---------+---------+---------+;");
        console.writeln("---|0.........1.........2.........3.........4.........5|");
        console.writeln("---|012345678901234567890123456789012345678901234567890|")
        for(int i=0; i<numeroJugadores; i++) {
            console.write(" ".repeat(distancia));
            console.writeln(";=;`");
        };

    }

    public boolean hayGanadores() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hayGanadores'");
    }

    public void mostrarResultadoFinal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarResultadoFinal'");
    }

}