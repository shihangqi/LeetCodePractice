package common;

/**
 * @author shihangqi
 * @ClassName: ListNode
 * @Description:
 * @date 2020/7/10 7:40 下午
 */
public class ListNode {
    /**
     * 数据
     */
    public int data;
    /**
     * 指向下一个的指针
     */
    public ListNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
