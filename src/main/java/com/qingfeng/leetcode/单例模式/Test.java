package com.qingfeng.leetcode.单例模式;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author shihangqi
 * @ClassName: test
 * @Description:
 * @date 2020/7/22 4:51 下午
 */
public class Test {

    @org.junit.Test
    public void test(){
//        D d = D.getInstance();
//        d = D.getInstance();
//        d = D.getInstance();
//        d = D.getInstance();
        System.out.println(F.INSTANCE.doSomeThing());
    }

}
