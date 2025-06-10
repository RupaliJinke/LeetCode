class Solution {
    public String reverseWords(String s) {
         String[] wordsArray = s.trim().split("\\s+");
      
        // Convert the array of words into a list for easy manipulation
        List<String> wordsList = new ArrayList<String>(Arrays.asList(wordsArray));
      
        // Reverse the order of the words in the list
        Collections.reverse(wordsList);
      
        // Join the reversed list of words into a single string separated by a single space
        String reversed = String.join(" ", wordsList);
      
        // Return the reversed string
        return reversed;
    }
}