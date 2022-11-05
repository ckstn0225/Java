import java.util.Arrays;

public class ArraySolutions {

    public void make(){
        int[] arr = {1,2,3,4,5};
        for (int a:arr) {
            System.out.println(a);
        }
        System.out.println(Arrays.toString(arr));
    }

    public void array1(){
        int[] arr = {1,2,3,4,5};
        int[] arr2 = arr.clone();
        System.out.println("--------------");
        System.out.println("arr == arr2");
        System.out.println(arr == arr2);
        System.out.println("--------------");
        System.out.println("Arrays.equals(arr, arr2)");
        System.out.println(Arrays.equals(arr, arr2));
    }
}
