class Solution {
    public String countAndSay(int n) {
        if (n <= 0)
            return null;  // Return null for invalid input
        String result = "1";  // Base case: first term is "1"
        int i = 1;
        while (i < n) {  // Loop to generate terms up to the n-th term
            StringBuilder sb = new StringBuilder();  // To build the next term
            int count = 1;  // Initialize count of the current digit
            for (int j = 1; j < result.length(); j++) {  // Traverse the current term
                if (result.charAt(j) == result.charAt(j - 1)) {  // If same as previous character
                    count++;  // Increment count
                } else {
                    sb.append(count);  // Append count
                    sb.append(result.charAt(j - 1));  // Append the digit
                    count = 1;  // Reset count for the new digit
                }
            }
            sb.append(count);  // Append count for the last digit
            sb.append(result.charAt(result.length() - 1));  // Append the last digit
            result = sb.toString();  // Update result to the new term
            i++;  // Move to the next term
        }
        return result;  // Return the final term
    }
}