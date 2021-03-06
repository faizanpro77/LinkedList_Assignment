package com.bridgelabz;

public class MyNode<T> implements INode<T>{
    private T data;
    private INode next;

    MyNode() {
    }

    public MyNode(T data) {
        this.setData(data);
        this.setNext(null);
    }
    @Override
    public  T getData() {
        return data;
    }
    @Override
    public void setData(T data) {
        this.data = data;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}