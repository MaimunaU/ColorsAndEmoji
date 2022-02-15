public class Butterfly {
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String GREEN = "\u001B[32m";
    private final String BROWN = "\u001B[33m";
    private final String BUTTERFLY = "\uD83E\uDD8B";
    private final String FLOWER = "\uD83C\uDF3B";
    private String name;

    public Butterfly(String name) {
        this.name = name;
    }

    public void introduce()
    {
        System.out.println(GREEN + "Hello! I'm Bella Butterfly. Nice to meet you!");
    }

    public void animate() throws InterruptedException
    {
        System.out.println(BLUE_BRIGHT + "             \\     /");
        System.out.println("          -------------");
        System.out.println("          |     |     |");
        System.out.println("          ----  |  ----");
        System.out.println("          |     |     |");
        System.out.println(FLOWER + "        --------------");
        Thread.sleep(500);

        System.out.println("                  \\     /");
        System.out.println("               -------------");
        System.out.println("               |     |     |");
        System.out.println("               ----  |  ----");
        System.out.println("               |     |     |");
        System.out.println(FLOWER + "              --------------");
        Thread.sleep(500);

        System.out.println("               \\     /");
        System.out.println("            -------------");
        System.out.println("            |     |     |");
        System.out.println("            ----  |  ----");
        System.out.println("            |     |     |");
        System.out.println(FLOWER + "           --------------");
        Thread.sleep(500);

        System.out.println("            \\     /");
        System.out.println("         -------------");
        System.out.println("         |     |     |");
        System.out.println("         ----  |  ----");
        System.out.println("         |     |     |");
        System.out.println(FLOWER + "        --------------");
        Thread.sleep(500);

        System.out.println("           \\     /");
        System.out.println("        -------------");
        System.out.println("        |     |     |");
        System.out.println("        ----  |  ----");
        System.out.println("        |     |     |");
        System.out.println(FLOWER + "       --------------");
        Thread.sleep(500);

        System.out.println("          \\     /");
        System.out.println("      -------------");
        System.out.println("      |     |     |");
        System.out.println("      ----  |  ----");
        System.out.println("      |     |     |");
        System.out.println(FLOWER + "        --------------");
        Thread.sleep(500);

        System.out.println("    \\     /");
        System.out.println(" -------------");
        System.out.println(" |     |     |");
        System.out.println(" ----  |  ----");
        System.out.println(" |     |     |");
        System.out.println(FLOWER + "--------------");
        System.out.println(GREEN + "Ahh... sweet, sweet nectar.");
        Thread.sleep(500);
    }


}
