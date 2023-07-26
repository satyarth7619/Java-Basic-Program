import java.util.Scanner;

public class martices {

    public static boolean search (int martrix[][] , int key){
        for(int i =0; i<3; i++){
            for(int j=0; j<3; j++){
               if (martrix[i][j] == key){
                System.out.println("Found the key " + i + "," + j );
                return true;
               } 
            }
            
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[]) {
        int martrix [] [] = new int[3][3];
        int n =3, m=3;
        Scanner sc = new Scanner (System.in);
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                martrix[i][j] = sc.nextInt();
            }
        }
        
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
               System.out.print(martrix[i][j] + " "); 
            }
            System.out.println();
        }

        search(martrix, 7);
    }
}
