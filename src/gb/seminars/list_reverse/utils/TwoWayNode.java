package gb.seminars.list_reverse.utils;

public class TwoWayNode {
    private TwoWayNode previous;
    private TwoWayNode next;
    private Integer value;

    public TwoWayNode() {
        this(null);
    }

    public TwoWayNode(Integer value) {
        this.value = value;
    }

    public TwoWayNode getNext() {
        return this.next;
    }

    public void setNext(TwoWayNode node) {
        this.next = (TwoWayNode) node;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public TwoWayNode getPrevious() {
        return this.previous;
    }

    public void setPrevious(TwoWayNode node) {
        this.previous = (TwoWayNode) node;
    }

    @Override
    public String toString() {
        return "TwoWayNode{" +
                "self=" + hashCode() +
                ", nextNode=" + (next != null ? next.hashCode() : "null") +
                ", previousNode=" + (previous != null ? previous.hashCode() : "null") +
                ", value=" + value +
                '}';
    }
}