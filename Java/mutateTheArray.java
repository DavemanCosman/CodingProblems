/* David C. - mutateTheArray problem from CodeSignal
 ******************************************************
 * Mutate a given array a of defined length n into a
 * new array b of length n, as follows:
 * * b[i] = a[i - 1] + a[i] + a[i + 1]
 * * if the element at that index i doesn't exist,
 *   replace with 0.
 ******************************************************
 * Returns:
 * * the mutated array b
 *****************************************************
 */
int[] mutateTheArray(int n, int[] a) {
    int b [] = new int [n];
    for (int i = 0 ; i<n ; i++){
	// using ternary operators makes the code short and efficient
        b[i] = (i!=0 ? a[i-1] : 0) + a[i] + (i!=n-1 ? a[i+1] : 0);
    }
    return b;
}
