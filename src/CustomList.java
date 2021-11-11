import java.util.ArrayList;

public class CustomList {
    CustomNode head;

    public CustomList() {

    }

    public void add(int n) {
        // 1. Create the new node with the value
        CustomNode newNode = new CustomNode(n);

        // 2.1 If the list is empty, set the head to the new node and end the method.
        if (head == null) {
            this.head = newNode;
            return;
        }

        // 2.2 Find the tail of the list.
        CustomNode node = this.head;
        while (node.next != null) {
            node = node.next;
        }
        // we now know that 'node' is the tail of the list

        // 3. Point the tail of the list to the new node.
        node.next = newNode;
    }

    public void remove(int index) {
        if (index == 0) {
            this.head = this.head.next;
            return;
        }

        if (index == this.length()) {
            CustomNode before = this.getNode(index - 1);
            before.next = null;
            return;
        }

        CustomNode before = this.getNode(index - 1);
        CustomNode after = this.getNode(index + 1);
        before.next = after;
    }

    public int length() {
        int counter = 0;
        CustomNode node = this.head;
        while (node != null) {
            node = node.next;
            counter++;
        }
        return counter;
    }

    public int get(int index) throws IndexOutOfBoundsException {
        int counter = 0;
        CustomNode node = this.head;
        while (node != null) {
            if (counter == index) {
                return node.value;
            }
            node = node.next;
            counter++;
        }
        throw new IndexOutOfBoundsException();
    }

    public CustomNode getNode(int index) throws IndexOutOfBoundsException {
        int counter = 0;
        CustomNode node = this.head;
        while (node != null) {
            if (counter == index) {
                return node;
            }
            node = node.next;
            counter++;
        }
        throw new IndexOutOfBoundsException();
    }
}
