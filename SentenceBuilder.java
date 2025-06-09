public class SentenceBuilder {
    public static void main(String[] args) {
        String sentence = "A quick brown fox jumps over the lazy dog";
        StringBuilder sb = new StringBuilder();
        // Nested loop: O(n^2) time intentionally
        for (int i = 0; i < sentence.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    sb.append(sentence.charAt(j));
                }
            }
        }

        System.out.println(sb.toString());
    }
}
