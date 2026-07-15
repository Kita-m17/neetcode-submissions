class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        // String reversed = new StringBuilder(s).reverse().toString();

        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
