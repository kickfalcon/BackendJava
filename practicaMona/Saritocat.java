package practicaMona;

public class Saritocat extends Octocat implements SaritocatCallbacks {
    public Saritocat(int feet, int eyes, int Id,int numberHat,int toolNumber, String tools,
                        String skinColor,String eyeColor, String hat, String cloth, String name){
        super(feet,eyes,Id,numberHat,toolNumber,tools,skinColor,eyeColor,hat,cloth,name);
    }

    @Override
    public void blessing() {  System.out.println("Saritocat is making you healthier");  }

    @Override
    public void listeningPrayers() {  System.out.println("Saritocat is listening your pray");  }

    @Override
    public void meditation() {  System.out.println("Reaching illumination");  }

    @Override
    public void receivingGifts() {  System.out.println("Watching your sacrifice...");  }
}
