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
}
