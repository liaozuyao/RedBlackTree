package com.redblack.tree.binary;

public class Test {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(80);
        tree.insert(70);
        tree.insert(100);
        tree.insert(90);
        tree.insert(70);
        tree.insert(110);
        tree.insert(30);
        tree.insert(40);
        tree.insert(30);
        Node node = tree.find(100);
        System.out.println(node.getLeftNode().getData());
        System.out.println(tree.count);
    }
}
