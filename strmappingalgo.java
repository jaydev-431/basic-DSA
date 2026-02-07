public class strmappingalgo {

    // Returns index where pattern first occurs in text, or -1 if not found
    public static int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;

            // Check characters one by one
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // If full pattern matched
            if (j == m) {
                return i;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        String text = "ABABDABABC";
        String pattern = "ABC";

        int index = search(text, pattern);

        if (index == -1)
            System.out.println("Pattern not found");
        else
            System.out.println("Pattern found at index: " + index);
    }
}
