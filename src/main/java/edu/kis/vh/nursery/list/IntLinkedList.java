package edu.kis.vh.nursery.list;

public class IntLinkedList {
    // TODO: Verify if the 'IntLinkedList' class is used properly (unused class)
    private static final int EMPTY = -1;
    private Node last;
    private int i;
    // TODO: delete unused 'i' field

    public void push(int i) {
        // TODO: Verify if the 'push' method is used properly (unused method)
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull()
    {   // TODO: unused method and always returns false - delete method or add implementation
        return false;
    }

    public int top() {
        // TODO: Verify if the 'top' method is used properly (unused method)
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    public int pop() {
        // TODO: Verify if the 'pop' method is used properly (unused method)
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private class Node {

        private final int value;
        private Node prev, next;

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

}
