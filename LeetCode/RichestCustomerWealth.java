public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int bgr = 0;
        int current = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                current += accounts[i][j];
            }
            if(current > bgr){
                bgr = current;
                
            }
            current = 0;
        }
        return bgr;
    }
}
