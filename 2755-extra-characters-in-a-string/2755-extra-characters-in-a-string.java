class Solution {
    public int minExtraChar(String s, String[] dictionary) {
         Set<String> dict = new HashSet<>();
        for (String word : dictionary) {
            dict.add(word);
        }

        int n = s.length();
        int[] dp = new int[n + 1]; // dp[i] represents the minimum extra characters up to index i

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1; // Initialize dp[i] with the previous value plus 1

            for (int j = i; j >= 1; j--) {
                String sub = s.substring(j - 1, i); // Extract the substring from index j-1 to i

                if (dict.contains(sub)) {
                    dp[i] = Math.min(dp[i], dp[j - 1]); // Update dp[i] if a valid substring is found
                }
            }
        }

        return dp[n]; // Return the minimum extra characters up to the end of the string
    
    }
}