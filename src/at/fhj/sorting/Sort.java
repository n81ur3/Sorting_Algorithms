package at.fhj.sorting;

public class Sort {

    /**
     * sort an array with quicksort algorithm
     *
     * @param a ... whole array of values to sort
     * @param l ... left boundary; where to start sorting
     * @param r ... right boundary; where to end sorting
     */
    public static <T extends ICompare<T>> void quicksort(T[] a, int l, int r) {
        T v, tmp;
        int i, j;

        if (l < r) {
            i = l - 1;
            j = r;
            v = a[r];
            while (true) {
                i++;
                while (a[i].lesserEqual(v) && i < j) {
                    i++;
                }

                j--;
                while (a[j].greaterEqual(v) && i < j) {
                    j--;
                }

                if (i >= j) {
                    break;
                }

                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }

            //swap a[i] with rightest element --> pivot element is at final position
            tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;

            quicksort(a, l, i - 1);
            quicksort(a, i + 1, r);
        }
    }

    /**
     * sort an array with bubblesort algorithm
     *
     * @param a ... whole array of values to sort
     */
    public static <T extends ICompare<T>> void bubblesort(T[] a) {
        T tmp;  //tmp-storage for swapping

/*        for (int i = 1; i < a.length; i++) {

            for (int j = 0; j < a.length - i; j++) {
                if (a[j].greaterEqual(a[j + 1])) {
                    //swap elements
                    tmp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp;
                }
            }
        }*/

        boolean notSorted = true;

        while (notSorted) {
            notSorted = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (!(a[i + 1].greaterEqual(a[i]))) {
                    tmp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = tmp;
                    notSorted = true;
                }
            }
        }
    }

    // add your private auxiliary methods here
    // Begin Implementation

    // End Implementation

}
