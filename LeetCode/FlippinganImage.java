public class FlippinganImage{
    public static int[][] flipAndInvertImage(int[][] image) {
        int aux [][] = new int[image.length][image[0].length];

        int cont = 0;
        for (int i = 0; i < image.length; i++) {
            for (int j = image[0].length - 1 ; j >= 0 ; j--) {
                aux[i][cont] = image[i][j];
                cont++;
            }
            cont = 0;
        }

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[0].length; j++) {
                if(aux[i][j] == 0){
                    aux[i][j] = 1;
                }else{
                    aux[i][j] = 0;
                }    
            }
        }
        return aux;

    }

    public static void main(String[] args) {
        int image [][] = {{1,1,0},
                          {1,0,1},
                          {0,0,0}};
        int [][] result = flipAndInvertImage(image);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}