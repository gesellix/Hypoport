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
    }};

    public ClassInitializer() {
        System.out.println("\nnon static elements, initialized before constructor:");
        for (String element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        new ClassInitializer();
    }
}
