// Logic 1 - Iterative
public static boolean isPalindrome(String text) {
    int start = 0, end = text.length() - 1;
    while (start < end) {
        if (text.charAt(start) != text.charAt(end))
            return false;
        start++;
        end--;
    }
    return true;
}

// Logic 2 - Recursive
public static boolean isPalindromeRec(String text, int start, int end) {
    if (start >= end)
        return true;
    if (text.charAt(start) != text.charAt(end))
        return false;
    return isPalindromeRec(text, start + 1, end - 1);
}

// Logic 3 - Reverse and Compare
public static boolean isPalindromeArray(String text) {
    char[] original = text.toCharArray();
    char[] reverse = new char[original.length];

    for (int i = 0; i < original.length; i++)
        reverse[i] = text.charAt(original.length - 1 - i);

    for (int i = 0; i < original.length; i++)
        if (original[i] != reverse[i])
            return false;

    return true;
}
