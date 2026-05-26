public class Menu {
    private Console console;

    public Menu(){
        console = new Console();
    }

    public void mostrar() {
        console.writeln("1. Jugar");
        console.writeln("Empezar de nuevo");
        console.writeln("2. Salir");
    }

    public int pedirOpcion() {
        return console.readInt();

    }
}