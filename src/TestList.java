public class TestList {
    public static void main(String[] args) {
        CustomList<String> cl = new CustomList<String>();
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * 100);
            cl.add(Integer.toString(i)+"!!!");
        }
        cl.remove(12);
        System.out.println(cl);
    }
}
