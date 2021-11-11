public class CustomLinkedListDemo {
    public static void main(String[] args) {
        // 1. Instantiate a custom linked list
        CustomList list = new CustomList();

        // 2. Fill it up with 100 values
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        // 3. Print out the contents of my custom linked list
        for (int i = 0; i < 100; i++) {
            int val = list.get(i);
            System.out.println(val);
        }
        try {
            int val = list.get(150);
            System.out.println(val);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index was out of bounds.");
        }
    }
}
