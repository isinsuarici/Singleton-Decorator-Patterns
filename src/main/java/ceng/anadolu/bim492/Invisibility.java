package ceng.anadolu.bim492;
public class Invisibility extends PowerDecorator{
    private Player player;

    public Invisibility(Player player) {
        this.player = player;
    }
    @Override
    public String getDescription() {
        return player.getDescription() + "being invisible, ";
    }

    @Override
    public double attack() {
        return player.attack() -6;
    }

    @Override
    public double defence() {
        return player.defence() +12;
    }
}
