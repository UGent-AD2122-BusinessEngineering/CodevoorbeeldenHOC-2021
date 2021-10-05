public class StringLinkedList2 {
    private ListNode head;
    private ListNode current;
    private ListNode previous;

    public StringLinkedList2() {
        head = null;
        current = null;
        previous = null;

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

    //OPGELET indien head = null wordt lijst ook leeggemaakt.
    public void resetIteration() {
        //head = null;
        current = head;
        previous = null;

    }

    public boolean moreToIterate() {
        if(current == null)
            return false;
        return true;
    }

    public void goToNext() {
        if (current != null) {
            previous = current;
            current = current.getLink();

        } else if (head != null) {
            System.out.println("End of List");

        } else {
            System.out.println("No elements on list");
        }
    }

    // nagaan of current niet null is
    public String getDataAtCurrent() {
        if(current != null)
            return current.getData();
        return null;

    }

    // nagaan of current niet null is
    public void setDataAtCurrent(String newData) {
        if(current !=null)
            current.setData(newData);

    }

    public void insertDataAfterCurrent(String newData) {

        if (current != null) {
            ListNode node = new ListNode(newData, current.getLink());
            current.setLink(node);

        } else if (head != null) {
            System.out.println("End of List");
        } else {
            System.out.println("Empty List");

        }

    }

    public void deleteCurrentNode() {
        if ((current != null) && (previous != null)) {
            previous.link = current.link;
            current  = current.link;

        } else if ((current != null) && previous == null) {
            head = current.link;
            current = head;
        } else {
            System.out.println("Empty List");

        }
    }

    public String[] toArray() {
        String[] anArray = new String[this.lenght()];
        ListNode position = head;
        int i = 0;
        while(position !=null){
            anArray[i] = position.getData();
            position = position.getLink();
            i++;
        }
        return anArray;
    }

    private class ListNode {
        private String data;
        private ListNode link;

        public ListNode() {
            link = null;
            data = null;
        }

        public ListNode(String data, ListNode link) {
            this.data = data;
            this.link = link;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
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
