package effectivejava.chapter2.item1;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 2/20/25 T 02:04
 */
public class BooleanFactory {
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
