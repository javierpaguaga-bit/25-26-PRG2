public class XXI {
    private Dealer dealer;
    private Mano mano;
    private Console console;

    public static void main(String[] args) {
        new XXI().jugar();
    }

    public XXI() {
        dealer = new Dealer();
        mano = new Mano();
        console = new Console();
    }

    private void jugar() {
        Menu menu = new Menu();
        boolean salir = false;
        this.RecibirCarta();
        this.RecibirCarta();

        do {
            this.MostrarMano();
            menu.mostrar();
            int opcion = menu.pedirOpcion();

            switch (opcion) {
                case 1 -> {
                    if (mano.puedeJugar()) {
                        RecibirCarta();
                    } else {
                        console.writeln("No puedes pedir más cartas.");
                    }
                }
                case 2 -> {
                    mano.limpiar();
                    dealer.nuevaBaraja();
                    RecibirCarta();
                    RecibirCarta();
                }
                case 3 -> salir = true;
                default -> console.writeln("Opción no válida");
            }

            if (validarFinal() && opcion == 1) {
                this.MostrarMano();
                validarFinal();
                // Opcionalmente podrías forzar un reinicio aquí
            }

        } while (!salir);
    }

    private void RecibirCarta() {
        Carta carta = dealer.repartirCarta();
        mano.recibir(carta);
    }

    private void MostrarMano() {
        console.writeln("--------------------");
        mano.mostrar();
        if (mano.haGanado()) console.writeln(" ==> Ganó");
        else if (mano.haPerdido()) console.writeln(" ==> Perdió");
        else console.writeln(" ==> Sigue jugando");
        console.writeln("--------------------");
    }

    private boolean validarFinal() {
        return mano.haGanado() || mano.haPerdido();
    }
}
