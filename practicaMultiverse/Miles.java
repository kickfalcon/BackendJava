package practicaMultiverse;

public class Miles extends SpiderMan implements MilesCallbacks{
    public Miles(String name, String universe, String genre, String powers,String hero, String theme){
        super(name, universe, genre, powers, hero, theme);
    }

    @Override
    public void descarga() {
        System.out.println("Liberando descarga eléctrica");
    }

    @Override
    public void invisible() {
        System.out.println("Hora de desaparecer...");
    }

    @Override
    public void spiderSense() {
        System.out.println("El peligro se acerca...");
    }

    @Override
    public void trepaMuros() {
        System.out.println("Vayamos por aquí...");
    }

    @Override
    public void venomBlast() {
        System.out.println("Esto te va a doler");
    }

    @Override
    public void punch() {
        System.out.println("y ahora, el especial de Miles.... puño a la cara, golpe al estómago, 1, 2 y ¡Adiós!");
    }
}
