/* David C. - almostIncreasingSequence problem from CodeSignal
 ******************************************************
 * Given a sequence of integers as an array, determine 
 * whether it is possible to obtain a strictly 
 * increasing sequence by removing no more than one 
 * element from the array.
 *
 * Strictly increasing: a[0] < a[1] < ... < a[n]
 ******************************************************
 * Returns:
 * * Boolean whether sequence is strictly increasing
 ******************************************************
 */
boolean almostIncreasingSequence(int[] sequence) {
    // Up to 1 removal allowed
    int removed = 0, a, b, c;
    
    for (int i = 0; i < sequence.length-2 && removed <= 2 ; i++){
        a = sequence[i]; // current element
        b = sequence[i+1]; // next element
        c = sequence[i+2]; // 2nd next element
        
        if (a >= b)
        {
            //"remove" = assigning a lesser value to the current element
            removed++;
            sequence[i] = b-1;
        }
        
        if (b >= c){ //next and 2nd next
            removed++;
            if (a == c){ //"remove" = assigning a higher value to the 2nd next element
                sequence[i+2]=b+1;
            }
            else { //"remove" = assigning the current value to the next element
                sequence[i+1]= a;
            }
        }
    }
    return removed < 2;
}
