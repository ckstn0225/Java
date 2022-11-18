import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
    public void list3(){
        String[] arr = {"1","2","3","4","5"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> streamOfArrayPart =
                Arrays.stream(arr, 1, 3); // 1~2 요소 [b, c]
        stream.forEach(System.out::println);
        streamOfArrayPart.forEach(System.out::println);
        System.out.println(stream);
        System.out.println(streamOfArrayPart.toString());
    }
}
