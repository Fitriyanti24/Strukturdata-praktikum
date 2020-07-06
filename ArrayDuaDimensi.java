
public class ArrayDuaDimensi {

    public static void main(String[] args) {
        int DuaDimArr [][] = new int [4][5];
        int k=0;
        
        for (int i=0; i<4; i++){
            for (int j=0; j<5; j++){
                DuaDimArr [i][j] = k++;
            }
        }
        for (int i=0; i<4; i++){
            for (int j=0; j<5; j++){
                System.out.print(DuaDimArr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}