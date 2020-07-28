package com.qingfeng.leetcode.单例模式;


/**
 * @author shihangqi
 * @ClassName: A
 * @Description:
 * @date 2020/7/22 4:53 下午
 */
public class A {
    //饿汉式
    private static final A instance = new A();

    private A(){

    };

    public static A getInstance(){
        return instance;
    }

}
