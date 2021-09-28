public class SelectionSort {
    public static void main(String[] args) {
        int[] getallen = {5,6,3,78,1};
        print(getallen);
        selectionSort(getallen);
        print(getallen);
    }

    public static void selectionSort(int[] a){
        for(int i = 0; i< a.length; i++){
            int j = getIndexSmallest(i,a);
            swap(i,j, a);
        }

    }

    public static int getIndexSmallest(int startIndex, int[] a){
        int result = startIndex;
        int min = a[startIndex];

        for(int i = startIndex+1; i < a.length; i++ ) {
            if (a[i] < min) {
                result = i;
                min = a[i];
            }
        }
        return result;
    }

    public static void swap(int i, int j, int[] a){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void print(int[] getallen){
        for(int x : getallen)
            System.out.print(x + " ");
        System.out.println();
    }
}
