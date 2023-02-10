package gb.seminars.list_reverse.utils;

public class OneWayList {
    private OneWayNode head;

    public OneWayNode getHead() {
        return head;
    }

    public void setHead(OneWayNode node) {
        this.head = node;
    }

    public void addFirst(OneWayNode node) {
        if (head != null) {
            node.setNext(head);
        }
        head = node;
    }

    public void addLast(OneWayNode node) {
        OneWayNode lastNode;
        if (head != null) {
            lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(node);
        } else {
            head = node;
        }
    }

    public OneWayNode getNode(Integer value) {
        OneWayNode node = head;
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
        }
    }

    public void deleteLast() {
        OneWayNode node = head;
        if (node != null) {
            if (node.getNext() == null) {
                head = null;
            }
            while (node.getNext() != null) {
                if (node.getNext().getNext() == null) {
                    node.setNext(null);
                    return;
                }
                node = node.getNext();
            }

        }

    }


}
