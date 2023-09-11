public class PlusOne {
    public static int[] plusOne(int[] digits) {

        digits[digits.length - 1] += 1;
        if(digits[digits.length - 1] == 10){
            for (int i = digits.length - 1; i >= 0 ; i--) {
                if(digits[i] == 10){
                    digits[i] = 0;
                    if(i != 0){
                        digits[i - 1] += 1;
                    }else{
                        return newArray(digits);
                    }
                }
            }
        }
        return digits;
    }

    public static int[] newArray(int []vetor){
        int [] newVet = new int[vetor.length + 1];

        newVet[0] = 1;
        for (int i = 1; i < vetor.length + 1; i++) {
            newVet[i] = vetor[i - 1];
            
        }
        return newVet;
    }

}
