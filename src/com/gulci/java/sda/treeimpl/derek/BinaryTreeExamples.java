package com.gulci.java.sda.treeimpl.derek;

public class BinaryTreeExamples {

    public static void main(String[] args) {

        BinaryTree myTree = new BinaryTree();

        myTree.addNode(50, "a");
        myTree.addNode(80, "b");
        myTree.addNode(30, "c");
        myTree.addNode(10, "d");
        myTree.addNode(20, "e");
        myTree.addNode(19, "f");
        myTree.addNode(24, "g");
        myTree.addNode(70, "h");
        myTree.addNode(92, "i");
        myTree.addNode(91, "j");
        myTree.addNode(105, "k");
        myTree.addNode(104, "n");
        myTree.addNode(110, "l");
        myTree.addNode(95, "m");

        myTree.inOrderTraverseTree(myTree.root);

//        System.out.println(myTree.remove(92));
//        System.out.println("After deleting " + 92 + ":");
//        myTree.inOrderTraverseTree(myTree.root);
    }
}
