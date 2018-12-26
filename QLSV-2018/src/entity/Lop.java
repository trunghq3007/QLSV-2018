/**
 * 
 */
package entity;

/**
 * @author HQTrung
 *
 */
public class Lop {
        // mã lớp
        private char maLop;
        // tên lớp
        private String tenLop;
        // mã khoa
        private char maKhoa;
        // mã hệ đào tạo
        private char maHeDT;
        // mã khóa học
        private char maKhoaHoc;

        /**
         * 
         */
        public Lop() {
        }

        /**
         * @param maLop
         * @param tenLop
         * @param maKhoa
         * @param maHeDT
         * @param maKhoaHoc
         */
        public Lop(char maLop, String tenLop, char maKhoa, char maHeDT, char maKhoaHoc) {
                this.maLop = maLop;
                this.tenLop = tenLop;
                this.maKhoa = maKhoa;
                this.maHeDT = maHeDT;
                this.maKhoaHoc = maKhoaHoc;
        }

        @Override
        public String toString() {
                return "Lop [maLop=" + maLop + ", tenLop=" + tenLop + ", maKhoa=" + maKhoa + ", maHeDT=" + maHeDT
                                + ", maKhoaHoc=" + maKhoaHoc + "]";
        }

        public char getMaLop() {
                return maLop;
        }

        public void setMaLop(char maLop) {
                this.maLop = maLop;
        }

        public String getTenLop() {
                return tenLop;
        }

        public void setTenLop(String tenLop) {
                this.tenLop = tenLop;
        }

        public char getMaKhoa() {
                return maKhoa;
        }

        public void setMaKhoa(char maKhoa) {
                this.maKhoa = maKhoa;
        }

        public char getMaHeDT() {
                return maHeDT;
        }

        public void setMaHeDT(char maHeDT) {
                this.maHeDT = maHeDT;
        }

        public char getMaKhoaHoc() {
                return maKhoaHoc;
        }

        public void setMaKhoaHoc(char maKhoaHoc) {
                this.maKhoaHoc = maKhoaHoc;
        }

}
