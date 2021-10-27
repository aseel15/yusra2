package com.company;

import java.util.LinkedList;

public class Linkedlist {
    Node first, last;
    int count;
    public void addFirst(int x) {
        Node temp=new Node(x);
        if(count==0)
            first=last=temp;
        else {
            temp.next=first;
            first=temp;
        }
        count++;
    }

    public void remove(Node t){
        Node temp=first;
        Node cur=t;
        while(temp.next!=cur){
            temp=temp.next;
        }
        temp.next=cur.next;
        count--;


    }
    public String toString2() {//print the linked list of course
        String str = "";
        Node h = first;
        while (h!=null) {
            str = str+((int)h.node)+ "\n";
            h= h.next;
        }
        return str;


    }
}
