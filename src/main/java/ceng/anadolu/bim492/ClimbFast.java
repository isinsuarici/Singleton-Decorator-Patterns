package ceng.anadolu.bim492;
public class ClimbFast extends PowerDecorator{
    private Player player;

    public ClimbFast(Player player) {
        this.player = player;
    }
    @Override
    public String getDescription() {
        return player.getDescription() + "climbed fast, ";
    }

    @Override
    public double attack() {
        return player.attack() -4;
    }

    @Override
    public double defence() {
        return player.defence() +6;
    }
}
