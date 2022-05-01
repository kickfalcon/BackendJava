package practicaMultiverse;

public class Tom extends SpiderMan implements TomCallbacks{
    public Tom(String name, String universe, String genre, String powers, String hero, String theme){
        super(name, universe, genre, powers, hero, theme);
    }

    @Override
    public void factorRegenerativo() {
        System.out.println("Al menos el dolor se fue...");
    }

    @Override
    public void trepaMuros() {
        System.out.println("Podemos seguir por aquí...");
    }

    @Override
    public void reflejos() {
        System.out.println("Eso estuvo cerca...");
    }

    @Override
    public void betterSenses() {
        System.out.println("Veo que alguien necesita mi ayuda por allá");
    }

    @Override
    public void fuerza() {
        System.out.println("El cap casi me manda a volar...");
    }

    @Override
    public void punch() {
        System.out.println("¡toma eso!");
    }

    @Override
    public void drone() {
        System.out.println("Viernes...despliega los drones de combate");
    }
}
