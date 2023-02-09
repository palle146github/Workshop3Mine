public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7};
        int length2 = array1.length + array2.length;
        System.out.println("Total Length " + length2);
        int[] arraycombine = new int[length2];
        for (int i = 0; i < array1.length; i++) {
            arraycombine[i] = array1[i];
        }
        int j = array1.length;
        for (int i = 0; i < array2.length; i++) {
            arraycombine[j++] = array2[i];
        }
        for (int i = 0; i < length2; i++){
            System.out.print(arraycombine[i] + " ");
        }
        int[] array4 = new int[length2];
        int x = 0;
        array4[x++] = arraycombine[0];
        for (int i = 0; i < length2; i++) {
            int temp = arraycombine[i];
            for (int k = 0; k < length2; k++) {
                if (temp != arraycombine[k]) {
                    int count = 0;
                    int l = x;
                    for (int m = 0; m < l; m++) {
                        if (arraycombine[k] == array4[m]) {
                            count = count + 1;
                        } else {
                            count = count;
                        }
                    }
                    if(count == 0){
                        array4[x++] = arraycombine[k];}
                }
            }
        }
        System.out.println(x);
        for( int p = 0; p < x; p++){
            System.out.print(array4[p]+" ");
        }
    }
}
