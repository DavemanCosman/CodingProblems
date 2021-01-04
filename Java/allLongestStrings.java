/* David C. - allLongestStrings problem from CodeSignal
 ******************************************************
 * Given an array of strings, return another array
 * containing all of its longest strings.
 ******************************************************
 * Returns:
 * Array of the longest strings, stored in the same
 * order as in the inputArray
 ******************************************************
 */
 import java.util.ArrayList;
 String[] allLongestStrings(String[] inputArray) {
    if (inputArray.length <= 1){
        return inputArray; //if the array is only one or none, then save time and just return it
    }
    
    List <String> longestStrings = new ArrayList<>(); // ArrayList makes adding and removing strings easier
    int max = inputArray[0].length(); //initialize the length of the max string with the first element

    for (int i = 0 ; i < inputArray.length ; i++){
        if (max < inputArray[i].length()){
            longestStrings.clear(); //clear the list, if longer string found
            max = inputArray[i].length();
        }
        
        if (max == inputArray[i].length()){
            longestStrings.add(inputArray[i]);//record word on list if length of current word is same as longest recorded
        }
    }
    
    return longestStrings.toArray(new String[longestStrings.size()]);
}
