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
        //链表测试
        Node node = new Node(1);
        node.addData(2);
        node.addData(3);
       // node.insert(2,0);
        node.delete(0);
        //node.traverse();

        //栈测试
        Stack stack = new Stack();
        stack.pushStack(1);
        stack.pushStack(2);
        stack.pushStack(3);
       // stack.traverse();
        stack.popStack();
        // stack.traverse();

        Queue queue = new Queue(6);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.outQueue();
        queue.outQueue();
        queue.outQueue();
        queue.traverseQueue();

        queue.enQueue(6);
        queue.enQueue(6);
        queue.enQueue(6);
        queue.traverseQueue();
        System.out.println(queue.arrays);
        System.out.println(7%6);
    }

}
