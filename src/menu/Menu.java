package menu;
import java.util.ArrayList;

import menu.option.Option;
import menu.option.OptionNotFoundException;

public class Menu {
    private ArrayList<Option> options = new ArrayList<>();

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public void choose(int id) throws OptionNotFoundException {
        if (id > options.size() || id < 0) {
            throw new OptionNotFoundException(id);
        }
        options.get(id).start();
    }
}
