public enum Item {
    DIA_SWORD("Diamond sword", 50,  50, 150),
    GOLD_SWORD("GOLD sword", 10,  20, 70),
    GOLDEN_AXE ("Gold AXE", 40,  30, 100);


    private String name;
    private  double dmg;
    private  double durability;
    private  double price;

    Item(String name, double dmg, double durability, double price) {
        this.name = name;
        this.dmg = dmg;
        this.durability = durability;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getDmg() {
        return dmg;
    }

    public double getDurability() {
        return durability;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public void setDurability(double durability) {
        this.durability = durability;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
