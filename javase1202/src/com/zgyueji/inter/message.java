package com.zgyueji.inter;

public interface message {
    void chat();
    default void transportfile(){
        System.out.println("暂时不支持传输文件.");
    }
    static void print(){
        System.out.println("这是聊天工具");
        //无法调用transportfile:静态方法中不能调用非静态
    }

    // public static void main(String[] args) {
   // }

}
