public class ArrayPairSum {
    public static void main(String[] args) {
        int[] array1 = {1, 7, 6, 5, 9};
        int[] array2 = {2, 7, 6, 3, 4};
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                sum = array1[i] + array2[j];
                if (sum == 13) {
                    System.out.println("(" + array1[i] + ","  + array2[j] + ")");
                }
            }
        }
    }
}
