package menu.option;

public class OptionNotFoundException extends Exception {

    public OptionNotFoundException(int chosenOption) {
        super(String.format("We couldn't find option ", chosenOption));
    }
}
