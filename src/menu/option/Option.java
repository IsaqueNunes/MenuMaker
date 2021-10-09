package menu.option;

public class Option implements OptionInterface {

    private String name;
    private OptionInterface action;

    public Option(String name, OptionInterface action) {
        this.name = name;
        this.action = action;
    }   

    @Override
    public void start() {
        action.start();
    }

    @Override
    public String toString() {
        return name;
    }
}
