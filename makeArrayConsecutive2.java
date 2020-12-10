/* David C. - makeArrayConsecutive2 problem from CodeSignal
 ******************************************************
 * Given an array of statues, each with a non-negative
 * integer height size, sort them in ascending order
 * so that each statue is bigger than the previous one
 * by exactly 1.
 *
 * Return the amount of statues needed to close the 
 * bigger than 1 size gaps.
 ******************************************************
 * Returns:
 * * Boolean whether array is sorted in strictly
 *   ascending order (b[0] < b[1] < ... < b[n])
 *****************************************************
 */
 int makeArrayConsecutive2(int[] statues) {
    //sorting can be done programmatically as well
	Arrays.sort(statues);
    int missing = 0;
    
    for (int i = 0 ; i < statues.length-1 ; i++){
        missing = (statues[i+1] - statues[i] == 1) ? missing : statues[i+1] - statues[i] - 1 + missing;
    }
    
    return missing;
}
