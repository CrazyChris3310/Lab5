package utilities.commands;

import dragon.Person;
import exceptions.NoSuchKillerException;
import exceptions.WrongInputFormatException;
import input.Input;
import utilities.DragonCollection;

/**
 * Command "remove_any_by_killer".
 */
public class RemoveAnyByKillerCommand extends Command{


    public RemoveAnyByKillerCommand(DragonCollection collection, Input input) {
        super(collection, input);
        description = "remove_any_by_killer killer - remove from collection one element with given killer";
    }

    /**
     * Method inputs killer and removes an element with the same killer from collection.
     */
    @Override
    public void execute() {
        if (isInputStreamNotEmpty())
            return;

        Person killer;
        try {
            killer = input.inputKiller();
        } catch (WrongInputFormatException e) {
            System.out.println("Wrong data!");
            return;
        }

        try {
            drg.removeByKiller(killer);
        } catch (NoSuchKillerException e) {
            System.out.println("No such killer in the collection");
        }

    }
}
