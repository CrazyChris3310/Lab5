package utilities.commands;

import dragon.Dragon;
import input.Input;
import utilities.DragonCollection;

import java.util.ArrayList;

/**
 * Command "print_descending".
 */
public class PrintDescendingCommand extends Command{


    public PrintDescendingCommand(DragonCollection collection, Input input) {
        super(collection, input);
        description = "print_descending - show elements in descending order";
    }

    /**
     * Method prints elements of collection in descending order.
     */
    @Override
    public void execute() {
        ArrayList<Dragon> temp = new ArrayList<>(drg.getCollection());
        temp.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        temp.forEach(System.out::println);
    }
}
