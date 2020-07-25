package task2;

public class Fraction {
    /**
     * declare attributes here
     */
    private int Numerator;
    private int Denominator;

        public Fraction(int Numerator, int Denominator){
            this.Numerator = Numerator;
            this.Deprecated = Deprecated;
        }

    /**
     * declare constructor here
     */
    public int getNumerator() {
        return x;}
    public void setNumerator(int x) {
        Numerator = x;
    }    
    public int getDenominator() {
        return y;}
    public void setDenominator(int y) {
        Denominator = y;
    }    
    /**
     * methods
     */

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
     public void toiGianPhanSo() {
        int i = gcd(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / i);
        this.setDenominator(this.getDenominator() / i);
    }

    // add
    public Fraction add(Fraction other) {
        int ts = this.getNumerator() * ps.getDenominator() + ps.getNumerator() * this.getDenominator();
        int ms = this.getDenominator() * ps.getDenominator();
        Fraction phanSoTong = new Fraction(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }

    // subtract
    public Fraction subtract(Fraction other) {
        int ts = this.getNumerator() * ps.getDenominator() - ps.getNumerator() * this.getDenominator();
        int ms = this.getDenominator() * ps.getDenominator();
        Fraction phanSoHieu = new Fraction(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }

    // multiple
    public Fraction multiple(Fraction other) {
        int ts = this.getNumerator() * ps.getNumerator();
        int ms = this.getDenominator() * ps.getDenominator();
        Fraction phanSoTich = new Fraction(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }

    // divide
    public Fraction divide(Fraction other) {
        int ts = this.getNumerator() * ps.getDenominator();
        int ms = this.getDenominator() * ps.getNumerator();
        Fraction phanSoThuong = new Fraction(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);  
    }

    /**
     * compare this with other, notice that param is Object type
     */
     public boolean equals(Object obj){        
        if (obj instanceof Fraction){
            if (this.subtract((Fraction) obj) ==0) {
                return true;
                else return false;
            }
            else{
                return false;
            }
        }
}
    
}