public class URLify {
    /**
     * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
     * has sufficient space at the end to hold the additional characters, and that you are given the "true"
     * length of the string. (Note: If implementing in Java, please use a character array so that you can
     * perform this operation in place.)
     * EXAMPLE
     * Input: "Mr John Smith     ", 13
     * Output: "Mr%20John%20Smith"
     */

    private final String input = "Mr John Smith    ";
    private final int actualInputLength = 12;
    private final Character BLANK = ' ';

    // Space -> O(1), Time -> O(n)
    public void urlify_1() {
        final char[] inputArr = input.toCharArray();
        int indexFromLast = inputArr.length - 1;
        for (int i = actualInputLength; i >= 0; i--) {
            if (inputArr[i] == BLANK) {
                inputArr[indexFromLast--] = '0';
                inputArr[indexFromLast--] = '2';
                inputArr[indexFromLast--] = '%';
            } else {
                inputArr[indexFromLast--] = inputArr[i];
            }
        }
        for (char x : inputArr) {
            System.out.print(x + ", ");
        }
    }

}
