package gb.seminars.list_reverse;

import gb.seminars.list_reverse.utils.*;

public class App {
    public static void main(String[] args) {
        OneWayList list = new OneWayList();
        list.addFirst(new OneWayNode(1));
        list.addFirst(new OneWayNode(2));
        list.addFirst(new OneWayNode(3));
        list.addFirst(new OneWayNode(4));
        list.addFirst(new OneWayNode(5));
        print(list);
        Reverse.oneWayListReverse(list);
        print(list);

        TwoWayList list2 = new TwoWayList();
        list2.addLast(new TwoWayNode(1));
        list2.addLast(new TwoWayNode(2));
        list2.addLast(new TwoWayNode(3));
        list2.addLast(new TwoWayNode(4));
        list2.addLast(new TwoWayNode(5));
        print(list2);
        list2.addFirst(new TwoWayNode(15));
        print(list2);
        Reverse.TwoWayListReverse(list2);
        print(list2);
    }

    public static void print(OneWayList list) {
        OneWayNode node = list.getHead();
        while (node != null) {
            System.out.println(node);
            node = node.getNext();
        }
        System.out.println("-------");
    }

    public static void print(TwoWayList list) {
        TwoWayNode node = list.getHead();
        while (node != null) {
            System.out.println(node);
            node = node.getNext();
        }
        System.out.println("-------");
    }
}



