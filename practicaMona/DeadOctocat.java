package practicaMona;

public class DeadOctocat extends Octocat implements DeadOctocatCallbacks {
    public DeadOctocat(int feet, int eyes, int Id,int numberHat,int toolNumber, String tools,
                        String skinColor,String eyeColor, String hat, String cloth, String name){
        super(feet,eyes,Id,numberHat,toolNumber,tools,skinColor,eyeColor,hat,cloth, name);
    }

    @Override
    public void eat() {  System.out.println("Eating hojaldra");  }

    @Override
    public void dancing() {  System.out.println("Dancing la Cucaracha");  }

    @Override
    public void playingGuitar() {  System.out.println("Music sounds...");  }

    @Override
    public void singing() {  System.out.println("Hay de mi...llorona, llorona, llorona de azul celeste...");  }

    @Override
    public void visiting() {  System.out.println("Dead Octocat is visiting his relatives");  }

    @Override
    public void walking() {  System.out.println("Dead Octocat is walking through the crowd");  }
}
