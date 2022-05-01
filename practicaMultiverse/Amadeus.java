package practicaMultiverse;

public class Amadeus extends SpiderMan implements AmadeusCallbacks {
    public Amadeus(String name, String universe, String genre, String powers, String hero){
        super(name, universe, genre, powers, hero);
    }

    @Override
    public void superInteligencia() {
        System.out.println("Lo más viable es hacer lo siguiente...");
    }

    @Override
    public void condicionFisica() {
        System.out.println("Llevo bastante tiempo corriendo pero podría seguir todo el día");
    }

    @Override
    public void armadura() {
        System.out.println("¡Hora de la Iron Spider!");
    }

    @Override
    public void punch() {
        System.out.println("izquierda, derecha...izquierda");
    }

    @Override
    public void patada() {
        System.out.println("patada alta");
    }
}
