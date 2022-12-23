import java.util.*;

public class arrayList__removeDuplicate {
    public static <T> ArrayList<T> removeDuplicate(ArrayList<T> list){
        ArrayList<T> newList = new ArrayList<T>();

        for(T element: list){
            if(!newList.contains(element)){
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        //created new arrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,54,20,20,3,3,6,5,1,2,5,36,84,5,20,21,42));

        //Original arrayList
        System.out.println("Original arrayList: " + list);

        //calling the function
        ArrayList<Integer> newList = removeDuplicate(list);

        //final duplicate free arrayList
        System.out.println("Duplicate free Arraylist: " + newList);
    }
}
