

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            // Convert word to character array
            char[] chars = word.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Create a key from sorted characters
            String key = new String(chars);

            // If this key is new, create an empty list for it
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the original word to its anagram group
            map.get(key).add(word);
        }

        // Return only all grouped lists
        return new ArrayList<>(map.values());
    }
}
