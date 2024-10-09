package application;
import java.util.Scanner;

public class program{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas:");
        int linhas= sc.nextInt();

        System.out.println("Informe a quantidade de colunas:");
        int colunas= sc.nextInt();

        int[][] mtz= new int[linhas][colunas];

        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                mtz[i][j]=sc.nextInt();
            }
        }

        System.out.println("Informe o valor procurado:");
        int n=sc.nextInt();

        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                if (mtz[i][j]==n) {
                    System.out.println("position "+i+","+j);
                    if (j>0) {
                        System.out.println("Left:"+mtz[i][j-1]);
                    }
                    if (j<mtz[i].length-1) {
                        System.out.println("Right:"+mtz[i][j+1]);
                    }
                    if (i>0) {
                        System.out.println("Up:"+mtz[i-1][j]);
                    }
                    if (i<mtz.length-1) {
                        System.out.println("Down:"+mtz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}