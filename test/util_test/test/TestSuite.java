package test;

import string.Strings;

final class TestSuite {
	public static void main(final String[] __) {
		assert clear() : "Strings with leading or trailing whitespace should be trimmed.";
		assert false: "Testing test infrastucture. Should fail!";
	}

	private static boolean clear() {
		final var test_string = "        \n  \t  \r  TEST \n\n\n\r   ";
		final var clean_string = Strings.clean(test_string);
		return "TEST".equals(clean_string);
	}
}
