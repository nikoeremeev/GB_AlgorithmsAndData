package gb.seminars.list_reverse.utils;

public class Reverse {
    public static void oneWayListReverse(OneWayList list) {
        OneWayNode node = list.getHead();
        OneWayNode next = node.getNext();
        OneWayNode previous = null;
        while (next != null) {
            if (previous == null) {
                node.setNext(null);
            } else {
                node.setNext(previous);
            }
            previous = node;
            node = next;
            next = next.getNext();
        }
        node.setNext(previous);
        list.setHead(node);
    }

    public static void TwoWayListReverse(TwoWayList list) {
        TwoWayNode node = list.getHead();
        TwoWayNode next = node.getNext();
        TwoWayNode previous = null;
        while (next != null) {
            if (previous == null) {
                node.setNext(null);

            } else {
                node.setNext(previous);
            }
            node.setPrevious(next);
            previous = node;
            node = next;
            next = next.getNext();
        }
        node.setPrevious(null);
        node.setNext(previous);
        list.setTail(list.getHead());
        list.setHead(node);
    }
}
