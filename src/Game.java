import java.io.PrintStream;
import java.util.Scanner;
import java.io.File;



public class Game {
    Entity Wiz;
    Entity A;
    Entity Wa;
    private static Scanner sc;
    public static String jk;
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_RESET = "\u001B[0m";

    public static String nick() {
        System.out.println(TEXT_PURPLE +"   _____      _   _       _       _        _    ___          ___    _ \n" +
                "  / ____|    | | ( )     | |     (_)      | |  | \\ \\        / / |  | |\n" +
                " | |     __ _| |_|/ ___  | | __ _ _ _ __  | |  | |\\ \\  /\\  / /| |  | |\n" +
                " | |    / _` | __| / __| | |/ _` | | '__| | |  | | \\ \\/  \\/ / | |  | |\n" +
                " | |___| (_| | |_  \\__ \\ | | (_| | | |    | |__| |  \\  /\\  /  | |__| |\n" +
                "  \\_____\\__,_|\\__| |___/ |_|\\__,_|_|_|     \\____/    \\/  \\/    \\____/ "  + TEXT_RESET);



System.out.println("Ahoj já jsem vypravěč a provedu tě příběhem ");




        System.out.println("Hezká, ale vyvržená středoškolačka je naverbována pro tajnou vládní misi s cílem infiltrovat nepřátelské zařízení, ale padouch je mistrný stratég, který s nimi manipuluje na každém kroku a tvým úkolem je najít a porazit tohoto stratéga!!!!!");
        System.out.println("Zadejte svouj nick");


        String jk = sc.nextLine();
        return jk;
    }

    public Game() {
        this.Wiz = new Player(jk, "SEXY holka", "Wizzard", 80.0D, 1, 30.0D, 0.0D, 100.0D);
        this.A = new Player(jk, "Sexy Anděl", "Archer", 150.0D, 1, 15.0D, 0.0D, 100.0D);
        this.Wa = new Player(jk, "SEXY holka", "Warrior", 200.0D, 10, 10.0D, 0.0D, 100.0D);
        this.Wizzard();
        this.Archer();
        this.Warrior();
        System.out.println(TEXT_PURPLE +" Abychom jsme se mohli vrhnout na to musíš si vybrat postavu : "+ TEXT_RESET);
        this.game();


    }

    public void Wizzard() {
        System.out.println(TEXT_PURPLE +"Kouzla není jediná její silná síla UwU"+ TEXT_RESET);
        System.out.println("  ⠀⠀⠀⠀⢼⣥⡶⠤⠽⢯⡀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⢀⠀⢰⠀⠀⠀⠀⠀⠀⣠⣴⣾⣭⣭⣥⣬⡑⢶⣶⣖⡲⢄⣼⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢀⠔⠋⠀⠀⠀⠀⠀⠈⠑⠦⡀⠀⠀⠀⠀⠈⠀⠀⢠⠀⡌⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣷⣸⣿⣿⣟⣂⢻⣻⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⡰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢢⡀⠀⠀⠀⠀⢀⠎⡜⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢻⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⡄⠀⠀⢀⢎⠐⠀⠀⠀⢀⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⡀⣠⡾⠁⠀⠀⠀⠀⣼⣿⡧⣸⣿⢿⢻⡟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⡀⠀⠀⠀⠀⠀⢠⢿⣿⡇⠘⡏⠈⠐⠋⠉⠙⣿⣿⣿⣿⣛⠻⣿⣿⣿⣿⣿⣿⣿⣿⡟⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠙⢦⠀⠀⠀⠀⢨⡿⣿⣟⣻⡇⣀⢀⣴⣦⣤⣥⡿⠟⢁⡟⡓⣿⣿⠟⣿⢻⣿⣿⢿⣇⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠑⢄⠀⠀⠀⠀⠟⠗⢺⠏⠧⣄⣀⣉⡟⠉⠁⠀⢘⣀⣼⡿⠋⢰⡏⠈⣿⡿⠈⢿⠀⠀⠙⠢⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠈⠢⡀⠈⠳⣄⠀⠀⠀⢸⠘⠀⠀⠀⠀⠀⠀⠀⠀⠸⡝⠈⣿⣀⣀⠸⠇⠀⣿⡇⠀⠘⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⠀⠀⠙⢦⠀⠈⠢⡀⠀⠀⢣⠲⠄⠤⠀⠀⠀⠀⠀⠀⣀⣤⣿⣿⡇⠀⠀⠀⡿⠁⠀⠀⠘⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠑⢄⠀⠙⢦⠀⠀⢇⠠⠤⣶⣦⣠⣴⣾⣿⣿⣿⣿⣿⡇⠀⠀⠐⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⠀⠳⣄⠀⠑⢄⠀⠰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠈⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⡀⠈⠳⣄⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣦⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠈⠓⢤⣀⠀⠀⢀⣀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⣷⣄⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠻⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⣿⣿⣿⣷⣄⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠄⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣼⣮⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠢⡀⠈⠣⡈⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠙⢦⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠑⢄⠀⠙⢿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠙⢿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢠⡦⣠⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣅⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⡀⠀⠻⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⣟⠃⢣⠘⡄⠀⠀⠀⠀⠀⠀⢀⣤⣤⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢦⡀⠈⠻⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⡇⡆⠸⠀⠡⡀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢄⠀⠘⢿⣿⣿⠟⢦⡀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢣⢱⠀⣇⢀⢷⠖⠦⠤⠴⣟⠉⠉⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⣄⠀⠙⢿⣧⡀⠙⡆⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠈⢏⢦⠈⢢⠙⠳⢅⣀⣀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠈⠳⡀⠀⠙⣷⣄⠸⡀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠳⣕⡄⠡⡀⠀⠀⠀⣉⣠⣀⡤⢶⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡆⠀⡜⣦⡀⠈⠻⣆⢧⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠒⠿⠟⠓⠛⠉⠉⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠢⢌⡹⣿⣆⠀⠈⠺⠆⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣷⣄⠀⠑⢄\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠳⣤⡎\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣼\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠟⠜⠁\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠉⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        PrintStream var10000 = System.out;
        Object[] var10002 = new Object[1];
        String var10005 = this.Wiz.getRole();
        var10002[0] = var10005 + "\n race:" + this.Wiz.getRace() + "\n hp:" + this.Wiz.getHp() + "\n lv:" + this.Wiz.getLv() + "\n mana:" + this.Wiz.getMana() + "\n money:" + this.Wiz.getMoney();
        var10000.printf("Role:%s %n", var10002);
    }

    public void Archer() {
        System.out.println(TEXT_PURPLE +"Archer, ale luk není jediná její zbran OwO"+ TEXT_RESET);
        System.out.println("                   !               .-.        _                                 _,\n" +
                "          .---\"\"\"\"``\"-,}              :   `\"-.__.' \\`-.                        _..-\"/_,-\"\"\\\n" +
                "         /_.,-          \\            /     ,  _,    \\_.--.                 _.-\"            `.\n" +
                "       .'.'              '.         /     .'\\/.-\\    ; \"\"-;              .'                  `,\n" +
                "      ':\"                  \\      .'     /\"    `-;    \\    \\           .'            __        `.\n" +
                "      /       .-\"           \\   .' .'   :-\"\"\"``\"-:     :    ;         /             \",\"'         \\\n" +
                "    .'      .'               '.'  ;     :  /    ` '    ;    ;       .'  .--.._         `-,       :\n" +
                "   /        ; /              ;   /;    :' ;   ; `  \\    :    ;     /   /      }     ,  \\_='      |\n" +
                "  /          `\\             _;  : ;   /|  |  ;   ;  \\   ;    ;  __i-, /.-,-, :     .'   \\        |\n" +
                " ;   ;        /   \\        `,; :_;   / ;  ;  ;\\  \\   \\   :  _T-\" .-' / : _.','    /      ;       :\n" +
                " |  /         ;    ;          ;| ;  ; __; ;\\  ;\\  J_  \\  :-\"   .'   :   I.  :    :       :       ;\n" +
                " : :         ;     | `,       `|T   |`,(()\\ `\"  T;());/=\" :  .'\\   :   / : /  /` :      /         \\\n" +
                "  }|         |     ;   \\       ;;   | ,\"=-'      `.,=' ;   F' : ; __\"`/ ;_/  /    \\    /           :\n" +
                "  ||         ;    ^     :      `;   ;. \\    <       /  ; ; :   :`;  i`,; :  /    , :  /            :\n" +
                "  ||          \\  ; :    | ,     ;    \\  `,   <=   .'_.'   ;:   ;-'     ;/  {     : | /       ,     :\n" +
                "  :|      :    ; ' `,   |  \\ _.' \\    `,\"\"`-,    ,\"/      /   /       /     }    | |/        ;    /\n" +
                "  !:      |    ;:    `, :`-,\\/,/ /\\     \\    Y==` /      /;  ;       /    .'|    ;/;        /   .'\n" +
                "    \\     ;     \\      `!  ,'.' :  `.    \\  ; />`/     .'_,; \\     ,' .'1\"  |  ,' `        ;  .'\n" +
                "     \\     ;   ' `       .' /   |   _`\"-, ;\"`._.'_  -'\"    |  ;   F :/  `   :.'           ;  /\n" +
                "      `,   :   :       ,'  /    ; .' ,-' `i _//;  `,      /| ;    ;  \\     :/             ; /\n" +
                "        :\\  :  ;          :    /.'.-'      /\\  ;    \\    ( ; |    |   :        /    /  ; ; /\n" +
                "         \\: :   \\        :     ;.'        /  :/|     \\    \\ ;|    :   \\       :    /   / |/\n" +
                "         :|  \\   \\   \\   |    ;/         /   T |      \\    :`:     ;   \\      |   :   :  ;'\n" +
                "         !;   \\   \\   \\  |    ;         /   :  :       `.  |;      ;    \\     |   :   ;  |\n" +
                "           ;   `.  \\   \\ |   /\\   .'   ;    :   :        \\ ;.      `;   ;     ;  /|  ;   ;\n" +
                "            ,    `, \\,  \\:  :  `.:\"    ;  .'^   |         `J        ;   \\`,  / .' : /  ;/\n" +
                "             \\     \\ ;`. \\\\ ;    `@__.^-'\"   `. ; `,  /   /|        ,`-, ;  ;.' .' /  /`\n" +
                "              \\     `!  `.:\\ ;                 \"+,_.a._,-' ;        ^  ;\\ : `  / .'   ;\n" +
                "               `.    `,`,_` `;                     `\"`  `\"-,;      / ) : \\|   :.'/   /\n" +
                "                 `-,   \\ `-,_`-.__                          `-,   / :.'   :   / ;   /\n" +
                "                    \\   `,  `,`\"  `\"\"--..__.....-----.._       `\"\"\\\"`     | /:  |  /\n" +
                "                     `,   ;   \\                         `.     \"-, `.     ;' ;  ; /\n" +
                "    fsc                \\  :`,  :                          `-,__ ',`. \\   `  / .' /\n" +
                "                        \\  : `,!                               `\",`,`,J   .'+' .'\n" +
                "                         `,!                                      `J\"    `\"/_.'");
        PrintStream var10000 = System.out;
        Object[] var10002 = new Object[1];
        String var10005 = this.A.getRole();
        var10002[0] = var10005 + "\n race:" + this.A.getRace() + "\n hp:" + this.A.getHp() + "\n lv:" + this.A.getLv() + "\n mana:" + this.A.getMana() + "\n money:" + this.A.getMoney();
        var10000.printf("Role:%s %n", var10002);
    }

    public void Warrior() {
        System.out.println(TEXT_PURPLE +"Tuhle holku nechceš naštvat"+ TEXT_RESET);
        System.out.println(" ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⠤⠤⠤⠤⠤⠤⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢤⠖⠉⠠⠀⠀⠀⠁⠀⠀⠀⠁⠀⠈⠲⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣔⡋⣴⠀⢇⠢⡀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠉⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⡿⠼⠢⠿⠀⣱⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠄⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡫⠛⣸⠗⡒⢴⠃⠒⠀⢲⠀⠀⠰⡀⠀⢣⠀⠀⠀⢇⠘⡌⠀⡵⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣏⠐⣱⡯⢪⣚⡏⠀⠀⠀⣼⠠⠀⡆⡋⡄⠈⡆⠀⠀⠸⣆⢳⢈⡔⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢨⣄⣿⢩⡉⣿⣸⢡⠀⢼⣹⢠⢸⡹⠀⠸⡀⢳⡆⠀⠀⣿⡈⡏⠐⢘⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢰⣸⡿⣴⢺⡿⣿⢎⠀⣾⠇⢠⡿⠁⠀⠀⢳⠀⣼⠀⠀⢸⡇⡇⢸⢘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡌⣺⡇⠷⣿⡟⡇⡠⣰⡿⢀⡾⠁⠀⢀⠀⠜⣆⢻⣸⠀⢸⢻⣏⢸⣭⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢹⣿⡷⣶⣿⡁⡗⣨⣯⣫⢞⣠⡴⢾⣷⣶⠉⣇⢸⣿⠀⢬⢸⡏⢼⣯⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢨⣩⣿⣭⡿⣿⣧⣿⡳⠃⠀⠉⠀⡈⠛⠛⠜⢹⣹⡏⠀⢘⡞⡇⢸⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡗⡖⢿⣿⠧⢸⠿⢫⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠃⠀⣿⣿⡇⢸⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⢪⢺⣿⡀⠀⠀⠰⠄⠀⠀⠀⠀⠀⠀⠀⠀⣠⡟⠀⢀⣿⣿⡇⢸⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣗⣉⣿⣿⣆⡀⠀⠀⠄⣀⡀⠤⠀⠀⣠⠞⡿⠂⠀⢸⣿⢿⣷⣿⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⢹⢹⣿⡿⣿⣶⣤⣀⠈⠁⡠⡔⠷⡁⣼⠋⠀⠀⡇⢿⡿⣿⢿⠸⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣘⠿⣿⢿⣿⣿⣿⣿⣿⣿⣵⣿⡜⢹⠏⠀⠀⠰⡀⠜⠛⢻⡿⣇⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠤⣒⣭⡵⣟⡄⣿⣧⣿⣿⣿⣷⣿⣿⣿⣿⣿⡏⠀⠀⢠⣯⡀⡢⢔⠁⠀⣀⠽⠥⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⢊⣴⠞⠈⡑⢀⡷⢲⣿⣿⣿⣿⣿⣿⢾⡟⣿⣿⡿⠁⠀⠈⠎⠠⠛⢳⢦⣞⠑⢄⢀⡀⠌⠒⠲⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⢊⣴⠉⠀⢀⠌⢤⣾⢏⣿⢟⠛⠿⣿⣿⣿⣿⣻⣟⣻⠃⠀⠀⡜⠔⠁⢀⠌⠀⢻⡷⣎⠑⢄⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⢡⡇⠁⠀⠈⢨⣴⢿⡼⢒⣵⠿⠓⣤⣈⣉⠉⠉⠉⣩⠏⠀⠀⢠⠋⠀⠔⠁⣠⠖⠁⠈⠪⢷⡀⠱⡀⠀⠀⠀⠀⠑⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⢠⢡⡗⡰⠀⠀⣔⡷⠛⢁⣴⠗⠁⡠⠊⠀⠀⠀⠀⠐⣇⡿⠀⠀⢠⠇⡠⠀⢀⠞⠁⠀⠀⠀⠀⠙⡻⡄⠐⡄⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⡘⣿⠑⠁⢀⠜⠁⣠⡺⠋⢀⠔⠁⠀⠀⠀⠀⠀⠀⡪⢚⡇⢰⠀⣌⠂⠈⡂⠁⠀⠀⠀⠀⠀⠀⠀⠨⣳⡀⠰⠀⠀⠀⠀⠀⢡⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠐⣾⠃⠉⠀⢅⣴⠞⠋⢀⠔⠁⠀⠀⠀⠀⠀⢀⢔⠕⠕⡿⢀⡇⢠⡁⠠⠈⠀⠑⢄⠀⠀⠀⠀⠀⠀⠀⢹⣧⠀⡇⠀⠀⠀⠀⠈⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢤⡎⡑⠒⢴⠀⣿⠁⠢⠀⡊⠋⣶⠶⣦⣄⡠⡂⠠⠊⠀⡇⡸⢱⢸⣿⡄⠀⠀⠀⠀⢂⠀⠀⠀⠀⠀⠀⠈⣿⡀⢰⠀⠀⠀⠀⠀⢡⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠉⣾⣷⡄⠀⠀⠀⠾⣵⠒⠒⢺⠀⢿⠀⠀⠐⠀⠀⠥⢀⡉⠭⠎⣀⡣⠤⠀⢇⣇⠤⢽⣿⣿⡄⠀⠀⠀⠀⢃⠀⠀⠀⠀⠀⠀⡿⠇⢀⣀⠀⠠⠤⠤⠼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢧⣧⣕⢝⢷⣄⠀⠀⣙⠒⢲⣦⡆⢸⡇⢸⠀⠀⠀⠀⠀⠐⠀⠀⠐⠂⠁⠉⠘⢷⠒⢚⠻⣿⣷⠠⠤⠤⠤⠬⡀⠤⠒⠒⠈⠁⣽⡏⢡⠀⢀⡀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢪⣭⡭⣧⣪⠏⠀⢠⢡⣷⣼⣟⣧⢸⡇⢸⠀⠀⠀⠀⠀⢰⢠⢠⠀⠀⠀⠀⠀⠈⠁⠁⠀⠀⢉⡄⠠⠠⠤⠤⣤⠤⠔⠒⠒⠒⠰⣶⠘⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⣼⢧⣔⣾⣣⣯⣫⡉⢺⡿⣿⣷⣿⣻⣧⡘⠀⠀⠀⠀⠀⠨⠸⢸⠀⠀⠀⠀⠀⠀⠰⠀⠀⢀⡮⢡⠤⠤⠠⠤⠤⡀⠤⠔⠒⠒⠒⣿⠐⡖⠊⠉⠁⠀⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢆⣾⣠⣼⢝⠀⠙⢷⣼⣆⠊⢛⢟⣿⣼⠈⡀⠉⠉⠉⠉⠹⠐⢺⠤⢀⡀⠀⠀⠀⡆⠀⠀⣸⠁⠀⠂⠀⡠⠀⠤⢤⣤⣤⣤⣤⣤⣿⣤⣥⣴⠒⠉⠉⢉⠄⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠷⢿⣹⣵⣟⠆⠀⠀⢿⣿⣆⠠⢊⣿⣿⠀⡇⠀⠀⠀⠀⠈⠀⡀⠀⠀⠈⠐⢤⡀⠀⠀⢠⡯⠠⠤⢄⠎⠀⠀⠀⠘⣿⣿⣿⢷⣿⢿⣟⣿⣿⡠⣔⡄⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠿⠭⣾⣷⠋⠀⠀⠀⠊⢿⣿⡄⡄⢸⠛⡷⣇⡀⠠⠠⠤⠤⣇⡅⠀⠀⠀⠀⠀⢸⠁⠀⡼⠀⠀⠀⡌⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⡿⠟⠋⠁⠀⢸⡇⠀⣀⢅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠉⢫⠀⠇⠀⠀⠀⠀⠇⠈⠻⣥⠓⠆⣤⡇⡆⠀⠀⠀⠀⠀⡇⡇⠉⠓⠢⣄⠀⢆⡀⠠⡷⠀⠀⠂⠀⠀⠀⠀⠀⠀⣄⠉⠉⠁⢳⡄⢀⣠⠤⠖⢟⡇⠀⠀⠈⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n  ");
        PrintStream var10000 = System.out;
        Object[] var10002 = new Object[1];
        String var10005 = this.Wa.getRole();
        var10002[0] = var10005 + "\n race:" + this.Wa.getRace() + "\n hp:" + this.Wa.getHp() + "\n lv:" + this.Wa.getLv() + "\n mana:" + this.Wa.getMana() + "\n money:" + this.Wa.getMoney();
        var10000.printf("Role:%s %n", var10002);
    }

    public void game() {
        System.out.println("(m) mag");
        System.out.println("(a)Archer");
        System.out.println("(w)warriors");
        String character = sc.nextLine();
        Entity player = null;
        byte var4 = -1;
        switch(character.hashCode()) {
            case 97:
                if (character.equals("a")) {
                    var4 = 1;
                }
                break;
            case 109:
                if (character.equals("m")) {
                    var4 = 0;
                }
                break;
            case 119:
                if (character.equals("w")) {
                    var4 = 2;
                }
        }

        switch(var4) {
            case 0:
                player = this.Wiz;
                IOUtil.printText("Vybral sis sexy magainu");
                break;
            case 1:
                player = this.A;
                IOUtil.printText("Vybral sis sexy archerku");
                break;
            case 2:
                player = this.Wa;
                IOUtil.printText("vybral sis sexy warriorku");
                break;
            default:
                this.game();
        }

        new Room(player, character);
    }

    static {
        sc = new Scanner(System.in);
        jk = nick();

    }



}





