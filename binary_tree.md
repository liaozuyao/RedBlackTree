#二叉树 #
> 
版本：V1.0
网站：[https://www.cnblogs.com/chaotalk/p/13197318.html)

#####二叉树，自然就是每个节点最多有两个分支，即两个子节点的一种树，两个分支分别称为左子树和右子树。还是那上面那张图举例，图一、图二和图四都是二叉树，因为它们每个节点都最多含有两个子节点。其中，图一又称为满二叉树，图四又称为完全二叉树。而之所以出现完全二叉树的概念，其实是基于二叉树的物理存储方式。
####二叉树的存储方法
######基于链表的链式存储法
######基于数组的顺序存储法

####二叉树的遍历
二叉树的遍历操作主要有三种
1.前序遍历：对于树中的任意节点来说，先打印这个节点，然后再打印它的左子树，最后打印它的右子树。
2.中序遍历：对于树中的任意节点来说，先打印它的左子树，然后再打印它本身，最后打印它的右子树。
3.后序遍历：对于树中的任意节点来说，先打印它的左子树，然后再打印它的右子树，最后打印这个节点本身。

![avatar](https://user-gold-cdn.xitu.io/2020/6/27/172f3485137a5f7f?w=221&h=262&f=png&s=12777)

前序遍历：A->B->D->E->C->F
中序遍历：D->B->E->A->F->C
后序遍历：D->E->B->F->C->A
###前序遍历
public void preOrder(Node root){
	if(root==null) return;
	System.out.println(root.data);//打印root节点的值
    preOrder(root.left);
    preOrder(root.right);
}
###中序遍
public void inOrder(Node root){
	if(root==null) return;
	inOrder(root.left);
	Systrm.out.println(root.data);
	inOrder(root.right);
}
###后序遍历
public void inOrder(Node root){
	if(root==null) return;
	inOrder(root.left)
	inOrder(root.right);
	Systrm.out.println(root.data);
}