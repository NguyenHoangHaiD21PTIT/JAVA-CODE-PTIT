package THUC_HANH_1_01_10;
import java.util.*;
import java.io.*;
class Point{
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }  
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
}
class Polygon{
    private Point []p;
    public Polygon(Point []p){
        this.p = p;
    }
    public String getArea(){
        double area = 0.0;
        for(int i = 0;i<p.length;i++){
            int j = (i + 1)%p.length;
            area+=0.5 * (p[i].getX() * p[j].getY() - p[j].getX() * p[i].getY());
        }
        return String.format("%.3f", area);
    }
}
public class J05008_DIEN_TICH_DA_GIAC {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            Point p[] = new Point[n];
            for(int i = 0; i < n; i++){
                p[i] = new Point(in.nextInt(),in.nextInt());
            }
            Polygon poly = new Polygon(p);
            System.out.println(poly.getArea());
        }
    }
}