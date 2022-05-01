package practicaMona;


public class Mainoctocat {
    public static void main(String[] args) {
        TestLink();
        TestGrimRepo();
        TestCloud();
        TestDead();
        TestOctobi();
        TestJustice();
        TestSarit();
        TestSpectro();
    }

    private static void TestLink(){
        Linktocat l = new Linktocat(
                3,
                2,
                59,
                1,
                2,
                "Sword and Shield",
                "light and black",
                "blue",
                "beanie",
                "Link's clothes",
                "Linktocat"
        );
        String msg="\nYou've found #"+l.getId()+" octocat his name is "+l.getName()+" he has "+l.getEyes()+" "+l.getEyeColor()+" eyes "+
                ",his skin is "+l.getSkinColor()+".It's wearing a "+l.getCloth()+" and a "+l.getHat()+"\nHe says it only has "
                +l.getNumberHat()+". It is always carrying "+l.getToolNumber()+" things, which are "+l.getTools()+
                ". Something curious, he has "+l.getFeet()+"feet.";
        System.out.println(msg);
        l.buying();
        l.map();
        l.fightMonsters();
        l.jump();
        l.shield();
        l.savingPrincess();
    }
    private static void TestGrimRepo(){
        GrimRepo l = new GrimRepo(
                4,
                2,
                54,
                1,
                1,
                "Reaper",
                "White",
                "",
                "hat",
                "robe",
                "Grim Repo"
        );
        String msg="\nYou've found #"+l.getId()+" octocat his name is "+l.getName()+" he has "+l.getEyes()+" "+l.getEyeColor()+" eyes "+
                ",his skin is "+l.getSkinColor()+".It's wearing a "+l.getCloth()+" and a "+l.getHat()+"\nHe says it only has "
                +l.getNumberHat()+". It is always carrying "+l.getToolNumber()+" things, which is a "+l.getTools()+
                ". Something curious, he has "+l.getFeet()+"feet.";
        System.out.println(msg);
        l.observing();
        l.hunting();
        l.reaping();
    }
    private static void TestCloud(){
        Cloud l = new Cloud(
                0,
                0,
                39,
                0,
                0,
                "",
                "white",
                "",
                "",
                "",
                "Cloud"
        );
        String msg="\nYou've found #"+l.getId()+" octocat, his name is "+l.getName()+" he has "+l.getEyes()+" "+l.getEyeColor()+" eyes "+
                ",his skin is "+l.getSkinColor()+".It's wearing a "+l.getCloth()+" and a "+l.getHat()+"\nHe says it only has "
                +l.getNumberHat()+". It is always carrying "+l.getToolNumber()+" things, which is a "+l.getTools()+
                ". Something curious, he has "+l.getFeet()+"feet.";
        System.out.println(msg);
        l.floating();
    }
    private static void TestDead(){
        DeadOctocat l = new DeadOctocat(
                4,
                2,
                55,
                1,
                1,
                "guitar",
                "black and white",
                "",
                "mariachi's hat",
                "poncho",
                "Octocat de los muertos"
        );
        String msg="\nYou've found #"+l.getId()+" octocat, his name is "+l.getName()+" he has "+l.getEyes()+" "+l.getEyeColor()+" eyes "+
                ",his skin is "+l.getSkinColor()+".It's wearing a "+l.getCloth()+" and a "+l.getHat()+"\nHe says it only has "
                +l.getNumberHat()+". It is always carrying "+l.getToolNumber()+" things, which is a "+l.getTools()+
                ". Something curious, he has "+l.getFeet()+"feet.";
        System.out.println(msg);
        l.dancing();
        l.singing();
        l.playingGuitar();
        l.walking();
        l.eat();
        l.visiting();
    }
    private static void TestOctobi(){
        OctobiWan l = new OctobiWan(
                3,
                2,
                3,
                0,
                1,
                "lightsaber",
                "black and white",
                "brown",
                "",
                "cap ",
                "Octobi Wan Catnobi"
        );
        String msg="\nYou've found #"+l.getId()+" octocat, his name is "+l.getName()+" he has "+l.getEyes()+" "+l.getEyeColor()+" eyes "+
                ",his skin is "+l.getSkinColor()+".It's wearing a "+l.getCloth()+" and a "+l.getHat()+"\nHe says it only has "
                +l.getNumberHat()+". It is always carrying "+l.getToolNumber()+" things, which is a "+l.getTools()+
                ". Something curious, he has "+l.getFeet()+"feet.";
        System.out.println(msg);
        l.feeling();
        l.lightSaber();
        l.force();
    }
    private static void TestJustice(){
        Justicetocat l = new Justicetocat(
                2,
                2,
                132,
                1,
                2,
                "sword and balance",
                "black",
                "",
                "hair",
                "dress",
                "Justicetocat"
        );
        String msg="\nYou've found #"+l.getId()+" octocat, his name is "+l.getName()+" he has "+l.getEyes()+" "+l.getEyeColor()+" eyes "+
                ",his skin is "+l.getSkinColor()+".It's wearing a "+l.getCloth()+" and a "+l.getHat()+"\nHe says it only has "
                +l.getNumberHat()+". It is always carrying "+l.getToolNumber()+" things, which is a "+l.getTools()+
                ". Something curious, he has "+l.getFeet()+"feet.";
        System.out.println(msg);
        l.analyzing();
        l.judge();
        l.speak();
    }

    private static void TestSarit(){
        Saritocat l = new Saritocat(
                2,
                2,
                112,
                1,
                2,
                "jewels",
                "black",
                "",
                "crown",
                "Indian clothes",
                "Saritocat"
        );
        String msg="\nYou've found #"+l.getId()+" octocat, his name is "+l.getName()+" he has "+l.getEyes()+" "+l.getEyeColor()+" eyes "+
                ",his skin is "+l.getSkinColor()+".It's wearing a "+l.getCloth()+" and a "+l.getHat()+"\nHe says it only has "
                +l.getNumberHat()+". It is always carrying "+l.getToolNumber()+" things, which is a "+l.getTools()+
                ". Something curious, he has "+l.getFeet()+"feet.";
        System.out.println(msg);
        l.meditation();
        l.listeningPrayers();
        l.receivingGifts();
        l.blessing();
    }
    private static void TestSpectro(){
        Spectrocat l = new Spectrocat(
                4,
                2,
                44,
                0,
                0,
                "",
                "white",
                "white",
                "",
                "",
                "Spectrocat"
        );
        String msg="\nYou've found #"+l.getId()+" octocat, his name is "+l.getName()+" he has "+l.getEyes()+" "+l.getEyeColor()+" eyes "+
                ",his skin is "+l.getSkinColor()+".It's wearing a "+l.getCloth()+" and a "+l.getHat()+"\nHe says it only has "
                +l.getNumberHat()+". It is always carrying "+l.getToolNumber()+" things, which is a "+l.getTools()+
                ". Something curious, he has "+l.getFeet()+"feet.";
        System.out.println(msg);
        l.fly();
        l.appear();
        l.scaring();

    }
}
