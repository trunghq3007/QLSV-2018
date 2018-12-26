/**
 * 
 */
package entity;

import java.util.Date;

/**
 * @author HQTrung
 *
 */
public class SinhVien {
        // mã sinh viên
        private char maSV;
        // tên sinh viên
        private String tenSV;
        // giới tính
        private String gioiTinh;
        // ngày sinh
        private Date ngaySinh;
        // mã lớp
        private char maLop;
        // quê quán
        private String queQuan;

        /**
         * 
         */
        public SinhVien() {
        }

        /**
         * @param maSV
         * @param tenSV
         * @param gioiTinh
         * @param ngaySinh
         * @param maLop
         * @param queQuan
         */
        public SinhVien(char maSV, String tenSV, String gioiTinh, Date ngaySinh, char maLop, String queQuan) {
                this.maSV = maSV;
                this.tenSV = tenSV;
                this.gioiTinh = gioiTinh;
                this.ngaySinh = ngaySinh;
                this.maLop = maLop;
                this.queQuan = queQuan;
        }

        @Override
        public String toString() {
                return "SinhVien [maSV=" + maSV + ", tenSV=" + tenSV + ", gioiTinh=" + gioiTinh + ", maLop=" + maLop
                                + ", queQuan=" + queQuan + "]";
        }

        public char getMaSV() {
                return maSV;
        }

        public void setMaSV(char maSV) {
                this.maSV = maSV;
        }

        public String getTenSV() {
                return tenSV;
        }

        public void setTenSV(String tenSV) {
                this.tenSV = tenSV;
        }

        public String getGioiTinh() {
                return gioiTinh;
        }

        public void setGioiTinh(String gioiTinh) {
                this.gioiTinh = gioiTinh;
        }

        public Date getNgaySinh() {
                return ngaySinh;
        }

        public void setNgaySinh(Date ngaySinh) {
                this.ngaySinh = ngaySinh;
        }

        public char getMaLop() {
                return maLop;
        }

        public void setMaLop(char maLop) {
                this.maLop = maLop;
        }

        public String getQueQuan() {
                return queQuan;
        }

        public void setQueQuan(String queQuan) {
                this.queQuan = queQuan;
        }

}
