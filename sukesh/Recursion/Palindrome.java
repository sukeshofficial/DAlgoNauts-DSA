class Palindrome {
    static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    static boolean isPalindrome(String s, int start, int end){
        if(start > end) return true;                        // base case

        if(s.charAt(start) != s.charAt(end)) return false;  // palindrome condition

        return isPalindrome(s, start + 1, end - 1);         // recursive case
    }

    public static void main(String[] args) {
        System.out.println("ABCDCBA is palindrome? " + isPalindrome("ABCDCBA"));
        System.out.println("TAKE U FORWARD is palindrome? " + isPalindrome("TAKE U FORWARD"));
        System.out.println("SUKESHSEKUS is palindrome? " + isPalindrome("SUKESHSEKUS"));
    }
}
