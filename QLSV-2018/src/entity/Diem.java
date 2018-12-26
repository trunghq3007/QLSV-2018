/**
 * 
 */
package entity;

/**
 * @author HQTrung
 *
 */
public class Diem {
        // mã sinh viên
        private char maSV;
        // mã môn học
        private char maMH;
        // học kì
        private int hocKi;
        // điểm lần 1
        private int diemLan1;
        // điểm lần 2
        private int diemLan2;
        public SinhVien sinhVien;

        /**
         * 
         */
        public Diem() {
        }

        /**
         * @param maSV
         * @param maMH
         * @param hocKi
         * @param diemLan1
         * @param diemLan2
         */
        public Diem(char maSV, char maMH, int hocKi, int diemLan1, int diemLan2) {
                this.maSV = maSV;
                this.maMH = maMH;
                this.hocKi = hocKi;
                this.diemLan1 = diemLan1;
                this.diemLan2 = diemLan2;
        }

        @Override
        public String toString() {
                return "Diem [maSV=" + maSV + ", maMH=" + maMH + ", hocKi=" + hocKi + ", diemLan1=" + diemLan1
                                + ", diemLan2=" + diemLan2 + "]";
        }

        public char getMaSV() {
                return maSV;
        }

        public void setMaSV(char maSV) {
                this.maSV = maSV;
        }

        public char getMaMH() {
                return maMH;
        }

        public void setMaMH(char maMH) {
                this.maMH = maMH;
        }

        public int getHocKi() {
                return hocKi;
        }

        public void setHocKi(int hocKi) {
                this.hocKi = hocKi;
        }

        public int getDiemLan1() {
                return diemLan1;
        }

        public void setDiemLan1(int diemLan1) {
                this.diemLan1 = diemLan1;
        }

        public int getDiemLan2() {
                return diemLan2;
        }

        public void setDiemLan2(int diemLan2) {
                this.diemLan2 = diemLan2;
        }

}
