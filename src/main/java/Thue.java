public class Thue {
    public static void main(String[] args) {
        String tensp = "Bánh ngọt";
        int soluong = 50;
        int dongia = 10500;
        float tien;
        float thue;

        tien = soluong * dongia;
        thue = (tien*10)/100;

        System.out.println("Tên sản phẩm: " + tensp);
        System.out.println("Thành tiền: " + tien);
        System.out.println("Thuế GTGT: " + thue);

    }
}
