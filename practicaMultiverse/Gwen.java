package practicaMultiverse;

public class Gwen extends SpiderMan implements GwenCallbacks {
    public Gwen(String name, String universe, String genre, String powers, String hero){
        super(name, universe, genre, powers, hero);
    }

    @Override
    public void spiderSense() {
        System.out.println("Estamos en peligro...");
    }

    @Override
    public void fuerza() {
        System.out.println("Vaya que es pesada esta piedra");
    }

    @Override
    public void trepaMuros() {
        System.out.println("¡Hora de irse!");
    }

    @Override
    public void agilidad() {
        System.out.println("Hagamos esto rápido...");
    }

    @Override
    public void patada() {
        System.out.println("patada giratoria");
    }

    @Override
    public void arrojarPersona() {
        System.out.println("Es hora de despedirse");
    }

    @Override
    public void carrusel() {
        System.out.println("Esto lo aprendí en México...");
    }
}
