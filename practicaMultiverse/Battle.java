package practicaMultiverse;

public class Battle {
    public static void main(String[] args)  {
        TestAmadeus();
        TestAndrew();
        TestGwen();
        TestMiles();
        TestTobey();
        TestTom();
    }
    private static void TestAmadeus(){
        Amadeus a = new Amadeus(
                "Amadeus Cho",
                "Earth-12041",
                "Hombre",
                "super inteligencia",
                "Iron Spider"
        );
        System.out.println(a.spiderIntro());
        a.superInteligencia();
        a.armadura();
        a.patada();
    }
    private static void TestAndrew(){
        Andrew a = new Andrew(
                "Peter Parker",
                "Earth-120703",
                "Hombre",
                "trepar muros, la punzada, superfuerza",
                "The amazing Spiderman",
                "Hans Zimmer - The amazing Spiderman"
        );
        System.out.println(a.spiderIntro());
        System.out.println("El tema de mi peli es "+a.getTheme());
        a.spiderSense();
        a.reflejos();
        a.handTohand();

    }
    private static void TestGwen(){
        Gwen g = new Gwen(
                "Gwen Stacy",
                "Earth-65",
                "mujer",
                "fuerza, agilidad, la punzada y trepar muros",
                "Spider-Gwen o Ghost-spider"
        );
        System.out.println(g.spiderIntro());
        g.spiderSense();
        g.trepaMuros();
        g.agilidad();
        g.carrusel();
        g.arrojarPersona();

    }
    private static void TestMiles(){
        Miles m = new Miles(
                "Miles Morales",
                "Earth-1610",
                "hombre",
                "invisibilidad, descarga, la punzada, trepar muros",
                "Spider-boy",
                "Post Malone - Sunflower"
        );
        System.out.println(m.spiderIntro());
        System.out.println("El tema de mi peli es "+m.getTheme());
        m.spiderSense();
        m.trepaMuros();
        m.punch();
        m.invisible();
        m.venomBlast();

    }
    private static void TestTobey(){
        Tobey t = new Tobey(
                "Peter Parker",
                "Earth-96283",
                "hombre",
                "telerañas, la punzada, trepar muros",
                "Spiderman",
                "Danny Elfman - Spiderman"
        );
        System.out.println(t.spiderIntro());
        System.out.println("El tema de mi peli es "+t.getTheme());
        t.spiderSense();
        t.spiderWeb();
        t.trepaMuros();
        t.punch();
        t.patada();

    }
    private static void TestTom(){
        Tom to = new Tom(
                "Peter Parker",
                "Earth-199999",
                "hombre",
                "trepar muros, la punzada, sentidos mejorados",
                "Spider man",
                "Michael Giacchino - Aracnoverture"
        );
        System.out.println(to.spiderIntro());
        System.out.println("El tema de mi peli es "+to.getTheme());
        to.betterSenses();
        to.reflejos();
        to.trepaMuros();
        to.drone();
        to.punch();
    }


}
