package practicaMona;

public class Linktocat extends Octocat implements LinktocatCallbacks{
    public Linktocat(int feet, int eyes, int Id,int numberHat,int toolNumber, String tools,
                    String skinColor,String eyeColor, String hat, String cloth, String name){
        super(feet,eyes,Id,numberHat,toolNumber,tools,skinColor,eyeColor,hat,cloth, name);
    }

    @Override
    public void buying() {
        System.out.println("Buying medicine....");
    }

    @Override
    public void fightMonsters() {
        System.out.println("A monster has appeared,Defeat it!");
    }

    @Override
    public void jump() {
        System.out.println("Reaching new highs");
    }

    @Override
    public void map() {
        System.out.println("Need to know where to go...");
    }

    @Override
    public void shield() {
        System.out.println("Using shield...");
    }

    @Override
    public void savingPrincess() {
        System.out.println("The princess is safe with you");
    }
}
