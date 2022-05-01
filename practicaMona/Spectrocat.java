package practicaMona;

public class Spectrocat extends Octocat implements SpectrocatCallbacks{
    public Spectrocat(int feet, int eyes, int Id,int numberHat,int toolNumber, String tools,
                    String skinColor,String eyeColor, String hat, String cloth, String name){
        super(feet,eyes,Id,numberHat,toolNumber,tools,skinColor,eyeColor,hat,cloth, name);
    }

    @Override
    public void appear() {
        System.out.println("Spectrocat has appeared!");
    }

    @Override
    public void fly() {
        System.out.println("flying in the house");
    }

    @Override
    public void scaring() {
        System.out.println("Booo!");
    }
}
