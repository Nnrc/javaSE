package com.gy.node;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : NodeFunction
 * @Auther : gy
 * @Date : 2019/6/12 14:57
 * @Description :   链表方法测试
 */
public class NodeFunction {
    //初始化一个节点

    public static void main(String[] args) {
        Node node = new Node(1);
        node.addData(2);
        node.addData(3);
        node.insert(2,0);
        node.traverse();

    }

}
