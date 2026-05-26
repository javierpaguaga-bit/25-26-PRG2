public class XXI {

    private Dealer dealer;
    private Baraja baraja;
    private Mano mano;
    private Console console;

        public static void main(String[] args) {
        XXI juego = new XXI();
        juego.jugar();
    }

    public XXI() {
        baraja = new Baraja();
        dealer = new Dealer();
        mano = new Mano();
        console = new Console();
    }

    private void jugar() {
        Menu menu = new Menu();

        boolean estaJugando = true;
        boolean haGanado = false;
        do {
            this.MostrarMano();
            menu.mostrar();
            switch (menu.pedirOpcion()) {
                case 1 -> RecibirCarta();
                case 2 -> {
                    XXI juego = new XXI();
                    juego.jugar();
                }
                case 3 -> estaJugando = false;
                default -> console.writeln("Opción no válida");
            }
            haGanado = this.validarFinal();
        } while (estaJugando() && !haGanado() && !haPerdido());
    }

    private Object RecibirCarta() {
            Carta carta = dealer.repartirCarta();
            mano.recibir(carta);
            return carta;
    }

    private boolean haPerdido() {
        return mano.haPerdido();
    }

    private void MostrarMano() {
        console.writeln("Tu mano:");
        mano.mostrar();
    }

    private boolean haGanado() {
        return mano.haGanado();
    }

    private boolean estaJugando() {
        return !haGanado() && !haPerdido();
    }

    private boolean validarFinal() {
        if (haGanado()) {
            console.writeln("¡Has ganado!");
            return true;
        } else if (haPerdido()) {
            console.writeln("¡Has perdido!");
            return true;
        }
        return false;
    }
}

