package practicaMona;

public class Cloud extends Octocat implements CloudCallbacks{
    public Cloud(int feet, int eyes, int Id, int numberHat, int toolNumber, String tools,
                 String skinColor, String eyeColor, String hat, String cloth, String name){
        super(feet,eyes,Id,numberHat,toolNumber,tools,skinColor,eyeColor,hat,cloth, name);
    }

    @Override
    public void floating() {
        System.out.println("Cloud is floating...");
    }
}
