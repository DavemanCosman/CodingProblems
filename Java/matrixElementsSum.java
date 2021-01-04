/* David C. - matrixElementsSum problem from CodeSignal
 ******************************************************
 * Given a 2D array representing cost of rooms in a
 * haunted hotel, determine the cost of all the 
 * non-haunted rooms.
 *
 * Haunted rooms are defined as:
 * * Free rooms (0)
 * * Any of the rooms below any of the free rooms.
 ******************************************************
 * Returns:
 * * Sum of all non-haunted rooms.
 ******************************************************
 */
 int matrixElementsSum(int[][] matrix) {
    int notSpooky = 0; //Sum to return
    boolean[] Spooky = new boolean [matrix[0].length]; //Keep track of the Spooky rooms from the top
    for (int i = 0 ; i < matrix.length ; i++){
        for (int j = 0 ; j < matrix[i].length ; j++){
            if (i == 0) {
                Spooky[j] = false; //Assume all rooms are not haunted in first pass
            }
            if (Spooky[j] == false){
                notSpooky = notSpooky + matrix[i][j]; //Add values of rooms together
                Spooky[j] = (matrix[i][j] != 0) ? false : true; //Check if room is haunted and remember for checking bottom rooms later
            }
        }
    }
    return notSpooky;
}

/* Self note:
 *
 * This problem can be improved upon by simply checking each column first
 * instead of each row first. In other words, flip the order of the for loops.
 * Then check if matrix[i][j]>0 and if it's not true, break in the inner loop.
 */