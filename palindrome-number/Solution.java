class Solution {
    public boolean isPalindrome(int x) {
        if (x < 10 && x >= 0) return true;
        
        else if (x < 0) return false;
        
        return readsTheSame(String.valueOf(x));
    }
    
    public boolean readsTheSame(String x) {
        int length = x.length();
        int j;
        for (int i = 0; i < length; i++) {
            j = length - (i+1);
            if (x.charAt(i) != x.charAt(j))
                return false;
        }
        
        return true;
    }
}
