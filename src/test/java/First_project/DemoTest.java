package First_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

    @Test
    public void testDemo() {
        democlass demo = new democlass();
        String expected = "hello";
        String actual = demo.demo();
        assertEquals(expected, actual);
    }

    @Test
    public void testDemoNotNull() {
        democlass demo = new democlass();
        assertNotNull(demo.demo());
    }

    @Test
    public void testDemoNotEmpty() {
        democlass demo = new democlass();
        assertFalse(demo.demo().isEmpty());
    }

}
