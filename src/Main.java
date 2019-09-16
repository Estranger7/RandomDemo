import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        long time1 = arrayListFor();
        long time2 = arrayListIterator();
        long time3 = linkedListFor();
        long time4 = linkedListIterator();
        System.out.println("ArrayList用for循环遍历所需时间：" + time1);
        System.out.println("ArrayList用iterator循环遍历所需时间：" + time2);
        System.out.println("LinkedList用for循环遍历所需时间：" + time3);
        System.out.println("LinkedList用iterator循环遍历所需时间：" + time4);
    }

    private static long arrayListFor(){
        List list = new ArrayList();
        for(int i=0;i<100000;i++){
            list.add(i);
        }

        //开始时间
        long start = System.currentTimeMillis();

        //读取
        for (int i=0;i<list.size();i++){
            Object o = list.get(i);
        }

        //结束时间
        long end = System.currentTimeMillis();

        return end-start;
    }

    private static long arrayListIterator() {
        List list = new ArrayList();
        for(int i=0;i<100000;i++){
            list.add(i);
        }

        //开始时间
        long start = System.currentTimeMillis();

        //读取
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object o = it.next();
        }

        //结束时间
        long end = System.currentTimeMillis();

        return end-start;
    }

    private static long linkedListFor() {
        List list = new LinkedList();
        for(int i=0;i<100000;i++){
            list.add(i);
        }

        //开始时间
        long start = System.currentTimeMillis();

        //读取
        for (int i=0;i<list.size();i++){
            Object o = list.get(i);
        }

        //结束时间
        long end = System.currentTimeMillis();

        return end-start;
    }

    private static long linkedListIterator() {
        List list = new LinkedList();
        for(int i=0;i<100000;i++){
            list.add(i);
        }

        //开始时间
        long start = System.currentTimeMillis();

        //读取
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object o = it.next();
        }

        //结束时间
        long end = System.currentTimeMillis();

        return end-start;
    }

}
