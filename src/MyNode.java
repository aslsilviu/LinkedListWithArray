
public class MyNode {
    public Object payload;
    public int prevLink = -1;
    public int nextLink = -1;

    public MyNode(Object payload){
        this.payload = payload;
    }
}
