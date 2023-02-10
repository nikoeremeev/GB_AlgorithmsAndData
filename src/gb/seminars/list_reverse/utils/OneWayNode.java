package gb.seminars.list_reverse.utils;


public class OneWayNode {
    private OneWayNode next;
    private Integer value;

    public OneWayNode() {
    }

    public OneWayNode(Integer value) {
        this.value = value;
    }

    public OneWayNode getNext() {
        return this.next;
    }

    public void setNext(OneWayNode node) {
        this.next = (OneWayNode) node;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "OneWayNode{" +
                "self=" + hashCode() +
                ", nextNode=" + (next != null ? next.hashCode() : "null") +
                ", value=" + value +
                '}';
    }
}
