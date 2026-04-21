package entregas.paguagaJavier.scr;

public class Tiempo {

    private final double HORA_APERTURA = 9.0;
    private final double HORA_CIERRE = 21.0;
    private final double MINUTO = 1 / 60;
    private double horaActual;
    private Console console;

    public Tiempo() {
        horaActual = HORA_APERTURA;
        console = new Console();
    }

    public void avanzar() {
        horaActual = horaActual + MINUTO;
    }

    public boolean haFinalizado() {
        return HORA_CIERRE < horaActual;
    }

    public void mostrar(boolean llegaClienteEsteMinuto) {
        console.write(horaHumana());
        console.write(" ");
        console.writeln(llegaClienteEsteMinuto ? "" : "no " + "llega cliente este minuto");
    }

    private String horaHumana() {
        int hora = (int) horaActual;
        int minutos = (int) ((horaActual - hora)*60);
        return hora + ":" + minutos;
    }

    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();
        tiempo.mostrar(true);
        for (int i = 0; i < 60; i++) {
            tiempo.avanzar();
        }
        tiempo.mostrar(true);
    }
}
