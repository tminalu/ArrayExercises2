public class PractiseWithArray {
    public static void main(String[] args) {
        int [] numbers= new int[9];
        int sum=0;
        int Total=0;
        for(int i=0; i<numbers.length; i++) {
            Total= sum + numbers[i];
            System.out.println(Total);
        }

    }
}
