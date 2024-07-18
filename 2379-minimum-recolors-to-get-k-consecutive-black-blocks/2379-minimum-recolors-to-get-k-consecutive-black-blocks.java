class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minRecolors = Integer.MAX_VALUE;
        int whiteCount = 0;
        // Initialize the first window of size k
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }
        // Initialize minRecolors with the count of white blocks in the first window
        minRecolors = whiteCount;
        // Use two pointers to slide the window
        for (int i = k; i < n; i++) {
            // Add the new block on the right
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
            // Remove the block that is sliding out on the left
            if (blocks.charAt(i - k) == 'W') {
                whiteCount--;
            }
            // Update minRecolors if a new minimum is found
            minRecolors = Math.min(minRecolors, whiteCount);
        }
        
        return minRecolors;
    }
}
