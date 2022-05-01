package practicaMultiverse;

public class Tobey extends SpiderMan implements TobeyCallbacks{
    public Tobey(String name, String universe, String genre, String powers, String hero, String theme){
        super(name, universe, genre, powers, hero, theme);
    }

    @Override
    public void fuerza() {
        System.out.println("Tengo que detener el tren...");
    }

    @Override
    public void trepaMuros() {
        System.out.println("La cima del edificio Chrysler es asombrosa");
    }

    @Override
    public void spiderSense() {
        System.out.println("Algo malo va a pasar");
    }

    @Override
    public void spiderWeb() {
        System.out.println("¡Telaraña!...¡Vuela!...¡Arriba, arriba y muy lejos!");
    }

    @Override
    public void factorRegenerativo() {
        System.out.println("No es más que un rasguño");
    }

    @Override
    public void punch() {
        System.out.println("¡uy! eso debe doler");
    }

    @Override
    public void patada() {
        System.out.println("patada en la espinilla");
    }

    @Override
    public void arrojar() {
        System.out.println("Es hora de irse...");
    }
}
