package com.gulci.java.sda.treeimpl.pl;

public class BinTreeCheck {

    public static void main(String[] args) {

        BinTree<Integer> myTree = new BinTree<>();

        myTree.add(50);
        myTree.add(40);
        myTree.add(60);
        myTree.add(70);
        myTree.add(80);

        myTree.delete(50);

        System.out.println(myTree.contains(40));
        System.out.println(myTree.contains(50));
        System.out.println(myTree.contains(60));
        System.out.println(myTree.contains(70));
        System.out.println(myTree.contains(80));
    }
}
