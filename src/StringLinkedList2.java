public class StringLinkedList2 {
    private ListNode head;
    private ListNode current;
    private ListNode previous;

    public StringLinkedList2() {

    }

    public void showList() {

    }

    public int length() {
        return 0;
    }


    public boolean onList(String target) {
        return find(target) != null;
    }

    public ListNode find(String target) {
        return null;
    }

    public void resetIteration() {

    }

    public boolean moreToIterate() {
        return true;
    }

    public void goToNext() {
        if (current != null) {

        } else if (head != null) {

        } else {

        }
    }

    public String getDataAtCurrent() {
        return "";

    }

    public void setDataAtCurrent(String newData) {

    }

    public void insertDataAfterCurrent(String newData) {

        if (current != null) {

        } else if (head != null) {

        } else {

        }

    }

    public void deleteCurrentNode() {
        if ((current != null) && (previous != null)) {

        } else if ((current != null) && previous == null) {

        } else {

        }
    }

    public String[] toArray() {
        return null;
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
