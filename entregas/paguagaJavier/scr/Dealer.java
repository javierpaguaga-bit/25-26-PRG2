public class Dealer {
    private Baraja baraja;
    private Console console;

    public Dealer() {
        this.console = new Console();
        this.baraja = new Baraja();
        this.baraja.mezclar();
    }

    public Carta repartirCarta() {
        return baraja.extraerCarta();
    }

    public void nuevaBaraja() {
        this.baraja = new Baraja();
        this.baraja.mezclar();
    }
}
