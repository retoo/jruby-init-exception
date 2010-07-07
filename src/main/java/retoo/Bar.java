package retoo;

/**
 * Hello world!
 *
 */
public class Bar  {
    static {
        if (1 == (1 + 0)) {
          throw new RuntimeException("lets cause an init exception");
        }
    }
}
