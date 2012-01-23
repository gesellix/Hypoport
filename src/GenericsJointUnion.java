import java.util.Collection;

public class GenericsJointUnion {
    public static <A, B extends Collection<A> & Comparable<B>> boolean foo(B b1, B b2, A a) {
        return (b1.compareTo(b2) == 0) || b1.contains(a) || b2.contains(a);
    }
}
