package com.company;

public class Stack {

        Node top;
        int size;
        public class Node{
            public int data;
            public Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        public void push(int data){
            Node temNode = new Node(data);
            temNode.next=top;
            top=temNode;
            size++;
        }

        public int pop(){
            if(isEmpty()){}


            int result = top.data;
            top = top.next;
            size--;
            return result;

        }
        public int peek(){
            if(isEmpty()){}


            return top.data;
        }

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            return size ==0;
        }


        public void print(){
            Node current = top;
            while(current != null){
                System.out.println(current.data+" ");
                current =current.next;
            }
        }

}

