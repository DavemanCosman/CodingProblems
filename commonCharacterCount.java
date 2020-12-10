/* David C. - allLongestStrings problem from CodeSignal
 ******************************************************
 * Given two strings of lowercase English letters, find
 * the number of common characters between them.
 ******************************************************
 * Returns:
 * Number of common characters between two strings.
 ******************************************************
 * NOTE: this solution works because the problem 
 guarantees the strings will consist of lowercase English letters.*/
int commonCharacterCount(String s1, String s2) {
    int count = 0;
    for (int i = 0 ; i < s1.length() ; i++){
        for (int j = 0 ; j < s2.length() ; j++){
            if (s1.charAt(i) == s2.charAt(j)){
                count++;
                s2 = s2.replaceFirst(""+s2.charAt(j),"-"); // Replace the first instance of the matched character with "-" to filter it out
                break;
            }
        }
    }
    return count;
}

/* Possible improvements:
 * Can convert the strings to character arrays using String.toCharArray()
 */