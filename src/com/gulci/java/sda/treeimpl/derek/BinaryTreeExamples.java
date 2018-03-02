package com.gulci.java.sda.treeimpl.derek;

public class BinaryTreeExamples {

    public static void main(String[] args) {

        BinaryTree myTree = new BinaryTree();

        /*
        myTree.addNode(50, "Boss");
        myTree.addNode(80, "Vice");
        myTree.addNode(60, "Peer");
        myTree.addNode(70, "Customer");
        myTree.addNode(40, "Engineer");

        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);

        System.out.println();
        myTree.preOrderTraverseTree(myTree.root);

        System.out.println();
        myTree.postOrderTraverseTree(myTree.root);

        System.out.println();
        System.out.println(myTree.findNode(80));
        */

        myTree.addNode(50, "a");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(80, "b");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(30, "c");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(10, "d");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(20, "e");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(19, "f");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(24, "g");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(70, "h");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(92, "i");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(91, "j");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(105, "k");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(104, "n");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(110, "l");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);
        myTree.addNode(95, "m");
        System.out.println();
        myTree.inOrderTraverseTree(myTree.root);

        System.out.println(myTree.remove(92));
        System.out.println("After deleting " + 92 + ":");
        myTree.inOrderTraverseTree(myTree.root);

        System.out.println(myTree.remove(30));
        System.out.println("After deleting " + 30 + ":");
        myTree.inOrderTraverseTree(myTree.root);

        System.out.println(myTree.remove(20));
        System.out.println("After deleting " + 20 + ":");
        myTree.inOrderTraverseTree(myTree.root);
    }
}
