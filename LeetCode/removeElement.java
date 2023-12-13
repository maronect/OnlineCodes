public class removeElement {
    public int removeE(int[] nums, int val) {

        int cont = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)  {
                cont++;
            }
        }

        int vet[] = new int[cont];
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                vet[pos] = nums[i];
                pos++;
            }
        }

        for (int i = 0; i < vet.length; i++) {
            nums[i] = vet[i];
        }
        return cont;
    }
    
}
