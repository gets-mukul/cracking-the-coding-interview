public class StringCompression {
    /**
     * String Compression: Implement a method to perform basic string compression using the counts
     * of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
     * "compressed" string would not become smaller than the original string, your method should return
     * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
     */

    private final String input = "aabcccccaaa";

    public void compressString_1() {
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < input.length()) {
            int count = 1;
            char x = input.charAt(index);
            for (index = index + 1; index < input.length(); index++) {
                if (input.charAt(index) == x) {
                    count++;
                } else {
                    break;
                }
            }
            if (index == input.length()) {
                if (result.length() < input.length()) {
                    System.out.println("Compressed string is :" + result);
                } else {
                    System.out.println("Compressed string is not smaller then original string");
                }
            }
            result.append(x).append(count);
        }
    }
}
