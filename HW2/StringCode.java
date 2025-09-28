package HW2;

import java.util.HashSet;
import java.util.Set;

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
        int n = 1;
        for( int i = 0; i < str.length() - 1; i++ ) {
            int count = 1;
            while( i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1) ) {
                count++;
                i++;
            }
            if( count > n ) {
                n = count;
            }
        }
		return n; // YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
        StringBuilder blown = new StringBuilder();
        for( int i = 0; i < str.length(); i++ ) {
            char c = str.charAt(i);
            if( Character.isDigit(c) ) {
                int count = Character.getNumericValue(c);
                if( i < str.length() - 1 ) {
                    char next = str.charAt(i + 1);
                    for( int j = 0; j < count; j++ ) {
                        blown.append(next);
                    }
                }
            } else {
                blown.append(c);
            }
        }
		return blown.toString(); // YOUR CODE HERE
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
        Set<String> substrings = new HashSet<>();
        for( int i = 0; i <= a.length() - len; i++ ) {
            String sub = a.substring(i, i + len);
            substrings.add(sub);
        }
        for( int i = 0; i <= b.length() - len; i++ ) {
            String sub = b.substring(i, i + len);
            if( substrings.contains(sub) ) {
                return true;
            }
        }
		return false; // YOUR CODE HERE
	}
}