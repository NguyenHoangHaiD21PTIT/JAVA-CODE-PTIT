/*import java.util.*;
class DN{
    private String id, name;
    private int slot;
    public DN(String id, String name, int slot){
        this.id = id;
        this.name = name;
        this.slot = slot;
    }
    public int getslot(){
        return this.slot;
    }
    public String getid(){
        return this.id;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.slot;
    }
}
public class J05029_DANH_SACH_DOANH_NGHIEP_NHAN_SINH_VIEN_THUC_TAP_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        DN []a = new DN[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new DN(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        Arrays.sort(a, new Comparator<DN>(){
            public int compare(DN a, DN b){
                if(a.getslot()!=b.getslot()) return b.getslot() - a.getslot();
                return a.getid().compareTo(b.getid());
            }
        });
        int q = sc.nextInt();
        while(q-- >0){
            int z = sc.nextInt(), t = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + z + " DEN " + t + " SINH VIEN:");
            for(DN x: a) {
                if (x.getslot()>= z && x.getslot()<=t) System.out.println(x);
            }
        }
    }
} */
