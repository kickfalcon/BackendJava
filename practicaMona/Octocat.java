package practicaMona;
/*
 * #132 Justicetocat    X
 * #112 Saritocat   X
 * #55 Octocat de los muertos   X
 * #54 Grim repo    X
 * #59 Linktocat    X
 * #44 Spectrocat
 * #39 Cloud    X
 * #3 Octobi Wan Catnobi    X
 */
public class Octocat {
    private int feet;
    private int eyes;
    private  int Id;
    private int numberHat;
    private int toolNumber;
    private String tools;
    private String skinColor;
    private String eyeColor;
    private String hat;
    private String cloth;
    private String name;

    public Octocat(int feet, int eyes, int Id, int numberHat, int toolNumber, String tools,String skinColor,
                   String eyeColor, String hat, String cloth, String name){
        setFeet(feet);
        setEyes(eyes);
        setId(Id);
        setNumberHat(numberHat);
        setToolNumber(toolNumber);
        setTools(tools);
        setSkinColor(skinColor);
        setEyeColor(eyeColor);
        setHat(hat);
        setCloth(cloth);
        setName(name);
    }

    public int getFeet(){  return feet;  }
    public int getEyes(){  return eyes;  }
    public int getId(){  return Id;  }
    public int getNumberHat(){  return numberHat;  }
    public int getToolNumber(){  return toolNumber;  }
    public String getTools(){  return tools;  }
    public String getSkinColor(){  return skinColor;  }
    public String getEyeColor(){  return eyeColor;  }
    public String getHat(){  return hat;  }
    public String getCloth(){  return cloth;  }
    public String getName(){  return name;  }

    public boolean setFeet(int feet){
        if(feet>0){
            this.feet=feet;
            return true;
        }else
            return false;
    }

    public boolean setEyes(int eyes){
        if(eyes>0){
            this.eyes=eyes;
            return true;
        }else
            return false;
    }
    public boolean setId(int Id){
        if(Id>0){
            this.Id=Id;
            return true;
        }else
            return false;
    }
    public boolean setNumberHat(int numberHat){
        if (numberHat>=0){
            this.numberHat=numberHat;
            return true;
        }else
            return false;
    }

    public boolean setToolNumber(int toolNumber){
        if(toolNumber>=0){
            this.toolNumber=toolNumber;
            return true;
        }else
            return false;
    }

    public boolean setTools(String tools){
        if (!tools.isEmpty()){
            this.tools=tools;
            return true;
        }else
            return false;
    }

    public boolean setSkinColor(String skinColor){
        if (!skinColor.isEmpty()){
            this.skinColor = skinColor;
            return true;
        }else
            return false;
    }

    public boolean setEyeColor(String eyeColor){
        if (!eyeColor.isEmpty()){
            this.eyeColor = eyeColor;
            return true;
        }else
            return false;
    }

    public boolean setHat(String hat){
        if (!hat.isEmpty()){
            this.hat = hat;
            return true;
        }else
            return false;
    }

    public boolean setCloth(String cloth){
        if (!cloth.isEmpty()){
            this.cloth = cloth;
            return true;
        }else
            return false;
    }

    public boolean setName(String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

}
