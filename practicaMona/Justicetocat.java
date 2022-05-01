package practicaMona;

public class Justicetocat  extends Octocat implements JusticetocatCallbacks{
    public Justicetocat(int feet, int eyes, int Id,int numberHat,int toolNumber, String tools,
                        String skinColor,String eyeColor, String hat, String cloth, String name){
        super(feet,eyes,Id,numberHat,toolNumber,tools,skinColor,eyeColor,hat,cloth, name);
    }

    @Override
    public void analyzing() {
        System.out.println("Justicetocat is considering the evidence...");
    }

    @Override
    public void judge() {System.out.println("Justicetocat thinks you're a bad guy..."); }

    @Override
    public void speak() {
        System.out.println("You have to do...");
    }
}
