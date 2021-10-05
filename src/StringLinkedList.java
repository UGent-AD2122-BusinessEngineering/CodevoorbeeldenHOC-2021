import java.util.List;

public class StringLinkedList {
    private ListNode head;

    public StringLinkedList() {
        head = null;
    }

    public void showList(){
        ListNode node = head;
        while(node != null){
            System.out.println(node.getData());
            node = node.getLink();
        }

    }

    public int lenght(){
        int lengte = 0;
        ListNode node = head;
        while(node != null){
            lengte++;
            node = node.getLink();
        }

        return lengte;
    }

    public ListNode find(String target) {
        ListNode node = head;
        while (node != null) {
            if (node.getData().equals(target))
                return node;
            node = node.getLink();

        }
        return null;
    }

    public boolean onList(String target){
        return find(target) !=null;
    }

    public void addNodeToStart(String addData){
        ListNode node = new ListNode(addData, head);
        head = node;

    }

    //Opgelet controleren of head niet null is
    public void deleteHeadNode(){
        head = head.getLink();

    }


}
