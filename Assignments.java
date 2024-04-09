package SHYFTLABS;

import java.util.ArrayList;

public class Assignments {
    public static void main(String[] args) {
        ArrayList<Integer> unboundedArray = new ArrayList<>();  //ArrayList is unbounded array


        unboundedArray.add(3);
        unboundedArray.add(4);
        unboundedArray.add(1);
        unboundedArray.add(2);
        unboundedArray.add(7);
        unboundedArray.add(8);
        unboundedArray.add(20);
        unboundedArray.add(33);

        unboundedArray.add(-1);
        unboundedArray.add(-1);
        unboundedArray.add(-1);
        unboundedArray.add(-1);
        unboundedArray.add(-1);


        int result = findIndex(unboundedArray);
        System.out.println(result);
    }

    private static int findIndex(ArrayList<Integer> unboundedArray) {
        int i = 0;
        //If "-1" exist it will return the Index
        //Other vice its will return -1 and Not Found text

        try {
            while (unboundedArray.get(i) != -1) {
                if (unboundedArray.get(i) == -1)
                    return i;
                i++;
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Not Found");
            return -1;
        }

        return i;
    }
}
