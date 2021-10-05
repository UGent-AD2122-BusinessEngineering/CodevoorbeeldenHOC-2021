public class LinkedList<E> {
    private ListNode head;

    public LinkedList() {
        head = null;
    }

    public void showList(){
        ListNode current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.getLink();
        }
    }

    public int length(){
        int lengte=  0;
        ListNode current = head;
        while(current != null){
            lengte++;
            current = current.getLink();
        }
        return lengte;
    }

    public void addNodeToStart(E addData){
        head= new ListNode(addData, head);
    }

    public void deleteHeadNode(){
        if(head !=null)
            head = head.getLink();
    }

    public boolean onList(E target){
        return find(target) != null;
    }

    public ListNode find(E target){
        return null;
    }


    public class ListNode {
        private E data;
        private ListNode link;

        public ListNode() {
            link = null;
            data = null;
        }

        public ListNode(E data, ListNode link) {
            this.data = data;
            this.link = link;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public ListNode getLink() {
            return link;
        }

        public void setLink(ListNode link) {
            this.link = link;
        }

    }

}
