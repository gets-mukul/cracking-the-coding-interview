public class OneAway {
    /**
     * One Away: There are three types of edits that can be performed on strings: insert a character,
     * remove a character, or replace a character. Given two strings, write a function to check if they are
     * one edit (or zero edits) away.
     * EXAMPLE
     * pale, ple   -> true
     * pales, pale -> true
     * pale, bale  -> true
     * pale, bake  -> false
     */

    private final String input1 = "pale";
    private final String input2 = "bake";

    public void checkOneWay() {
        if (input1.length() == input2.length()) {
            replace(input1, input2);
        } else if (input1.length() > input2.length()) {
            edit(input1, input2);
        } else if (input1.length() < input2.length()) {
            edit(input2, input1);
        }
    }

    private void edit(final String largeInput, final String smallInput) {
        int largeIndex = 0;
        int smallIndex = 0;
        boolean check = false;
        while (smallIndex != smallInput.length() && largeIndex != largeInput.length()) {
            if (smallInput.charAt(smallIndex) != largeInput.charAt(largeIndex)) {
                if (check) {
                    System.out.println("Not One Edit Away");
                    return;
                }
                check = true;
                largeIndex++;

            } else {
                largeIndex++;
                smallIndex++;
            }
        }
        System.out.println("One Edit Away");
        return;
    }

    private void replace(final String largeInput, final String smallInput) {
        boolean check = false;
        for (int i = 0; i < largeInput.length(); i++) {
            if (largeInput.charAt(i) != smallInput.charAt(i)) {
                if (check) {
                    System.out.println("Not One Edit Away");
                    return;
                }
                check = true;
            }
        }
        System.out.println("One Edit Away");
        return;
    }
}
