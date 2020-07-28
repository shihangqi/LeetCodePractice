package com.qingfeng.leetcode.单例模式;

/**
 * @author shihangqi
 * @ClassName: C
 * @Description:
 * @date 2020/7/22 5:06 下午
 */
public class C {

    //双枷锁的线程安全懒汉式。
    private static volatile C instance = null;

    private C(){};

    public static C getInstance(){
        if (instance == null){
            synchronized (C.class){
                if (instance == null){
                    instance = new C();
                }
            }
        }
        return instance;
    }

}
