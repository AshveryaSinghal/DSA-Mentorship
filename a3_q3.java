//finding freq of a number in an array
class a3_q3 {

    static int findFrequency(int A[], int x) {
        int freq = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                freq += 1;
            }

        }
        return freq;

    }

    public static void main(String[] args) {
        int[] A = { 3, 3, 3, 3, 3 };
        int x = 3;
        int ans=findFrequency(A,x);
        System.out.println("The frequency is "+ans);
    }
}
