import java.util.Objects;
import java.util.Scanner;

public class Shop {
    Scanner sc;

    public Shop(Entity player, String character) {
        this.sc = new Scanner(System.in);
        this.select(player, character);
    }

    public void select(Entity player, String character) {
        int g;
        if (Objects.equals(character, "m")) {
            IOUtil.printText("(1) " + Item.hul.toString());
            IOUtil.printText("(2) " + Item.koule.toString());
            IOUtil.printText("(3) " + Item.plast.toString());
            g = this.sc.nextInt();
            System.out.println("Kolik máš gold" + player.getMoney());
            switch(g) {
                case 1:
                    if (player.getMoney() >= Item.hul.getPrice()) {
                        player.setMoney(player.getMoney() - Item.hul.getPrice());
                        player.setDmg(player.getDmg() + Item.hul.getDmg());
                        System.out.println(player.toString());
                    } else {
                        System.out.println("Nemáš peníze");
                    }
                    break;
                case 2:
                    if (player.getMoney() >= Item.koule.getPrice()) {
                        player.setMoney(player.getMoney() - Item.koule.getPrice());
                        player.setHp(player.getHp() + Item.koule.getHp());
                        System.out.println(player.toString());
                    } else {
                        System.out.println("Nemáš peníze");
                    }
                    break;
                case 3:
                    if (player.getMoney() >= Item.plast.getPrice()) {
                        player.setMoney(player.getMoney() - Item.plast.getPrice());
                        player.setHp(player.getHp() + Item.plast.getHp());
                        player.setDmg(player.getDmg() + Item.plast.getDmg());
                        System.out.println(player.toString());
                    } else {
                        System.out.println("Nemáš peníze");
                    }
                    break;
                default:
                    this.select(player, character);
            }
        } else if (Objects.equals(character, "a")) {
            IOUtil.printText(Item.luk.toString());
            IOUtil.printText(Item.kosile.toString());
            IOUtil.printText(Item.ubor.toString());
            g = this.sc.nextInt();
            switch(g) {
                case 1:
                    if (player.getMoney() >= Item.luk.getPrice()) {
                        player.setMoney(player.getMoney() - Item.luk.getPrice());
                        player.setDmg(player.getDmg() + Item.luk.getDmg());
                        System.out.println(player.toString());
                    } else {
                        System.out.println("Nemáš peníze");
                    }
                    break;
                case 2:
                    if (player.getMoney() >= Item.kosile.getPrice()) {
                        player.setMoney(player.getMoney() - Item.kosile.getPrice());
                        player.setHp(player.getHp() + Item.kosile.getHp());
                        System.out.println(player.toString());
                    } else {
                        System.out.println("Nemáš peníze");
                    }
                    break;
                case 3:
                    if (player.getMoney() >= Item.ubor.getPrice()) {
                        player.setMoney(player.getMoney() - Item.ubor.getPrice());
                        player.setHp(player.getHp() + Item.ubor.getHp());
                        System.out.println(player.toString());
                    } else {
                        System.out.println("Nemáš peníze");
                    }
            }
        } else {
            IOUtil.printText(Item.mec.toString());
            IOUtil.printText(Item.sit.toString());
            IOUtil.printText(Item.armor.toString());
            g = this.sc.nextInt();
            switch(g) {
                case 1:
                    if (player.getMoney() >= Item.mec.getPrice()) {
                        player.setMoney(player.getMoney() - Item.mec.getPrice());
                        player.setDmg(player.getDmg() + Item.mec.getDmg());
                        System.out.println(player.toString());
                    } else {
                        System.out.println("Nemáš peníze");
                    }
                    break;
                case 2:
                    if (player.getMoney() >= Item.sit.getPrice()) {
                        player.setMoney(player.getMoney() - Item.sit.getPrice());
                        player.setHp(player.getHp() + Item.sit.getHp());
                        System.out.println(player.toString());
                    } else {
                        System.out.println("Nemáš peníze");
                    }
                    break;
                case 3:
                    if (player.getMoney() >= Item.armor.getHp()) {
                        player.setMoney(player.getMoney() - Item.armor.getPrice());
                        player.setHp(player.getHp() + Item.armor.getHp());
                        System.out.println(player.toString());
                    } else {
                        System.out.println("Nemáš peníze");
                    }
            }
        }

    }
}