package ceng.anadolu.bim492;
public class Teleport extends PowerDecorator{
    private Player player;

    public Teleport(Player player) {
        this.player = player;
    }
    @Override
    public String getDescription() {
        return player.getDescription() + "teleport to other place, ";
    }

    @Override
    public double attack() {
        return player.attack() +9;
    }

    @Override
    public double defence() {
        return player.defence() -5;
    }
}
