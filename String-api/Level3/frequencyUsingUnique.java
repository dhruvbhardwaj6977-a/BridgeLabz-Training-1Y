public static String[][] frequencyUsingUnique(String text) {
    int[] freq = new int[256];

    for (int i = 0; i < text.length(); i++)
        freq[text.charAt(i)]++;

    char[] unique = uniqueChars(text);

    String[][] result = new String[unique.length][2];

    for (int i = 0; i < unique.length; i++) {
        result[i][0] = String.valueOf(unique[i]);
        result[i][1] = String.valueOf(freq[unique[i]]);
    }
    return result;
}
