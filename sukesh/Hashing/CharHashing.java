import java.util.Scanner;

public class CharHashing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        int[] hash = new int[26];
        for(int i=0; i<str.length(); i++) {
            hash[(str.charAt(i) - (int)('a'))]++;
        }

        int q = s.nextInt();
        while (q-- >= 1) {
            char c = s.next().charAt(0);
            int ch = c;
            // fetch
            System.out.println("Count of " + ch + ": " + hash[ch - (int)'a']);
        }
    }
}
