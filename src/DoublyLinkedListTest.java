import static org.junit.Assert.*;
import org.junit.Test;

public class DoublyLinkedListTest {
    @Test
    public void addAfter() throws Exception {
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.addAfter(new Integer(1), 5);

        myList.printArray();

    }

}