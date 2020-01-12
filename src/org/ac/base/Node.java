package org.ac.base;

public class Node<Item> {

    private Item item;

    private Node next;

    public Item getItem() {
        return item;
    }

    public Node(Item item) {
        this.item = item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
