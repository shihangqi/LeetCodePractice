package com.qingfeng.leetcode.单例模式;

/**
 * @author shihangqi
 * @ClassName: D
 * @Description:
 * @date 2020/7/22 5:11 下午
 */
public class D {

    private static class Clazz{
        private static final D instance = new D();
    }

    private D(){
        System.out.println("我执行了构造方法");
    }

    public static D getInstance(){
        System.out.println("执行了getInstance()方法！");
        return Clazz.instance;
    }

}
