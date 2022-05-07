package ceng.anadolu.bim492;
public class App {
    public static void main(String[] args) throws InterruptedException {

        Player esra = Esra.getInstance();
        Player isinsu = Isinsu.getInstance();
        System.out.println("Initial scores: ");
        Thread.sleep(1000);
        System.out.println(esra.getDescription() +  "attack with " + esra.attack() + " ,and you can defence with " +esra.defence());
        Thread.sleep(1000);
        System.out.println(isinsu.getDescription() +  "attack with " + isinsu.attack() + " ,and you can defence with " + isinsu.defence());
        Thread.sleep(1000);


        esra = new FirePunch(esra);
        esra = new StayLongerInAir(esra);
        isinsu = new RunFast(isinsu);
        isinsu = new Teleport(isinsu);

        System.out.println("Final scores: ");
        Thread.sleep(1000);
        System.out.println("Player are adding power to their characters..... ");

        Thread.sleep(2000);
        System.out.println("Player1 choosing abilities......");
        Thread.sleep(2000);
        System.out.println(esra.getDescription() +  "attack with " + esra.attack() + " ,and you can defence with " +esra.defence());

        Thread.sleep(2000);
        System.out.println("Player2 choosing abilities......");
        Thread.sleep(2000);
        System.out.println(isinsu.getDescription() +  "attack with " + isinsu.attack() + " ,and you can defence with " + isinsu.defence());
        Thread.sleep(1000);
        System.out.println("Players are ready to play.");



    }
}
