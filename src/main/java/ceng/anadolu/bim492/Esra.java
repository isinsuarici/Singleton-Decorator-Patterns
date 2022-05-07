package ceng.anadolu.bim492;
public class Esra extends Player{
    private static Esra esraInstance;
    private Esra() {
        description = "Your player's name is Esra, you can ";
    }

    public static Esra getInstance(){

        if (esraInstance == null){
            esraInstance = new Esra();
        }

        return esraInstance;
    }

    @Override
    public double attack() {
        return 50;
    }
    public double defence() {
        return 50;
    }
}
