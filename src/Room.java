import java.util.Scanner;

public class Room {
    private static final Scanner sc;

    public Room(Entity player, String character) {
        this.room(player, character);
        this.room1(player, character);
        this.room2(player, character);
        this.roomshop(player, character);
        this.room3(player, character);
        this.room4(player, character);

    }

    public void room(Entity player, String character) {
        double d = Math.random();
        System.out.println(d);
        Arena arena = new Arena("Kolebka Smrti");
        Enemy enemy;
        if (d <= 0.5D) {
            enemy = new Enemy("KUO-TOA", "frog", "f", 20.0D, 1, 10.0D, 10.0D, 10.0D);
            arena.fight(player, enemy);
        } else if (d < 0.8D) {
            enemy = new Enemy("BULETTE", "frog", "f", 30.0D, 1, 15.0D, 10.0D, 20.0D);
            arena.fight(player, enemy);
        } else {
            enemy = new Enemy("BEHOLDER", "frog", "f", 40.0D, 1, 20.0D, 10.0D, 30.0D);
            arena.fight(player, enemy);
        }

    }

    public void room1(Entity player, String character) {
        double d = Math.random();
        System.out.println(d);
        System.out.println("(1)Chceš jít do Hajira (2)nebo Divoký les");
        int f = sc.nextInt();
        Arena arena;
        Enemy enemy;
        switch(f) {
            case 1:
                arena = new Arena("Hajira");
                if (d < 0.599D) {
                    enemy = new Enemy("tiger", "beast", "carnivore", 40.0D, 2, 20.0D, 10.0D, 20.0D);
                    arena.fight(player, enemy);
                } else if (d < 0.888D) {
                    enemy = new Enemy("DISPLACER BEAST", "beast", "carnivore", 50.0D, 2, 20.0D, 10.0D, 30.0D);
                    arena.fight(player, enemy);
                } else {
                    enemy = new Enemy("BEAST", "beast", "carnivore", 60.0D, 2, 15.0D, 10.0D, 50.0D);
                    arena.fight(player, enemy);
                }
                break;
            case 2:
                arena = new Arena("Divoký les");
                if (d < 0.599D) {
                    enemy = new Enemy("wolf", "beast", "carnivore", 20.0D, 2, 40.0D, 10.0D, 20.0D);
                    arena.fight(player, enemy);
                } else if (d < 0.888D) {
                    enemy = new Enemy("dinga", "beast", "carnivore", 20.0D, 2, 40.0D, 10.0D, 30.0D);
                    arena.fight(player, enemy);
                } else {
                    enemy = new Enemy("", "beast", "carnivore", 10.0D, 2, 50.0D, 10.0D, 50.0D);
                    arena.fight(player, enemy);
                }
        }

        System.out.println("Našel jsi jídlo");
        player.setHp(player.getHp() + 25.0D);
        System.out.println(player.toString());
        System.out.println("(1)Další level (2)Jít na předchozí level");
        int g = sc.nextInt();
        switch(g) {
            case 1:
                this.room2(player, character);
                break;
            case 2:
                this.room(player, character);
        }

    }

    public void room2(Entity player, String character) {
        double d = Math.random();
        System.out.println(d);
        Arena arena = new Arena("Večný Háj");
        Enemy enemy;
        if (d < 0.599D) {
            enemy = new Enemy("OWLBEAR", "OWLBEAR", "scarecrow", 60.0D, 4, 15.0D, 10.0D, 30.0D);
            arena.fight(player, enemy);
        } else if (d < 0.888D) {
            enemy = new Enemy("Baer", "OWLBEAR", "carnivore", 70.0D, 2, 10.0D, 10.0D, 40.0D);
            arena.fight(player, enemy);
        } else {
            enemy = new Enemy("", "OWLBEAR", "carnivore", 100.0D, 2, 5.0D, 10.0D, 60.0D);
            arena.fight(player, enemy);
        }

        int g = sc.nextInt();
        switch(g) {
            case 1:
                this.roomshop(player, character);
                break;
            case 2:
                this.room1(player, character);
        }

    }

    public void roomshop(Entity player, String character) {
        new Shop(player, character);
        System.out.println("(1)Další level miniboss (2)Zůstat v obchodě  (3)Se vratit na předchozí level");
        int g = sc.nextInt();
        switch(g) {
            case 1:
                this.room3(player, character);
                break;
            case 2:
                this.roomshop(player, character);
                break;
            case 3:
                this.room2(player, character);
        }

    }

    public void room3(Entity player, String character) {
        Arena arena = new Arena("Jeskyně");
        Entity enemy = new Enemy("KOBOLD", "dragon", "fly", 100.0D, 2, 10.0D, 5000.0D, 10.0D);
        arena.fight(player, enemy);
        System.out.println("(1)Další level (2)Jít do obchodu");
        int g = sc.nextInt();
        switch(g) {
            case 1:
                this.room4(player, character);
                break;
            case 2:
                this.roomshop(player, character);
        }

    }

    public void room4(Entity player, String character) {
        double d = Math.random();
        System.out.println(d);
        Arena arena = new Arena("Grimford");
        Enemy enemy;
        if (d < 0.599D) {
            enemy = new Enemy("Zombie", "dead", "speedy", 300.0D, 5, 1.0D, 10.0D, 10.0D);
            arena.fight(player, enemy);
        } else if (d < 0.888D) {
            enemy = new Enemy("LICH", "dead", "carnivore", 150.0D, 2, 2.0D, 10.0D, 20.0D);
            arena.fight(player, enemy);
        } else {
            enemy = new Enemy("GITHYANKI", "dead", "carnivore", 100.0D, 2, 5.0D, 10.0D, 40.0D);
            arena.fight(player, enemy);
        }

        int g = sc.nextInt();
        switch(g) {
            case 1:
                this.room3(player, character);
                break;
            case 2:
                this.room5(player);
        }

    }

    public void room5(Entity player) {
    }

    static {
        sc = new Scanner(System.in);
    }
}