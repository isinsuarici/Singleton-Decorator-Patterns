package ceng.anadolu.bim492;
public class StayLongerInAir extends PowerDecorator{
    private Player player;

    public StayLongerInAir(Player player) {
        this.player = player;
    }
    @Override
    public String getDescription() {
        return player.getDescription() + "stay longer in air, ";
    }

    @Override
    public double attack() {
        return player.attack() -4;
    }

    @Override
    public double defence() {
        return player.defence() +4;
    }
}
