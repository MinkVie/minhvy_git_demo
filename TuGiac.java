public class TuGiac {
    private int a;
    private int b;

    public TuGiac() {
    }
    public TuGiac(int a) {
        this.a = a;
        this.b = a;
    }
    public TuGiac(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void veTuGiac(){
        if (a==0 || b==0){
            System.out.println("Không thể vẽ hình có cạnh =0");
        } else {
            System.out.println("Vẽ tứ giác:");
            for(int i = 1; i <= a; i++){
                for(int j = 1; j <= b; j++) {
                    System.out.print("*  ");
                }
                System.out.println("");
            }
        }
    }
    public int tinhChuVi(){
        return (this.a + this.b) * 2;
    }
    public int tinhDienTich(){
        return this.a * this.b;
    }
    public String phanLoaiTG(){
        if (a == b && a!= 0 && b != 0) return " vuông ";
        else if (a != b && a!= 0 && b != 0) return " chữ nhật ";
        else return " không biết ";
    }
    public void showInfo(){
        System.out.println("Hình"+this.phanLoaiTG()+" có chu vi là "
                +this.tinhChuVi()+" diện tích là "+this.tinhDienTich());
    }
}
