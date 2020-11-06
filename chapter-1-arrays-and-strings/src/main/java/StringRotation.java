public class StringRotation {
    /**
     * String Rotation:Assume you have a method isSubstring() which checks if one word is a substring
     * of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
     * call to isSubstring() (e.g., "waterbottle" is a rotation of"erbottlewat").
     */

    private final String input1 = "waterbottle";
    private final String input2 = "erbottlewat";

    // Space -> O(1), Time -> O(n)
    public void stringRotation_1() {
        if (input1.length() != input2.length()) {
            System.out.println("No! input 1 is not a rotation of input 2");
            return;
        }
        for (int i = 0; i < input2.length(); i++) {
            if (input2.charAt(i) == input1.charAt(0)) {
                final Boolean isRightSubString = checkRightSubString(i);
                if (isRightSubString) {
                    final Boolean result = isSubstring(input1, input2.substring(i, input1.length()));
                    if(result){
                        System.out.println("Yes! input 1 is rotation of input 2");
                        return;
                    }
                }
            }
        }
        System.out.println("No! input 1 is not a rotation of input 2");
    }

    private Boolean checkRightSubString(final int index) {
        int input_1_Index = 0;
        for (int i = index; i < input2.length(); i++) {
            if (input2.charAt(i) != input1.charAt(input_1_Index++)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    private Boolean isSubstring(final String string, final String subString) {
        if (string.contains(subString)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
