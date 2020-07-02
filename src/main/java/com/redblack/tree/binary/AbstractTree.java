package com.redblack.tree.binary;

public abstract class AbstractTree {

    public int count = 0;

    /**
     * 查找
     * @param o
     * @return
     */
    public abstract Node find(int o);

    /**
     * 插入
     * @param o
     * @return
     */
    public abstract boolean insert(int o);

    /**
     * 删除
     * @param o
     * @return
     */
    public abstract boolean delete(int o);

    /**
     * 节点个数
     * @return
     */
    public int count(){
        return this.count;
    }
}
