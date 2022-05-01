package practicaMultiverse;
/*
* Miles morales
* Amadeus Cho (Earth-12041)
* Peter Parker (Earth-120703) (Andrew Garfield)
* Peter Parker (Earth-199999) (Tom Holland)
* Peter Parker (Earth-96283) (Tobey Maguire)
* Spider-Gwen (Earth-65)
*/
public class SpiderMan {
    private String name, universe, genre, powers, theme, hero;

    public SpiderMan(String name, String universe, String genre, String powers,String hero){
        setName(name);
        setUniverse(universe);
        setGenre(genre);
        setPowers(powers);
        setHero(hero);
    }

    public SpiderMan(String name, String universe, String genre, String powers, String hero, String theme){
        setName(name);
        setUniverse(universe);
        setGenre(genre);
        setPowers(powers);
        setTheme(theme);
        setHero(hero);
    }

    public String getName(){ return name; }
    public String getUniverse(){ return universe;  }
    public String getGenre () { return genre;  }
    public String getPowers(){ return powers; }
    public String getTheme(){ return theme; }
    public String getHero(){  return hero; }

    public boolean setName(String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setUniverse(String universe){
        if (!universe.isEmpty()){
            this.universe = universe;
            return true;
        }else
            return false;
    }

    public boolean setGenre(String genre){
        if (!genre.isEmpty()){
            this.genre = genre;
            return true;
        }else
            return false;
    }

    public boolean setPowers(String powers){
        if (!powers.isEmpty()){
            this.powers = powers;
            return true;
        }else
            return false;
    }

    public boolean setTheme(String theme){
        if (!theme.isEmpty()){
            this.theme = theme;
            return true;
        }else
            return false;
    }

    public boolean setHero(String hero){
        if (!hero.isEmpty()){
            this.hero = hero;
            return true;
        }else
            return false;
    }

    public String spiderIntro(){
        return "\nHola, soy "+ getName()+" obvio soy "+getGenre()+ " y me conocen como "+getHero()+" del universo "+getUniverse()+
                " mis poderes son "+ getPowers();

    }

}
