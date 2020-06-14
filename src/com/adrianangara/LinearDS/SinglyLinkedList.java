package com.adrianangara.LinearDS;

public class SinglyLinkedList<E> {

    public static class Node<E> {

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

    public Node<E> head;
    public Node<E> tail;
    public int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public E first() {

        if(head != null) {
            return head.getElement();
        }else {
            return null;
        }
    }

    public E last() {
        if(tail != null) {
            return tail.getElement();
        } else {
            return null;
        }
    }

    public void addFirst(E element) {

        head = new Node<E>(element, head);

        if(isEmpty()) {
            tail = head;
        }
        size++;

    }

    public void addLast(E element) {
        Node<E> node = new Node<E>(element, null);

        if(isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;

    }

    public E removeFirst() {
        if(isEmpty()) {
            return null;
        }

        E element=head.getElement();
        head = head.getNext();
        size--;

        if(size==0) {
            tail = null;
        }

        return element;
    }

    // --------------------------------------- //

    // Example 1: Find whether an element exists in a linked list
    public boolean findIfElementExists(E element) {
        boolean found = false;
        Node<E> temp = head;

        while(temp != null && !found) {
            if(temp.getElement() == element) {
                found = true;
            }

            temp = temp.getNext();
        }
        return found;
    }

    // Example 2: Find whether an element exists in a linked list recursively
    public boolean findIfElementExistsRec(E element, Node<E> node) {
        if (node == null) {
            return false;
        } else {
            if(node.getElement() == element) {
                return true;
            } else {
                return  findIfElementExistsRec(element, node.getNext());
            }
        }
    }

}
