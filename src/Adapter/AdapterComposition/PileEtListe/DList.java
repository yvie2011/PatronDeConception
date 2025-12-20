package Adapter.AdapterComposition.PileEtListe;

public class DList {

    protected DNode head;
    protected DNode tail;

    public DList() {
        head = null;
        tail = null;
    }

    public void insert(Object o) {
        DNode node = new DNode(o);

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public Object removeLast() {
        if (tail == null) return null;

        Object data = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        return data;
    }

    public Object getLast() {
        return (tail == null) ? null : tail.data;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
