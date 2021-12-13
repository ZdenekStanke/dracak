
public class Arena {
    private String name;
    private boolean isRunning = true;

    public Arena(String name) {
        this.name = name;
    }



    public void fight(Entity player, Entity enemy) {
        System.out.println("Nachazite se v arene " + this.name);

        while(this.isRunning) {
            this.printEntities(player, enemy);
            this.round(player, enemy);
        }

    }

    private void printEntities(Entity player, Entity enemy) {
        IOUtil.printText(player.toString());
        IOUtil.printText(enemy.toString());
    }

    private void round(Entity player, Entity enemy) {
        System.out.println("1. Utok");
        System.out.println("2. Obrana");
        System.out.println("3. dodge");
        System.out.print("Zadejte cislo: ");

        try {
            int i = Integer.parseInt(IOUtil.getInput());
            double d;
            switch(i) {
                case 1:
                    IOUtil.printText(player.getName() + " zautocil");
                    d = Math.random();
                    if (d < 0.5D) {
                        IOUtil.printText(enemy.getName() + " zautocil");
                        enemy.setHp(Math.floor(enemy.getHp() - player.getDmg()));
                        if (this.isEnemyDead(player, enemy)) {
                            return;
                        }

                        player.setHp(Math.floor(player.getHp() - enemy.getDmg()));
                        if (this.isPlayerDead(player)) {
                            return;
                        }

                        return;
                    }

                    IOUtil.printText(enemy.getName() + " se brani");
                    enemy.setHp(Math.floor(enemy.getHp() - player.getDmg() / 3.0D));
                    this.isEnemyDead(player, enemy);
                    break;
                case 2:
                    IOUtil.printText(player.getName() + " se brani");
                    d = Math.random();
                    if (d < 0.5D) {
                        IOUtil.printText(enemy.getName() + " zautocil");
                        player.setHp(Math.floor(player.getHp() - enemy.getDmg() / 3.0D));
                        if (this.isPlayerDead(player)) {
                            return;
                        }

                        return;
                    }

                    IOUtil.printText(enemy.getName() + " se brani");
                    IOUtil.printText("Nic se nestalo :/");
                    break;
                case 3:
                    IOUtil.printText(player.getName() + " dodge");
                    d = Math.random();
                    if (d < 0.33D) {
                        IOUtil.printText(enemy.getName() + " zautočí");
                        player.setHp(Math.floor(player.getHp() - enemy.getDmg() * 0.0D));
                        if (this.isPlayerDead(player)) {
                            return;
                        }

                        return;
                    }

                    IOUtil.printText(enemy.getName() + " se brani");
                    IOUtil.printText("Nic se nestalo :/");
                    break;
                default:
                    this.round(player, enemy);
            }
        } catch (Exception var6) {
            this.round(player, enemy);
        }

    }

    private boolean isPlayerDead(Entity player) {
        if (player.getHp() <= 0.0D) {
            this.isRunning = false;
            IOUtil.printText("Nepritel te porazil");
            return true;
        } else {
            return false;
        }
    }

    private boolean isEnemyDead(Entity player, Entity enemy) {
        if (enemy.getHp() <= 0.0D) {
            this.isRunning = false;
            IOUtil.printText(player.getName() + "vyhrava");
            player.setMoney(player.getMoney() + enemy.getMoney());
            player.setLv(player.getLv() + 1);
            if (player.getLv() >= 2) {
                player.setHp(player.getHp() * 1.05D);
                player.setDmg(player.getDmg() + 3.0D);
            } else if (player.getLv() >= 5) {
                player.setHp(player.getHp() * 1.1D);
                player.setDmg(player.getDmg() + 5.0D);
            }

            return true;
        } else {
            return false;
        }
    }
}
