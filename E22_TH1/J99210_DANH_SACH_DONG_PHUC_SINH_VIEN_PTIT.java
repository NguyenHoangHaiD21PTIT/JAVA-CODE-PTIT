import java.io.*;
import java.util.*;
class Student implements Comparable<Student>{
    private String msv, ten, lop, email, sdt, gioiTinh, sizeAo;
    public Student(String msv, String ten, String gioiTinh, String lop, String email, String sdt) {
        this.msv = msv;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
        this.email = email;
        this.sdt =sdt;
    }   
    public void setSizeAo(String sizeAo) {
        this.sizeAo = sizeAo;
    }
    public String getSizeAo() {
        return sizeAo;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", this.msv, this.ten, this.lop, this.email, this.sdt);
    }
    @Override
    public int compareTo(Student o) {
        return this.msv.compareTo(o.msv);
    }
    
}

public class J99210_DANH_SACH_DONG_PHUC_SINH_VIEN_PTIT {
    public static void main(String[] args) throws IOException{
        //Scanner sc = new Scanner(new File("C:\\Users\\Hai\\Documents\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\SINHVIEN.in"));
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student>a = new ArrayList<>();
        for(int i = 0;i<n;i++) a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        //sc = new Scanner(new File("C:\\Users\\Hai\\Documents\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\DANGKY.in"));
        sc = new Scanner(new File("DANGKY.in"));
        for(int i = 0;i<n;i++){
            String s = sc.nextLine();
            String []tmp1 = s.trim().split("\\s+");
            a.get(i).setSizeAo(tmp1[1]);
        }
        sc = new Scanner(System.in);
        Collections.sort(a);
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<q;i++){
            String s = sc.nextLine();
            String []tmp1 = s.trim().split("\\s+");
            String gioi = tmp1[0].toUpperCase(), sizeAo = tmp1[1];
            System.out.println(String.format("DANH SACH SINH VIEN %s DANG KY SIZE %s", gioi, sizeAo));
            for(Student x: a){
                if(x.getSizeAo().equals(sizeAo) && x.getGioiTinh().toUpperCase().equals(gioi)) System.out.println(x);
            }
        }
    }
}