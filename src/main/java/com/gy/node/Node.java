package com.gy.node;

/**
 * @ClassName : Node
 * @Auther : gy
 * @Date : 2019/6/12 14:50
 * @Description :   链表节点
 */
public class Node {
    //数据域
    public Object data;
    //下一个指针节点
    public Node next;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
    
    /**
     * @Title :添加一个数据到链表
     * @Author : gy
     * @Description : //TODO 
     * @Date : 2019/6/12 15:45 
     * @Param : [node, value]
     * @return : void
     **/
    public void addData(Object value){

            Node thisnode = new Node(value);
            //遍历node  找到node的尾节点
            Node temp=this;
            while (temp.next!= null){
                temp=temp.next;
            }
            //将本次的插入的值放入next节点
            temp.next=thisnode;
    }
    
    /**
     * @Title :遍历链表数据
     * @Author : gy
     * @Description : //TODO 
     * @Date : 2019/6/12 15:50 
     * @Param : [node]
     * @return : void
     **/
    public void traverse(){
        Node temp=this;
        while (temp != null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    /**
     * @Title :链表根据下表添加数据
     * @Author : gy
     * @Description : //TODO 
     * @Date : 2019/6/12 17:07 
     * @Param : [index, value]
     * @return : void
     **/
    public  void insert(int index,Object value){
            if(index<0||index>nodeLength()-1){
                System.out.println("插入下标不正确");
                return;
            }
            Node  insertNode =new Node(value);
            int currentPos=0;
            Node temp=this;
            while (temp != null){
                //找到上一个节点
                if (currentPos== (index-1)) {
                    //插入节点的下一个为当前节点
                    insertNode.next=temp.next;
                        //上一个节点
                    temp.next=insertNode;
                    return ;
                }   else if (index == 0){
                    //处于链表首位

                    //这一步有问题
                    Node clone=null;
                    try {
                        clone = (Node) temp.clone();
                    } catch (CloneNotSupportedException e) {
                    }
                    this.next=clone;
                    this.data=value;
                    return;
                }
                temp=temp.next;
                currentPos++;
            }
    }

    public int  nodeLength(){
        int size=1;
        Node temp=this;
        while (temp.next!=null){
            size+=1;
            temp=temp.next;
        }
        return size;
    }
}
