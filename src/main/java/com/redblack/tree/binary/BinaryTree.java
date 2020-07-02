package com.redblack.tree.binary;

public class BinaryTree extends AbstractTree{

    //二叉树根节点
    private Node root;

    @Override
    public Node find(int o) {
        Node current = root;
        while (current != null){
            if(current.getData() > o){
                //当前值比查找值大，则继续遍历左子树
                current = current.getLeftNode();
            } else if(current.getData() < o){
                //当前值比查找值小，则继续遍历右子树
                current = current.getRightNode();
            } else {
                return current;
            }
        }
        return null;
    }

    @Override
    public boolean insert(int data) {
        count ++;
        //如果第一个节点为空，设置第一个节点
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return true;
        }
        Node current = root;
        Node parentNode = null;
        while (current != null){
            parentNode = current;
            //当前值比新插入的值大
            if(current.getData() > data){
                current = current.getLeftNode();
                //若左节点为空，则直接插入即可
                if(current == null){
                    parentNode.setLeftNode(newNode);
                    return true;
                }
            } else {
                //当前值小于新插入的值
                current = current.getRightNode();
                if(current == null){
                    parentNode.setRightNode(newNode);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(int data) {
        Node current = root;
        Node parentNode = root;
        //当前节点是否为左节点
        boolean isLeftNode = false;
        //定位data的位置
        while (current.getData() != data){
            parentNode = current;
            if(current.getData() > data){
                isLeftNode = true;
                current = current.getLeftNode();
            } else {
                isLeftNode = false;
                current = current.getRightNode();
            }

            if(current == null){
                return false;
            }
        }
        //情况1.此节点为叶子节点
        if(current.getLeftNode() == null && current.getRightNode() == null){
            if(current == root){
                root = null;
            } else if(isLeftNode){
                //如果要删除的节点为父节点的左节点 把父节点的左节点设置为空
                parentNode.setLeftNode(null);
            } else {
                parentNode.setLeftNode(null);
            }
            return true;
        }
        //情况2.当前节点有一个节点
        if(current.getLeftNode() == null && current.getRightNode() != null){
            if(root == current){
                root = current.getRightNode();
            } else if(isLeftNode){
                parentNode.setLeftNode(current.getRightNode());
            } else {
                parentNode.setRightNode(current.getRightNode());
            }
        } else if(current.getLeftNode() != null && current.getRightNode() == null){
            if(root == current){
                root = current.getLeftNode();
            } else if(isLeftNode){
                parentNode.setLeftNode(current.getLeftNode());
            } else {
                parentNode.setRightNode(current.getRightNode());
            }
        }
        //情况3.当前节点有两个节点
        if(current.getLeftNode() != null && current.getRightNode() != null){
            //获取删除节点的后继节点
            Node successor = getSuccessor(current);
            if(root == current){
                root = successor;
            } else if(isLeftNode){
                parentNode.setLeftNode(successor);
            } else {
                parentNode.setRightNode(successor);
            }
        }
        return false;
    }

    /**
     * 获取要删除节点的后继节点
     * @param delNode
     * @return
     */
    public Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.getRightNode();
        while (current != null){
            successorParent = successor;
            successor = current;
            current = current.getLeftNode();
        }
        if(successor != delNode.getRightNode()){
            successorParent.setLeftNode(successor.getRightNode());
            successor.setRightNode(delNode.getRightNode());
        }
        return successor;
    }
}
