package practicaHarry;

public class Magos {
    public static void main(String[] args) {
        Testmago();
        Testmago1();
        Testmago2();
        Testmago3();
        Testmago4();
        Testmago5();
    }
    private static void Testmago() {
        Characters h = new Characters();
        h.setName("Hermione");
        h.setStatus("muggle");
        h.setLastName("Granger");
        h.setPatronus("Otter");
        h.setHouse("Gryffindor");
        h.setGenero("mujer");
        h.setBoggart("failure");
        System.out.println(h.presentation());
    }
    private static void Testmago1(){
        Characters HP = new Characters();
        HP.setName("Harry");
        HP.setStatus("half-blood");
        HP.setLastName("Potter");
        HP.setPatronus("Stag");
        HP.setHouse("Gryffindor");
        HP.setGenero("hombre");
        HP.setBoggart("Dementor");
        System.out.println(HP.presentation());
    }
    private static void Testmago2(){
        Characters R = new Characters();
        R.setName("Ronald");
        R.setStatus("pure-blood");
        R.setLastName("Weasley");
        R.setPatronus("Jack Russell Terrier");
        R.setHouse("Gryffindor");
        R.setGenero("hombre");
        R.setBoggart("Aragog");
        System.out.println(R.presentation());
    }
    private static void Testmago3(){
        Characters R = new Characters();
        R.setName("Severus");
        R.setStatus("half-blood");
        R.setLastName("Snape");
        R.setPatronus("Doe");
        R.setHouse("Gryffindor");
        R.setGenero("hombre");
        R.setBoggart("Lord Voldemort");
        System.out.println(R.presentation());
    }
    private static void Testmago4(){
        Characters R = new Characters();
        R.setName("Ginevra 'Ginny'");
        R.setStatus("pure-blood");
        R.setLastName("Weasley");
        R.setPatronus("Horse");
        R.setHouse("Gryffindor");
        R.setGenero("mujer");
        R.setBoggart("Lord Voldemort");
        System.out.println(R.presentation());
    }
    private static void Testmago5(){
        Characters R = new Characters();
        R.setName("Voldemort");
        R.setStatus("pure-blood");
        R.setLastName("");
        R.setPatronus("Jack Russell Terrier");
        R.setHouse("Gryffindor");
        R.setGenero("hombre");
        R.setBoggart("Aragog");
        System.out.println(R.presentation());
    }

}
