public class MergeSort {
    public static void sort(int[] a){
        if(a.length >2){
            int halflength = a.length / 2;
            int[] firsthalf = new int[halflength];
            int[] lasthalf = new int[a.length - halflength];

            divide(a, firsthalf, lasthalf);
            sort(firsthalf);
            sort(lasthalf);
            merge(a, firsthalf, lasthalf);

        }
    }

    private static void divide(int[] a, int[] firsthalf, int[] lasthalf) {
        for(int i = 0; i < firsthalf.length; i++)
            firsthalf[i] = a[i];
        for(int i = 0; i < lasthalf.length; i++)
            lasthalf[i] = a[firsthalf.length + i];
    }

    private static void merge(int[] a, int[] firsthalf, int[] lasthalf) {
        int firstHalfIndex = 0;
        int lastHalfIndex = 0;
        int aIndex = 0;
        while(firstHalfIndex < firsthalf.length && lastHalfIndex < lasthalf.length)
        {
            if(firsthalf[firstHalfIndex] < lasthalf[lastHalfIndex])
            {
                a[aIndex] = firsthalf[firstHalfIndex];
                firstHalfIndex++;
            }
            else
            {
                a[aIndex] = lasthalf[lastHalfIndex];
                lastHalfIndex++;
            }
            aIndex++;
        }

        while(firstHalfIndex < firsthalf.length)
        {
            a[aIndex] = firsthalf[firstHalfIndex];
            aIndex++;
            firstHalfIndex++;
        }
        while(lastHalfIndex < lasthalf.length)
        {
            a[aIndex] = lasthalf[lastHalfIndex];
            aIndex++;
            lastHalfIndex++;
        }

    }


    public static void main(String[] args) {
        int[] anArray = {7,5,11,2,16,4,18,28,12,30};
        System.out.println("Array voor sorteren:");
        for(int i = 0; i < anArray.length; i++){
            System.out.print(anArray[i] + " ");
        }
        System.out.println();

        MergeSort.sort(anArray);

        System.out.println("Array na sorteren:");
        for(int i = 0; i < anArray.length; i++){
            System.out.print(anArray[i] + " ");
        }

    }

}
