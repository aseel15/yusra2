package com.company;

public class Main {

    public static void main(String[] args) {

        removeDuplicates();

    }
    public static void removeDuplicates(){
        int[]arr={21,43,41,21,11,12};
        Linkedlist list =new Linkedlist();
        for(int i=0;i< arr.length;i++)
            list.addFirst(arr[i]);
        System.out.println(list.toString2());
        Node temp= list.first;
        Node temp2=temp.next;
        while(temp.next!=null){
            temp2=temp.next;
            while ((temp2!=null)) {
                if (temp.node == temp2.node) {
                    list.remove(temp2);

                }
                temp2=temp2.next;
            }

            temp=temp.next;

        }
        System.out.println("-----------------------");
        System.out.println(list.toString2());
    }
}
