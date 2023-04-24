package string;

/**
 * collection of string extensions
 */
public interface Strings {
    /**
     * clean up a string by removing leading ang trailing whitespace.
     * 
     * @param string the string to clean up
     * @return clean string
     */
    static String clean(final String string) {
        return string.strip();
    }
}
