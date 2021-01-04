/* David C. - isLucky problem from CodeSignal
 ******************************************************
 * Given a ticket number n, determine if it's lucky
 *
 * Ticket numbers usually consist of an even number of
 * digits. A ticket number is considered lucky if the 
 * sum of the first half of the digits is equal to the 
 * sum of the second half.
 ******************************************************
 * Returns:
 * Whether the ticket is lucky or not.
 ******************************************************
 * NOTE: this solution works because the problem 
 * guarantees n%2 = 0
 */
boolean isLucky(int n) {
    String number = ""+n;
    int sum1 = 0;
    int sum2 = 0;
    
    String half1 = number.substring(0,number.length()/2);
    String half2 = number.substring(number.length()/2, number.length());
    for (int i = 0 ; i < half1.length() ; i++){
        sum1 += (int) half1.charAt(i);
        sum2 += (int) half2.charAt(i);
    }
    
    return sum1 == sum2;
}
