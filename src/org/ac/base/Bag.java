package org.ac.base;


import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {

    private Node<Item> first;

    private int size = 0;

    public Bag() {

    }


    public void add(Item item) {
        Node old = first;
        Node node = new Node(item);
        node.setNext(old);
        first = node;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node<Item> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public void remove() {
        }

        @Override
        public Item next() {
            Item item = current.getItem();
            current = current.getNext();
            return item;
        }
    }


    @Override
    public String toString() {
        return "Bag{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
