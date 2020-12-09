/* David C. - alternatingSort problem from CodeSignal
 ******************************************************
 * Take the first element from an array, then the last,
 * then the second, then the last but one in an
 * alternating way.
 ******************************************************
 * Returns:
 * * Boolean whether array is sorted in strictly
 *   ascending order (b[0] < b[1] < ... < b[n])
 *****************************************************
 */
boolean alternatingSort(int[] a) {
    int[] b = new int[a.length];
    int j = 0;
    for (int i = 0 ; i < a.length ; i++){
        
        if (i%2 == 0){
            b[i] = a[j];
            j++;
        }
        else {
            b[i] = a[a.length-j];
        }
        
        if (i>=1){
            if (b[i-1] >= b[i]){
                return false; //no need to check the rest of the array if it isn't
            }
        }
    }
    return true;
}
