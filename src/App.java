import menu.Menu;
import menu.option.Option;
import menu.option.OptionNotFoundException;

public class App {
    public static void main(String[] args) {
        var signIn = new Option("SignIn", () -> {
            System.out.println("Sign In...");
        });

        var signOut = new Option("SignOut", () -> {
            System.out.println("Sign Out...");
        });

        var exit = new Option("exit", () -> {
            System.out.println("Exiting...");
        });

        var mainMenu = new Menu();
        
        mainMenu.addOption(signIn);
        mainMenu.addOption(signOut);
        mainMenu.addOption(exit);

        printMenu(mainMenu);

        // Use method from menu
        try {
            mainMenu.choose(0);
        } catch (OptionNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printMenu(Menu menu) {
        menu.getOptions().forEach(option -> {
            System.out.print("+");
            for (int i = 0; i < 7; i++) {
                System.out.print("-");
            }
            System.out.print("+");            
            for (int i = 0; i < 22; i++) {
                System.out.print("-");
            }
            System.out.print("+\n");            
            
            System.out.printf(
                "| %-5d | %-20s |\n",
                menu.getOptions().indexOf(option),
                option
            );
        });
        System.out.print("+");
        for (int i = 0; i < 7; i++) {
            System.out.print("-");
        }
        System.out.print("+");            
        for (int i = 0; i < 22; i++) {
            System.out.print("-");
        }
        System.out.print("+\n");            
    }
}
