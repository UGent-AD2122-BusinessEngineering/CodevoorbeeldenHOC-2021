public class TestLinkedList {
    public static void main(String[] args) {
        StringLinkedList list = new StringLinkedList();
        System.out.println(list.lenght());
        list.addNodeToStart("eerste item");
        list.addNodeToStart("tweede item");
        list.addNodeToStart("derde item");
        list.showList();
        System.out.println(list.lenght());
        list.deleteHeadNode();
        list.showList();
        System.out.println(list.onList("eerste item"));
        System.out.println(list.onList("derde item"));
        System.out.println(list.lenght());
    }
}
