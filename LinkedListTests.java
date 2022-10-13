import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test 
	public void testPrepend() {
    LinkedList list1 = new LinkedList();
    list1.prepend(5);
    list1.prepend(3);
    assertEquals(list1.root.value, 3);
	}

    @Test 
	public void testAppend() {
    LinkedList list1 = new LinkedList();
    list1.append(1);
    list1.append(3);
    list1.append(5);
    assertEquals(list1.root.next.next.value, 5);
	}

    @Test 
	public void testFirst() {
    LinkedList list1 = new LinkedList();
    list1.append(1);
    list1.append(3);
    list1.append(5);
    list1.prepend(0);
    assertEquals(list1.first(), 0);
	}

    @Test 
	public void testLast() {
    LinkedList list1 = new LinkedList();
    list1.append(1);
    list1.append(3);
    list1.append(5);
    list1.prepend(0); 
    assertEquals(list1.last(), 5);
	}

    @Test 
	public void testToString() {
    LinkedList list1 = new LinkedList();
    list1.append(1);
    list1.append(3);
    list1.append(5);
    list1.prepend(0); 
    System.out.println(list1.toString());
    assertEquals(list1.toString(), "0 1 3 5 ");

    LinkedList list2 = new LinkedList();
    list2.append(1);
    assertEquals(list2.toString(), "1 ");
	}

    @Test 
	public void testLength() {
    LinkedList list1 = new LinkedList();
    list1.append(1);
    list1.append(3);
    list1.append(5);
    list1.prepend(0); 
    assertEquals(list1.length(), 4);

    LinkedList list2 = new LinkedList();
    list2.append(1);
    assertEquals(list2.length(), 1);
	}
}
