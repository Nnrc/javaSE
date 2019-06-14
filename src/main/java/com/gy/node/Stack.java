package com.gy.node;

/**
 * @ClassName : Stack
 * @Auther : gy
 * @Date : 2019/6/13 17:03
 * @Description : 栈的实现
 */
public class Stack {
    //栈顶
    public Node  stackTop;
    //栈低
    public Node  stackBottom;

    public Stack() {
    }

    public Stack(Node stackTop, Node stackBottom) {
        this.stackTop = stackTop;
        this.stackBottom = stackBottom;
    }

    /**
     * @Title :进栈
     * @Author : gy
     * @Description : //TODO 
     * @Date : 2019/6/13 17:11 
     * @Param : [value]
     * @return : void
     **/
    public void pushStack(Object value){
        Node newnode = new Node(value);
        newnode.next=this.stackTop;
        //栈顶指向新节点
        this.stackTop=newnode;
    }
    
    /**
     * @Title :遍历栈
     * @Author : gy
     * @Description : //TODO 
     * @Date : 2019/6/13 17:16 
     * @Param : []
     * @return : void
     **/
    public void traverse(){
        Node temp=this.stackTop;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    /**
     * @Title :获得栈的长度
     * @Author : gy
     * @Description : //TODO 
     * @Date : 2019/6/13 17:18 
     * @Param : []
     * @return : int
     **/
    public int stackLength(){
        Node temp=this.stackTop;
        return temp.nodeLength();
    }
    /**
     * @Title :出栈
     * @Author : gy
     * @Description : //TODO 
     * @Date : 2019/6/13 17:18 
     * @Param : []
     * @return : void
     **/
    public void popStack(){
        Node temp=this.stackTop;
        if (temp != null) {
            this.stackTop=temp.next;
        }
    }
}
