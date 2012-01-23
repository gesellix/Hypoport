public class CloneExample implements Cloneable {

    /**
     * Overrides a method which is supposed to return an Object, but
     * this class returns a subtype instead.
     */
    @Override
    protected CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        // no cast needed here, because the overriding method declares the actual type.
        CloneExample cloneable = new CloneExample();
        CloneExample clonedObject = cloneable.clone();
    }
}
