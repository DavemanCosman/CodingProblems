/* David C. - adjacentElementsProduct problem from CodeSignal
 ******************************************************
 * Given an array of integers, find the pair of
 * adjacent elements that has the largest product and 
 * return that product.
 ******************************************************
 * Returns:
 * largest product of adjecent elements
 *****************************************************
 */
int adjacentElementsProduct(int[] inputArray) {
    int largest = inputArray[0] * inputArray[1]; //First and second positions
    for (int i = 1 ; i < inputArray.length-1 ; i ++){
        largest = (inputArray[i] * inputArray[i+1] > largest) ? inputArray[i] * inputArray[i+1] : largest; 
    }
    return largest;
}
