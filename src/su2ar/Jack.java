package su2ar;

public class Jack {
    private Integer depression;
    private Integer happiness;
    private Integer health;
    
    public Jack(Integer depression, Integer happiness, Integer health) {
        this.depression = depression;
        this.happiness = happiness;
        this.health = health;
    }

    public Jack() {

    }

    public Integer getDepression() {
        return depression;
    }
    public void setDepression(Integer depression) {
        this.depression = depression;
    }
    public Integer getHappiness() {
        return happiness;
    }
    public void setHappiness(Integer happiness) {
        this.happiness = happiness;
    }
    public Integer getHealth() {
        return health;
    }
    public void setHealth(Integer health) {
        this.health = health;
    }    
    
}