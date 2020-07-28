package com.qingfeng.leetcode.单例模式;

/**
 * @author shihangqi
 * @ClassName: B
 * @Description:
 * @date 2020/7/22 5:02 下午
 */
public class B {
    //懒汉式
    private static B  instance = null;

    private B(){};

    public static B getInstance(){
        if (instance == null){
            instance = new B();
        }
        return instance;
    }
}
