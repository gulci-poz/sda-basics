package com.gulci.java.sda.treeimpl.derek;

public class Node {

    int key;
    String name;

    Node leftChild;
    Node rightChild;

    int level;


    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return "|" + key + "|(" + level + ")";
    }
}
