import java.util.ArrayList;

public class Entity {
    private String name;
    private  int lv;
    private String race;
    private  String role;
    private double hp;
    private double mana;
    private double dmg;
    private double money;
    private ArrayList<Item> inv = new ArrayList<>();


    public Entity(String name, int lv, String race, String role, double hp, double mana, double dmg, double money) {
        this.name = name;
        this.lv = lv;
        this.race = race;
        this.role = role;
        this.hp = hp;
        this.mana = mana;
        this.dmg = dmg;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
