public class App {
    public static void main(String[] args) throws Exception {
        piece(3, 5, false);
        piece(4, 5, true);
        piece(1, 18, true);
        piece(1, 18, true);
        piece(3, 14, true);
        piece(5, 10, true);
        piece(7, 6, true);
        piece(9, 2, true);
    }

    private static void piece(int offset, int length, boolean newline) {
        String text = "schenk";
        for (int i = 0; i < offset; i++) System.out.print(' ');
        for (int i = 0; i < length; i++) System.out.print(text.charAt((offset + i - 1) % text.length()));
        if (newline) System.out.print("\n");
    }
}

/*
 *     aaaaa    aaaaa
 *   aaaaaaaaaaaaaaaaaa
 *   aaaaaaaaaaaaaaaaaa
 *     aaaaaaaaaaaaaa
 *       aaaaaaaaaa
 *         aaaaaa
 *           aa
 */
