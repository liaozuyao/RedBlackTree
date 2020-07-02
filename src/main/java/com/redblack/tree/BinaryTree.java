package com.redblack.tree;

/**
 * 二叉树遍历
 */
public class BinaryTree {

    //前序遍历--->对于树中的任意节点来说，先打印这个节点，然后再打印它的左子树，最后打印它的右子树
    public void preOrder(Node root){
        if(root != null){
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        return;
    }

    //中序遍历--->对于树中的任意节点来说，先打印它的左子树，然后再打印它本身，最后打印它的右子树
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
        return;
    }

    //后序遍历--->对于树中的任意节点来说，先打印它的左子树，然后再打印它的右子树，最后打印这个节点本身
    public void poOrder(Node root){
        if(root != null){
            poOrder(root.left);
            poOrder(root.right);
            System.out.println(root.data);
        }
    }
}

class Node{
    int data;
    Node left, right;
}
