package SHYFTLABS;

import java.util.ArrayList;

public class Assignments {
    public static void main(String[] args) {
        ArrayList<Integer> unboundedArray = new ArrayList<>();  //ArrayList is unbounded array



        unboundedArray.add(-1);
        unboundedArray.add(-1);
        unboundedArray.add(-1);
        unboundedArray.add(-1);


        int result = findIndex(unboundedArray);
        System.out.println(result);
    }

    private static int findIndex(ArrayList<Integer> unboundedArray) {
        int i = 0;
        while (unboundedArray.get(i) != -1){
            if(unboundedArray.get(i) == -1)
                return i;
            i++;
        }
        return i;
    }
}
