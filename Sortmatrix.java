import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] n = {
            {5, 4, 7},
            {1, 8, 3},
            {9, 6, 2}
        };    
        int a = n.length;
        int b = n[0].length;
        int[] flatArray = new int[a*b];
        int index = 0;
        for (int[] row : n) {
            for (int num : row) {
                flatArray[index++] = num;
            }
        }
       Arrays.sort(flatArray);
        index = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                n[i][j] = flatArray[index++];
            }
        }
        for (int[] row : n) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}