public class AddDigits {
    public int addDigits(int num) {
        int numSize = ("" + num).length(); 
        int number = num;

        int finalResult = 0;
        int result = 0;
        
        while(numSize>=1){
            
            result = (int)((number / Math.pow(10, numSize - 1)));
            number = (int)((number % Math.pow(10, numSize - 1)));
            numSize--;
            finalResult += result;
            
            if(numSize == 0 && finalResult>=10){
                finalResult = addDigits(finalResult);
            }
        }

        return finalResult;
    }
}
