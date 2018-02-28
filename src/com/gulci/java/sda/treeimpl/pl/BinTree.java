package com.gulci.java.sda.treeimpl.pl;

public class BinTree<T extends Comparable<T>> {

    private Node root;
    private int size;

    public BinTree() {
        this.root = null;
    }

    public int size() {
        return size;
    }

    public boolean delete(T item) {
        boolean deleted = false;

        // empty tree
        if (this.root == null) {
            deleted = false;
        } else {
            // node to delete
            Node currentNode = getNode(item);

            // we change reference, leaves are not deleted explicitly
            // objects no longer link to them, they're garbage collected

            if (currentNode != null) {
                // just a leaf, no children
                if (currentNode.getLeft() == null && currentNode.getRight() == null) {
                    unlink(currentNode, null);
                    deleted = true;
                } // has only right child
                else if (currentNode.getLeft() == null && currentNode.getRight() != null) {
                    unlink(currentNode, currentNode.getRight());
                    deleted = true;
                } // has only left child
                else if (currentNode.getLeft() != null && currentNode.getRight() == null) {
                    unlink(currentNode, currentNode.getLeft());
                    deleted = true;
                }
                // we have to take the biggest value from the smaller ones (left ones),
                // it's the right most leaf on the left branch of the currentNode
                else {
                    Node child = currentNode.getLeft();

                    while (child.getRight() != null && child.getLeft() != null) {
                        child = child.getRight();
                    }

                    // we remove this leaf
                    child.getParent().setRight(null);

                    // we put this leaf as the new currentNode
                    child.setLeft(currentNode.getLeft());
                    child.setRight(currentNode.getRight());
                    unlink(currentNode, child);

                    deleted = true;
                }
            } else {
                deleted = false;
            }
        }

        if (deleted) {
            size--;
        }

        return deleted;
    }

    private void unlink(Node currentNode, Node newNode) {
        // unlinking the currentNode
        // current is root, newNode will become root
        if (currentNode == this.root) {
            newNode.setLeft(currentNode.getLeft());
            newNode.setRight(currentNode.getRight());
            this.root = newNode;
        } // set parent to point to the newNode on the right
        else if (currentNode.getParent().getRight() == currentNode) {
            currentNode.getParent().setRight(newNode);
        } // set parent to point to the newNode on the left
        else {
            currentNode.getParent().setLeft(newNode);
        }
    }

    public void add(T item) {
        Node node = new Node(item);

        // empty tree
        if (root == null) {
            this.root = node;
            this.size++;
        } // isert node somewhere in the tree, start searching the place from the root
        else {
            insert(this.root, node);
        }
    }

    public boolean contains(T item) {
        Node currentNode = getNode(item);
        return currentNode != null;
    }

    private Node getNode(T item) {
        Node currentNode = this.root;

        // starting from root, possible empty tree
        while (currentNode != null) {
            // we compare our item with the current one (root at the beginning)
            int val = item.compareTo(currentNode.getItem());

            // we found our value, currentNode is our node
            if (val == 0) {
                return currentNode;
            } // our value is smaller than the current one, we go left
            else if (val < 0) {
                currentNode = currentNode.getLeft();
            } // our value is larger, we go right
            else {
                currentNode = currentNode.getRight();
            }
        }

        // tree was traversed, we didn't find a leaf with our value
        return null;
    }

    private void insert(Node parent, Node child) {
        // child < parent => to left
        if (child.getItem().compareTo(parent.getItem()) < 0) {
            // left null
            if (parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParent(parent);
                this.size++;
            } // left is not null, we repeat insert for non-null this node
            else {
                insert(parent.getLeft(), child);
            }
        } // child > parent => to right
        else if (child.getItem().compareTo(parent.getItem()) > 0) {
            // right null
            if (parent.getRight() == null) {
                parent.setRight(child);
                child.setParent(parent);
                this.size++;
            } // left is not null, we repeat insert for non-null this node
            else {
                insert(parent.getRight(), child);
            }
        }
    }

    // we assume that values in a binary tree are unique, if parent == child, we don't do anything

    private class Node {
        private Node left;
        private Node right;
        private Node parent;
        private T item;

        public Node(T item) {
            this.item = item;
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }
}
