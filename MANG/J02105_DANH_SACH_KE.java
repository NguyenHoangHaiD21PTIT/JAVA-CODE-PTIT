package MANG;
import java.util.Scanner;
public class J02105_DANH_SACH_KE{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.printf("List(%d) = ", i);
            for(int j=1; j<=n; j++){
                int x = sc.nextInt();
                if(x==1) System.out.printf("%d ", j);
            } 
            System.out.println("");
        }
    }
}
