import java.util.ArrayList;

public class Entity {
    private String name;
    private String race;
    private String role;
    private double hp;
    private int lv;
    private double dmg;
    private double mana;
    private double money;
    private ArrayList<Item> inv = new ArrayList();
    private boolean dead = false;

    public Entity(String name, String race, String role, double hp, int lv, double dmg, double mana, double money) {
        this.name = name;
        this.race = race;
        this.role = role;
        this.hp = hp;
        this.lv = lv;
        this.dmg = dmg;
        this.mana = mana;
        this.money = money;
    }

    protected Entity() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public String getRace() {
        return this.race;
    }

    public String getRole() {
        return this.role;
    }

    public double getHp() {
        return this.hp;
    }

    public int getLv() {
        return this.lv;
    }

    public double getDmg() {
        return this.dmg;
    }

    public double getMana() {
        return this.mana;
    }

    public double getMoney() {
        return this.money;
    }

    public String toString() {
        return this.name + ":\nhp=" + this.hp + "\ndmg=" + this.dmg + "\nlv=" + this.lv + "\ngold=" + this.money + "\n";
    }
}
