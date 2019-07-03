package Sort_Algorithms;

public class InsertionSort2 {
    /*
    The method for sorting the numbers
     */
    public static void insertionSort(int[] list) {
        //int[] list = {2, 9, 5, 4, 8, 1};
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;

            System.out.println("i :" + i);
            System.out.println("currentElement :" + currentElement);
            for (k = i - 1; k >= 0 && list[k] > currentElement ; k--) {

                System.out.println("k : " + k);
                System.out.println("list[k]: " + list[k]);

                list[k + 1] = list[k];
            }
            //Insert the current element into list[k + 1]
            list[k + 1] = currentElement;
        }

        for(int each : list) {
            System.out.println(each);
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 9, 5, 4, 8, 1, 6};

        insertionSort(list);
    }
}
