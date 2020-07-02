package com.redblack.tree.search;

public class BinarySearchTree {

    public String find(int key) {
        return find(key);
    }

    private String find(Node x, int key) {
        //在以x为根结点的子树中查找并返回键key所对应的值
        //如果找不到，就返回null
        if (x == null) {
            return null;
        }
        if (key < x.getKey()) {
            return find(x.getLeft(), key);
        } else if (key > x.getLeft().getKey()) {
            return find(x.getRight(), key);
        } else {
            return x.getValue();
        }
    }

    public void insert(int key, String value){

    }
}

