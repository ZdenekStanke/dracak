import java.util.Scanner;

public class IOUtil {
    public static Scanner sc;

    public IOUtil() {
    }

    public static String getInput() {
        return sc.nextLine();
    }

    public static void printText(String text) {
        try {
            String[] var1 = text.split(" ");
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                String s = var1[var3];
                char[] var5 = s.toCharArray();
                int var6 = var5.length;

                for(int var7 = 0; var7 < var6; ++var7) {
                    char c = var5[var7];
                    Thread.sleep(1L);
                    System.out.print(c);
                }

                System.out.print(" ");
                Thread.sleep(20L);
            }

            System.out.println();
        } catch (Exception var9) {
            System.out.println(var9);
        }

    }

    static {
        sc = new Scanner(System.in);
    }
}
