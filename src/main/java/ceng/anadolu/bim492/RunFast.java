package ceng.anadolu.bim492;
public class RunFast extends PowerDecorator{
    private Player player;

    public RunFast(Player player) {
        this.player = player;
    }
    @Override
    public String getDescription() {
        return player.getDescription() + "run fast, ";
    }

    @Override
    public double attack() {
        return player.attack() +3;
    }

    @Override
    public double defence() {
        return player.defence() -2;
    }
}
