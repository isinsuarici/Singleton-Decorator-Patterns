package ceng.anadolu.bim492;
public class FirePunch extends PowerDecorator{
    private Player player;

    public FirePunch(Player player) {
        this.player = player;
    }
    @Override
    public String getDescription() {
        return player.getDescription() + "punch with fire, ";
    }

    @Override
    public double attack() {
        return player.attack() +12;
    }

    @Override
    public double defence() {
        return player.defence() -7;
    }
}
