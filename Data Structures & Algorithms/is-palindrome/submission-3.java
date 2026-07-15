class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
