package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T>  implements LinkedListIface {

    private Node<T> head = null;

    public SinglyLinkedList() {
    }

    public Boolean isEmpty() {
        return head == null;
    }

    @Override
    public void add(Object data) {
        Node newnode = new Node(data);
        if (head == null) {
            this.head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.hasNext()) { // walk to end
                temp = temp.getNext();
            }
            temp.setNext(newnode);

        }
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {

    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public boolean contains(Object data) {
        return false;
    }

    @Override
    public int find(Object data) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public SinglyLinkedList copy() {
        return null;
    }

    @Override
    public void sort(Comparator comparator) {

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        // add HEAD
        sb.append("head -> ");

        // loop thru the list and print data
       if (head != null){
        Node<T> temp = head;
        while (temp.hasNext()) { // walk to end
            // print the data..
            sb.append("[" + temp.getData() + "] -> ");
            temp = temp.getNext();
        }
        // add NULL
        sb.append("NULL");
        return sb.toString();
    }//
    }
