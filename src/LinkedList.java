public class LinkedList<E> {
    private ListNode head;

    public LinkedList() {

    }

    public void showList(){

    }

    public int length(){
        return 0;
    }

    public void addNodeToStart(E addData){

    }

    public void deleteHeadNode(){

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
