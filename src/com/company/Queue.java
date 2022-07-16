package com.company;

public class Queue {


        Node front =null;
        Node rear =null;

        public void addQueue(int x){
            Node temp = new Node(x);

            if (rear == null) {
                front = rear = temp;
                return;
            }
            rear.next = temp;
            rear = temp;
        }

        public void deletequeue(){
            if (front == null){
                return;
            }
            Node temp = front;
            front = front.next;

            if (front == null){
                rear = null;
            }
        }

        public void printfront(){
            System.out.println("Queue Front : "+front.data);
        }
        public void printrear(){
            System.out.println("Queue Rear : "+rear.data);
        }
    }

