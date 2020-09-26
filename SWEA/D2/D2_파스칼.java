package D2;
import java.util.Scanner;
public class D2_파스칼 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
       
        
        int T, N;
        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            N = sc.nextInt();
            int[][] pascalTr = new int[N][];
       
            //비정방 행렬
            for (int i = 0; i < N; i++) {
                pascalTr[i]= new int[i+1];  
            }
            for (int i = 0; i <N; i++) {
                for(int j=0; j<=i; j++) {
                    if(j==0 || j==i) {//각 행의 처음과 끝을 1로 채움
                        pascalTr[i][j]=1;
                    }
                    else {
                        pascalTr[i][j] = pascalTr[i-1][j-1] + pascalTr[i-1][j];
                    }
                }
            }
            System.out.println("#"+t);
            for (int i = 0; i <N; i++) {
                for(int j=0; j<=i; j++) {
 
                    System.out.print(pascalTr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}