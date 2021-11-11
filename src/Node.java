public class Node<T> {
    public Node next;
    public T value;
    public Node(T v) {
        this.value = v;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
