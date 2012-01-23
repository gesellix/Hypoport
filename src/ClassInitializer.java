import java.util.ArrayList;
import java.util.List;

public class ClassInitializer {

    static {
        System.out.println("\nstatic initialization comes first");
    }

    static {
        System.out.println("static init 1");
    }

    {
        System.out.println("\ninstance initialization comes later");
    }

    {
        System.out.println("instance init 1");
    }

    static {
        System.out.println("static init 2");
    }

    {
        System.out.println("instance init 2");
    }

    private List<String> elements = new ArrayList<String>() {{
        add("element1");
        add("element2");

        // implicitly, we've got a reference to the outer Object, so we can write something like below,
        // but the reference to an outer class can lead to memory leaks!
        System.out.println("outer class: " + ClassInitializer.this.getClass());
    }};

    public ClassInitializer() {
        System.out.println("\nnon static elements, initialized before constructor:");
        for (String element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        new ClassInitializer() {{
            System.out.println("\ninstance init 3");
        }};
    }
}
