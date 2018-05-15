public class BrowserStack implements IStack {

    private Node first;
    public int size;

    @Override
    public void addPage(String hyperlink) {
        Node temp = first;
        first = new Node(hyperlink);
        first.setNext(temp);
        size++;
    }

    @Override
    public Node removePage() {
        if (isEmpty()) {
            throw new StackIsEmptyException("Cannot remove from empty stack");
        } else {
            Node temp = first;
            first = first.getNext();
            return temp;
        }
    }

    @Override
    public Node backPage() {
        if (isEmpty()) {
            throw new StackIsEmptyException("Cannot remove from empty stack");
        } else {
            return first;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
}
