package com.company;

public class Tree {

    public class NodeTree {
        int data;
        com.company.NodeTree left;
        com.company.NodeTree right;

        public NodeTree(int data){
            this.data = data;
        }
    }
        NodeTree root;
        NodeTree pointer;

        public void add(int data) {
            if (root == null) {
                root = new NodeTree(data);
                System.out.println(root.data);

            }
            pointer = root;
            while (true) {
                if (data > pointer.data) {
                    if (pointer.right == null) {
                        pointer.right = new NodeTree(data);
                    } else {
                        pointer = pointer.right;
                    }

                } else if (data < pointer.data) {
                    if (pointer.left == null) {
                        pointer.left = new NodeTree(data);
                    }
                    else {
                        pointer = pointer.left;
                    }
                }

            }

        }

        public NodeTree find(int data) {
            NodeTree pointer=root;
            while(true){
                if(data==pointer.data){
                    return pointer;
                }
                else if(data>pointer.data && pointer.right !=null){
                    pointer = pointer.left;
                }
                else{
                    return null;
                }
            }
        }

}
