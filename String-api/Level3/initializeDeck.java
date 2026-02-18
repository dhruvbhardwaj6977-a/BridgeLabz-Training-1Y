public static String[] initializeDeck(String[] suits, String[] ranks) {
    int n = suits.length * ranks.length;
    String[] deck = new String[n];
    int index = 0;

    for (String suit : suits)
        for (String rank : ranks)
            deck[index++] = rank + " of " + suit;

    return deck;
}

public static void shuffleDeck(String[] deck) {
    int n = deck.length;
    for (int i = 0; i < n; i++) {
        int random = i + (int)(Math.random() * (n - i));
        String temp = deck[i];
        deck[i] = deck[random];
        deck[random] = temp;
    }
}
