package com.company;

public class Main {

    public static void main(String[] args) {


        node root = new Node(1);

        node.left = new Node(7);

        node.right = new Node(8);

        root.left.left = new Node(15);





    }

    public static void resursiveLeftPrint(Node root){

        System.out.println(root.value);

        if (root.left != null){

            recursiveLeftPrint(root.left);
        }

    }

}
