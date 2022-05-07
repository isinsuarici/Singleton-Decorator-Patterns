package ceng.anadolu.bim492;
public abstract class Player {
    protected String description = "unkown player";

    public String getDescription() {
        return description;
    }

    public abstract double attack();
    public abstract double defence();
}
