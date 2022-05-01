package practicaMona;

public class OctobiWan extends Octocat implements OctobiWanCallbacks{
    public OctobiWan(int feet, int eyes, int Id,int numberHat,int toolNumber, String tools,
                      String skinColor,String eyeColor, String hat, String cloth, String name){
        super(feet,eyes,Id,numberHat,toolNumber,tools,skinColor,eyeColor,hat,cloth, name);
    }

    @Override
    public void feeling() {
        System.out.println("Feeling disturbances in the force...");
    }

    @Override
    public void force() {
        System.out.println("Washing alien's brain");
    }

    @Override
    public void lightSaber() {
        System.out.println("lightsaber? Not necessary...");
    }
}
