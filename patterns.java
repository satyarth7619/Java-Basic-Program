public class patterns {
    public static void hollo_rect (int rows , int cols) {

        for (int i = 1; i<=rows; i++){
            
            for(int j=1; j<=cols; j++){

                if(i==1 || i==rows || j==1 || j==cols ){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
    }
    public static void pyramid(int n) {
        for (int i= 1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Floydtri(int n) {
        int counter = 1;
        for(int i = 1; i<=n; i++){

            for(int j =1; j<=i; j++){
                System.out.print(counter+" ");

                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n) {
        
        for(int i =1; i<=n; i++){

            for(int j=1; j<=i; j++){

                if((i+j)%2==0){
                    System.out.print("1");

                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void Butterfly(int n) {
        
        for (int i=1; i<=n; i++){

            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            for(int j =1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){

            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            for(int j =1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void rombus(int n) {
        
        for(int i=1; i<=n; i++){

            for(int j= 1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j =1; j<=n; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void hollowrombus(int n) {
        
        for(int i=1; i<=n; i++){

            for(int j= 1; j<=(n-i); j++){
                System.out.print(" ");

            }
        

            for(int j=1; j<=n; j++){

                if(i==1 || i==n || j==1 || j==n ){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();


        }
    } 
    
    public static void diamond(int n) {
        
        for(int i =1; i<=n; i++){
            
            for(int j =1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j =1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j =1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j =1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        //hollo_rect(5, 5);
        //pyramid(6);
        //Floydtri(8);
        //zero_one_triangle(9);
        //Butterfly(3);
        //rombus(5);
        //hollowrombus(5);
        diamond(5);
    }
    
}
