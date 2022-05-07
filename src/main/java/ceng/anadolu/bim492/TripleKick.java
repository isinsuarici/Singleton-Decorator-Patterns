package ceng.anadolu.bim492;
public class TripleKick extends PowerDecorator{
    private Player player;

    public TripleKick(Player player) {
        this.player = player;
    }
    @Override
    public String getDescription() {
        return player.getDescription() + "kick triple, ";
    }

    @Override
    public double attack() {
        return player.attack() +9;
    }

    @Override
    public double defence() {
        return player.defence() -3;
    }
}
