public enum Item {
    hul("Tovaryšská hůl", 10.0D, 50.0D),
    koule("Tovaryšská koule", 30.0D, 0.0D, 50.0D),
    plast("Hrdiny plášť", 50.0D, 20.0D, 150.0D),
    luk("Dragonův luk", 17.0D, 80.0D),
    kosile("Dragonova košile", 25.0D, 0.0D, 50.0D),
    ubor("Skutusův lovecký úbor", 40.0D, 0.0D, 90.0D),
    mec("Balorovů meč", 20.0D, 100.0D),
    sit("Balorův štít", 25.0D, 0.0D, 50.0D),
    armor("Balorov", 50.0D, 0.0D, 100.0D);

    private double hp;
    private String name;
    private double dmg;
    private double price;

    public double getHp() {
        return this.hp;
    }

    public String getName() {
        return this.name;
    }

    public double getDmg() {
        return this.dmg;
    }

    public double getPrice() {
        return this.price;
    }

    private Item(String name, double hp, double dmg, double price) {
        this.name = name;
        this.dmg = dmg;
        this.price = price;
        this.hp = hp;
    }

    private Item(String name, double dmg, double price) {
        this.name = name;
        this.dmg = dmg;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public String toString() {
        return this.name + ":\n+hp=" + this.hp + "\n+dmg=" + this.dmg + "\n+price=" + this.price + "\n";
    }
}
