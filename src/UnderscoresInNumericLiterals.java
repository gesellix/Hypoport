/**
 * @see <a href="http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">JDK docs</a>.
 */
public class UnderscoresInNumericLiterals {
    // needs Java 7+, see http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    //private static int number_with_underscores = 567_89_1234;
    private static int number_with_underscores = 567891234;
    private static int number_without_underscores = 567891234;

    public static void main(String[] args) {
        System.out.println(UnderscoresInNumericLiterals.number_with_underscores == UnderscoresInNumericLiterals.number_without_underscores);
    }
}
