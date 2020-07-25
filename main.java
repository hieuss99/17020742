public class main {
     
    public static void main(String[] args) {
        Fraction phanSo1=new Fraction(16,3);    // tạo phân số có tử = 16 và mẫu = 4
        Fraction phanSo2=new Fraction(4,8); // tạo phân số có tử = 4 và mẫu = 8
         
        // gọi phương thức cộng, trừ, nhân, chia 2 phân số
        phanSo1.add(phanSo2);
        phanSo1.subtract(phanSo2);
        phanSo1.multiple(phanSo2);
        phanSo1.divide(phanSo2);
    }
     