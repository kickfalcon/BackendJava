package practicaMona;

public class GrimRepo extends Octocat implements GrimRepoCallbacks {
    public GrimRepo(int feet, int eyes, int Id,int numberHat,int toolNumber, String tools,
                       String skinColor,String eyeColor, String hat, String cloth, String name){
        super(feet,eyes,Id,numberHat,toolNumber,tools,skinColor,eyeColor,hat,cloth, name);
    }

    @Override
    public void hunting() {
        System.out.println("Looking for souls...");
    }

    @Override
    public void observing() {
        System.out.println("Looking the landscape");
    }

    @Override
    public void reaping() {
        System.out.println("Taking your soul...");
    }
}
