import java.util.ArrayList;
import java.util.List;

public class ListSolutions {

    public void list1(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);
        list.add(1,2);
        System.out.println(list);
    }
    public void list2(){
        List<String> list = new ArrayList<>();
        list.add("Hello World");
        System.out.println("list.size()");
        System.out.println(list.size());
        System.out.println("--------------");
        System.out.println("list.get(0)");
        System.out.println(list.get(0));
    }

}
