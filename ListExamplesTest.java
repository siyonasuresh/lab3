import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.*;

public class ListExamplesTest {
    @Test 
	public void testFilter() {
        StringChecker s;
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("broccoli");


        List<String> result = new ArrayList<>();
        result.add("broccoli");
        assertEquals(ListExamples.filter(list1, new ListExamples()), result);
	}

    @Test 
	public void testMerge() {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("broccoli");


        List<String> result = new ArrayList<>();
        result.add("broccoli");
        assertEquals(ListExamples.filter(list1, new ListExamples()), result);
	}
}
