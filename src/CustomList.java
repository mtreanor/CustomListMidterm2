public class CustomList<TheType> {
    Node<TheType> head;
    public CustomList() {

    }

    public void add(TheType val) {
        Node<TheType> node = new Node<TheType>(val);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node tail = this.head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = node;
    }

    public void remove(int removeIndex) {
        int count = 0;
        Node toRemove = this.head;
        Node prev = null;
        while (toRemove.next != null) {
            prev = toRemove;
            toRemove = toRemove.next;
            count++;
            if (count == removeIndex) {
                break;
            }
        }
        prev.next = toRemove.next;
    }

    @Override
    public String toString() {
        String str = "";
        Node n = this.head;
        while (n != null) {
            str += n.toString() + " ";
            n = n.next;
        }
        return str;
    }
}
