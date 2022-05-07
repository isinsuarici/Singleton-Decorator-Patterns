package ceng.anadolu.bim492;
public abstract class PowerDecorator extends Player{
    public abstract String getDescription();

    @Override
    public abstract double attack();

    @Override
    public abstract double defence();
}
