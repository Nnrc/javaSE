package com.gy.node;

/**
 * @ClassName : Queue
 * @Auther : gy
 * @Date : 2019/6/13 17:34
 * @Description : 队列
 */
public class Queue {

    //数组
    public int [] arrays;

    //指向第一个有效的元素
    public int front =0;

    //指向有效数据的下一个元素(即指向无效的数据)
    public int rear =0;

    public Queue() {
    }

    public Queue(int size) {
        this.arrays = new int[size];
    }

    /**
     * @Title :判断队列是否已满
     * @Author : gy
     * @Description : //TODO 
     * @Date : 2019/6/13 17:38 
     * @Param : []
     * @return : java.lang.Boolean
     **/
    public Boolean  isFull(){
        if ((this.rear + 1) % this.arrays.length == this.front) {
            System.out.println("此时队列满了！");
            return true;
        } else {
            System.out.println("此时队列不满了！");
            return false;
        }
    }

    /**
     * @Title :入队列
     * @Author : gy
     * @Description : //TODO 
     * @Date : 2019/6/13 17:39 
     * @Param : [value]
     * @return : void
     **/
    public  void enQueue(int value) {
        // 不是满的队列才能入队
        if (!isFull()) {

            // 将新的元素插入到队尾中
            this.arrays[this.rear] = value;

            // rear节点移动到新的无效元素位置上  取余操作 可循环使用
            this.rear = (this.rear + 1) % this.arrays.length;
        }
    }
    
    /**
     * @Title :遍历队列
     * @Author : gy
     * @Description : //TODO 
     * @Date : 2019/6/13 17:41 
     * @Param : []
     * @return : void
     **/
    public  void traverseQueue() {
        // front的位置
        int i = this.front;

        while (i != this.rear) {

            System.out.println("" + this.arrays[i]);

            //移动front 只要不等于末尾元素  就可以无限遍历
            i = (i + 1) % this.arrays.length;
        }

    }

    public  boolean isEmpty() {
        if (this.rear  == this.front) {
            System.out.println("此时队列空的！");
            return true;
        } else {
            System.out.println("此时队列非空！");
            return false;
        }
    }

    public  void outQueue() {

        //判断该队列是否为null
        if (!isEmpty()) {
            //不为空才出队
            int value = this.arrays[this.front];
            System.out.println("出队的元素是：" +  value);
            // front指针往后面移
            this.front = (this.front + 1) % this.arrays.length;

        }


    }
}
