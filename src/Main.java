import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player p = new Player("Michal", 18, "dwarf", "warrior", 5, 20, 5, 0);
        Enemy e = new Enemy("Kuba", 15, "dwarf", "mage", 1, 15, 2, 10);
        Item i = Item.DIA_SWORD;
        Item i2 = Item.GOLDEN_AXE;

        e.setHp(e.getHp() - (i.getDmg() + p.getDmg()));
       p.setHp(p.getHp() - e.getDmg() - i2.getDmg());
    }
}
