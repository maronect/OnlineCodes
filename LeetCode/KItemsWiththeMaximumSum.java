public class KItemsWiththeMaximumSum {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes >= k) return k;
        if((numOnes + numZeros) >= k) return numOnes;
        return numOnes  - (k - numOnes - numZeros);
    }
}
