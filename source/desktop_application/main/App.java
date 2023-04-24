package main;

import java.util.Arrays;
import logic.Logic;
import string.Strings;

/**
 * a desktop application.
 */
public interface App {
    /**
     * @param command_line_arguments printed
     */
    static void main(final String[] command_line_arguments) {
        System.out.println(Strings.clean("  desktop application  "));
        System.out.println(Arrays.toString(command_line_arguments));
        Logic.takeAction();
    }
}
