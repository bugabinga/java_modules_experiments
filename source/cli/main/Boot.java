package main;

import java.util.Arrays;
import logic.Logic;

/**
 * a terminal command
 */
public interface Boot {
    /**
     * @param command_line_arguments printed
     */
    static void main(final String[] command_line_arguments) {
        System.out.println("cli");
        System.out.println(Arrays.toString(command_line_arguments));

        Logic.takeAction();
    }
}
