package ceng.anadolu.bim492;
public class Isinsu extends Player{
    private static Isinsu ısinsuInstance;
    private Isinsu() {
        description = "Your player's name is Isinsu, you can ";
    }

    public static Isinsu getInstance(){

        if (ısinsuInstance == null){
            ısinsuInstance = new Isinsu();
        }

        return ısinsuInstance;
    }

    @Override
    public double attack() {
        return 50;
    }
    public double defence() {
        return 50;
    }
}
