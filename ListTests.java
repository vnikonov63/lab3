import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

// added the required Libraries
import java.util.*;

public class ListTests {

    @Test
    public void testFilterGeneral() {
        List<String> input = Arrays.asList("lolo", "lol", "lilloo", "pi", "ro", "g");
        StringChecker sc = new CheckLength();
        List<String> expectedOutput = Arrays.asList("lolo", "lol", "lilloo");
        assertEquals(expectedOutput, ListExamples.filter(input, sc));
    }

    @Test
    public void mergeGeneral() {
        List<String> input1 = Arrays.asList("a", "c", "e", "g");
        List<String> input2 = Arrays.asList("b", "d", "f", "h");
        List<String> expectedOutput = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        assertEquals(expectedOutput, ListExamples.merge(input1, input2));
    }

}