package com.havefun.learnalgorithms;

import com.havefun.learnalgorithms.bean.BinaryTree;
import com.havefun.learnalgorithms.bean.Node;

public class BinaryTreeMaxWidth {

    public static void main(String[] args) {
        //              1
        //             /  \
        //            2    3
        //           /\    / \
        //          4  5  6   7
        //
        //
        //
        //
        //


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        BinaryTree binaryTree = new BinaryTree();
        int maxWidth = binaryTree.getMaxWidth(root);
        System.out.println("max width: " + maxWidth);
    }
}
