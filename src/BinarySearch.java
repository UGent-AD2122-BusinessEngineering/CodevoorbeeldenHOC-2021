public class BinarySearch {
    public static int binarySearch(int getal, int i, int j, int[] array){
        int mid  = (i+j)/2;
        if(i>j)
            return -1;
        else if(getal == array[mid])
            return mid;
        else if(getal < array[mid])
            return binarySearch(getal, i, mid-1, array);
        else
            return binarySearch(getal, mid+1, j, array );
    }

    public static void main(String[] args) {
        int[] getallen = {5,7,9,14,18,29, 34};

        System.out.println(BinarySearch.binarySearch(34,0, getallen.length-1, getallen ));
    }
}
