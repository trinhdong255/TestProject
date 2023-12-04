package baiTap;

public class HinhTron {
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    void tinhChuVi() {
        // Biến r cục bộ
        float r = 10;

        // this.r lại là thuộc tính, dòng code này
        // gán giả trị của biến r vào thuộc tính r
        this.r = r;

        // r trong phép tính này là biến r cục bộ đấy nhé
        cv = 2 * PI * r;
    }
    public static void main(String[] args) {

        HinhTron hinhTron = new HinhTron();
        hinhTron.r = 10.0f;
    }
}
