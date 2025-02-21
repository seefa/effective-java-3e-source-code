package effectivejava.chapter2.item1;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 2/21/25 T 18:46
 */
public class FactoryMain {

    public static void main(String[] args) {
        // Usage 1: Calling Static Factory Methods
        Person p = Person.of("John", 30);
        // Sample Boolean.valueOf()
        Boolean b = Boolean.valueOf(true);
    }
}
