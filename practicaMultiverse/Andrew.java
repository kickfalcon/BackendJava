package practicaMultiverse;

public class Andrew extends SpiderMan implements AndrewCallbacks{
    public Andrew(String name, String universe, String genre, String powers, String hero, String theme){
        super(name, universe, genre, powers, hero, theme);
    }

    @Override
    public void reflejos() {
        System.out.println("Eso estuvo cerca...");
    }

    @Override
    public void trepaMuros() {
        System.out.println("¡Hora de irse!");
    }

    @Override
    public void spiderSense() {
        System.out.println("Algo se acerca...");
    }

    @Override
    public void factorRegenerativo() {
        System.out.println("Menos mal que no duro mucho tiempo enfermo");
    }

    @Override
    public void superFuerza() {
        System.out.println("Esto si que pesa");
    }

    @Override
    public void punch() {
        System.out.println("Gancho al estómago");
    }

    @Override
    public void handTohand() {
        System.out.println("puño, patada alta, puño, ");
    }
}
