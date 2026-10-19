class Solution {
    public String reorganizeString(String s) {
        // Step 1: Count frequency of each character
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                maxHeap.offer(new int[]{i, freq[i]}); // [char index, count]
            }
        }
        // Step 3: Initialize a StringBuilder for the result
        StringBuilder result = new StringBuilder();
        // Step 4: Track the previous character and its remaining count
        int[] prev = {-1, 0}; // [char index, count]

        // Step 5: While the heap is not empty
        while (!maxHeap.isEmpty()) {
            int[] curr = maxHeap.poll();
            // Append current character
            result.append((char)(curr[0] + 'a'));
            curr[1]--;

            // If previous character still has remaining count, push it back
            if (prev[1] > 0) {
                maxHeap.offer(prev);
            }
            // Set current as previous for next iteration
            prev = curr;
        }

        // Step 6: If the result length matches the input, return result; else, return empty string
        if (result.length() == s.length()) {
            return result.toString();
        } else {
            return "";
        }
    }
    
}