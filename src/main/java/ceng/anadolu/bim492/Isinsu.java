package ceng.anadolu.bim492;
public class Isinsu extends Player{
    private static Isinsu ─▒sinsuInstance;
    private Isinsu() {
        description = "Your player's name is Isinsu, you can ";
    }

    public static Isinsu getInstance(){

        if (─▒sinsuInstance == null){
            ─▒sinsuInstance = new Isinsu();
        }

        return ─▒sinsuInstance;
    }

    @Override
    public double attack() {
        return 50;
    }
    public double defence() {
        return 50;
    }
}
