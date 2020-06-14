package com.adrianangara.LinearDS;

public class SinglyLinkedList<E> {

    private static class Node<E> {

        E element;
        private Node<E> next = null;

        public Node(E element, Node<E> node) {
            this.element = element;
            next = node;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> node) {
            next = node;
        }

    }

    private Node<E> head;
    private Node<E> tail;

    private int size;

    public SinglyLinkedList() {

    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public E first() {

        E el = null;
        return el;
    }

    public E last() {
        E el = null;
        return el;
    }

    public void addFirst(E element) {}

    public void addLast(E element) {}

    public E removeFirst() {
        E el = null;
        return el;
    }


}
