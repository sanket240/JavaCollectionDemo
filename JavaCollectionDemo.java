import java.util.*;
public class JavaCollectionDemo {
    public static void main(String args[]){
        doListDemo();
        doStackDemo();
        doQueueDemo();
        doSetDemo();
        doMapDemo();

    }
    private static void doListDemo(){
        List<String> list=new LinkedList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        list.add("Ravi");

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    private static void doStackDemo(){
        Stack<String> stack=new Stack<>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Priyanka");
        stack.push("Uthsavi");
        Iterator itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
    private static void doQueueDemo(){
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("Amit Sharma");
        queue.add("VIjay Raj");
        queue.add("Jai Shankar");
        queue.add("Raj");
        System.out.println("head"+queue.element());
        System.out.println("Head:"+queue.peek());
        System.out.println("Iterating elements:");
        Iterator itr=queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing ");
        Iterator itr2=queue.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
    private static void doSetDemo(){
        Set<String> set =new LinkedHashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ajay");
        for(String str: set){
            System.out.println(str);
        }


    }
    private static void doMapDemo(){
        Map<Integer,String> map=new HashMap<>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
