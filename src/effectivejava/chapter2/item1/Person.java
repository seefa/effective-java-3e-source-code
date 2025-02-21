package effectivejava.chapter2.item1;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 2/19/25 T 17:14
 */
public class Person {
    private final String name;
    private final int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person of(String name, int age) {
        return new Person(name, age);
    }

    public String getName() { return name; }

    public int getAge() { return age; }
}
