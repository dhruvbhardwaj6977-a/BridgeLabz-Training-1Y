public static boolean isLeap(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

public static int getFirstDay(int month, int year) {
    int y0 = year - (14 - month) / 12;
    int x = y0 + y0/4 - y0/100 + y0/400;
    int m0 = month + 12 * ((14 - month) / 12) - 2;
    return (1 + x + (31 * m0) / 12) % 7;
}
