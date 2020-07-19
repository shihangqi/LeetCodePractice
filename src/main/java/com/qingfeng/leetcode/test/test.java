package com.qingfeng.leetcode.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author shihangqi
 * @ClassName: test
 * @Description:
 * @date 2020/7/19 7:09 下午
 */
public class test {


    public static void main(String[] args) {
//        String a = "abc";
//        String b = new String("abc");
//        test(a,b);
        testFailFast();
    }
    public static void test(String a,String b){
        a = b;
        System.out.println(a == b);
        System.out.println(a.equals(b));

    }

    public static void testAtomicInteger(){
        AtomicInteger i = new AtomicInteger(1);
        System.out.println(i.incrementAndGet());
        System.out.println(i.addAndGet(2));
    }
    public static void testFailFast(){
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("234");
        list.add("abc");
//        list.removeIf(s -> s.equals("abc"));
        for (int i = 0;i<list.size();i++){
            if (list.get(i).equals("abc")){
                list.remove(i);
            }
        }
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("123")){
                iterator.remove();
            }
        }
        System.out.println(list);
        String s1 = "ab";
        String s2 = "abc";
        String s3 = s1+"c";

        //        boolean removed = false;
        //        final Iterator<E> each = iterator();
        //        while (each.hasNext()) {
        //            if (filter.test(each.next())) {
        //                each.remove();
        //                removed = true;
        //            }
        //        }
        //        return removed;
    }
}
