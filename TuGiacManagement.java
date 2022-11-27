public class TuGiacManagement {
    public static void main(String[] args) {
        TuGiac t1= new TuGiac();
        TuGiac t2= new TuGiac(2);
        TuGiac t3= new TuGiac(2,4);
        t1.veTuGiac();
        t1.showInfo();
        t2.veTuGiac();
        t2.showInfo();
        t3.veTuGiac();
        t3.showInfo();

    }
}