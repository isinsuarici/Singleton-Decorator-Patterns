package ceng.anadolu.bim492;
public class DoubleJump extends PowerDecorator{
    private Player player;

    public DoubleJump(Player player) {
        this.player = player;
    }
    @Override
    public String getDescription() {
        return player.getDescription() + "jump double, ";
    }

    @Override
    public double attack() {
        return player.attack() -7;
    }

    @Override
    public double defence() {
        return player.defence() +10;
    }
}
