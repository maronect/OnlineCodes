import java.util.Arrays;

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;

        double vet[] = new double[totalLength];

        for (int i = 0; i < nums1.length; i++) {
            vet[i] = nums1[i];
        }

        for (int i = nums1.length; i < totalLength; i++) {
            vet[i] = nums2[i - nums1.length];
        }

        Arrays.sort(vet);

        if (totalLength % 2 == 0) {
            return (double)(vet[((vet.length) / 2)] + vet[(vet.length / 2 - 1)]) / 2;


        } else {
            return (double)vet[vet.length / 2];

        }
    }

    public static void main(String[] args) {
        int vet1[] = {1,2};
        int vet2[] = {3,4};

        System.out.println(findMedianSortedArrays(vet1, vet2));

    }
}