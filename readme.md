####红黑树是一种近似平衡的二叉查找树，它能够确保任何一个节点的左右子树的高度差不会超过二者中较低那个的一陪。具体来说，红黑树是满足如下条件的二叉查找树（binary search tree）：

#####1.每个节点要么是红色，要么是黑色。
#####2.根节点必须是黑色
#####3.红色节点不能连续（也即是，红色节点的孩子和父亲都不能是红色）。
#####4.对于每个节点，从该点至null（树尾端）的任何路径，都含有相同个数的黑色节点。
### 在树的结构发生改变时（插入或者删除操作），往往会破坏上述条件3或条件4，需要通过调整使得查找树重新满足红黑树的条件。
https://blog.csdn.net/weixin_40037053/article/details/89947885
###左旋
#####左旋的过程是将x的右子树绕x逆时针旋转，使得x的右子树成为x的父亲，同时修改相关节点的引用。旋转之后，二叉查找树的属性仍然满足。
![avatar](https://img-blog.csdnimg.cn/20190508110524995.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MDAzNzA1Mw==,size_16,color_FFFFFF,t_70)
###右旋
#####右旋的过程是将x的左子树绕x顺时针旋转，使得x的左子树成为x的父亲，同时修改相关节点的引用。旋转之后，二叉查找树的属性仍然满足。
![avatar](https://img-blog.csdnimg.cn/20190508110551493.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MDAzNzA1Mw==,size_16,color_FFFFFF,t_70)