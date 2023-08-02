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
        if(this.isEmpty()) return -1;
        int found = -1;

        Node<T> temp = head;
        do{
            found++;
            if(temp.getData().equals(data))break;
            temp = (temp.getNext());
        } while (temp != null);

        return found;
    }

    @Override
    public int size() {
       if(this.isEmpty()) return 0;
       int n = 0;
       do {} while (temp !=null);
       return n;
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
        }while ((temp != null));
        }
        // add NULL
        sb.append("NULL");
        return sb.toString();
    }
    }
