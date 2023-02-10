package gb.seminars.list_reverse.utils;

public class TwoWayList {
    private TwoWayNode head;
    private TwoWayNode tail;

    public TwoWayNode getHead() {
        return head;
    }

    public TwoWayNode getTail() {
        return tail;
    }

    public void setHead(TwoWayNode node) {
        this.head = node;
    }

    public void setTail(TwoWayNode node) {
        this.tail = node;
    }

    public void addFirst(TwoWayNode node) {
        if (head != null) {
            node.setNext(head);
            node.setPrevious(null);
            head.setPrevious(node);
        } else {
            tail = node;
        }
        head = node;

    }

    public void addLast(TwoWayNode node) {
        if (tail != null) {
            node.setPrevious(tail);
            tail.setNext(node);
        } else {
            head = node;
        }
        tail = node;
    }

    public TwoWayNode getNode(Integer value) {
        TwoWayNode node = head;
        while (node != null) {
            if (node.getValue() == value) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.getNext();
            head.setPrevious(null);
        }
    }

    public void deleteLast() {
        if (tail != null) {
            tail = tail.getPrevious();
            tail.setNext(null);
        }
    }

}



