import java.util.NoSuchElementException;

public class DoublyLinkedList {
    public int head = -1;
    public int last;
    public int elementsNo;

    MyNode[] container = new MyNode[16];

    public void addAfter(Object payload, int index){
        MyNode currentNode;
        MyNode newNode = new MyNode(payload);
        if(head == -1){
            head = 0;
            last = 0;
            elementsNo++;
        } else {
            if(container[index] == null) throw new NoSuchElementException("no element in array at index = " + index);
            currentNode = container[index];

            int arrayIndex = getFirstAvailableIndexInArray();
            container[arrayIndex] = newNode;
            int temp = currentNode.nextLink;
            currentNode.nextLink = arrayIndex;
            newNode.nextLink = temp;

        }
    }

    int getFirstAvailableIndexInArray(){
        for(int i=0;i<16;i++){
            if(container[i] == null){
                return i;
            }
        }
        return -1;
    }

    public void printArray(){
        for(int i=0; i<16; i++){
            System.out.println(container[i] == null ? "null" : "arr index = "+ i + "; payload = "+ container[i].payload + "; prev = "+ container[i].prevLink + "; next = "+ container[i].nextLink);
        }
    }
}
