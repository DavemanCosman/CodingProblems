/* David C. - shapeArea problem from CodeSignal (Centered Square Number)
 ******************************************************
 * Find the area of a polygon for a given n.
 * A 1-interesting polygon is just a square with a side
 * of length 1. An n-interesting polygon is obtained by
 * taking the n - 1-interesting polygon and appending
 * 1-interesting polygons to its rim, side by side.
 ******************************************************
 * Returns:
 * area of squares taken up by n-interesting polygon
 *****************************************************
 */
int shapeArea(int n) {
    if (n == 1)
        return n;
    else
        return (int) (Math.pow((double)n,2) + Math.pow((double)n-1,2));
}
