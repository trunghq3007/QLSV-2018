/**
 * 
 */
package entity;

/**
 * @author HQTrung
 *
 */
public class KhoaHoc {
        // mã khóa học
        private String maKhoaHoc;
        // tên khóa học
        private String tenKhoaHoc;

        /**
         * @param maKhoaHoc
         * @param tenKhoaHoc
         */
        public KhoaHoc(String maKhoaHoc, String tenKhoaHoc) {
                this.maKhoaHoc = maKhoaHoc;
                this.tenKhoaHoc = tenKhoaHoc;
        }

        /**
         * 
         */
        public KhoaHoc() {
        }

        @Override
        public String toString() {
                return "KhoaHoc [maKhoaHoc=" + maKhoaHoc + ", tenKhoaHoc=" + tenKhoaHoc + "]";
        }

        public String getMaKhoaHoc() {
                return maKhoaHoc;
        }

        public void setMaKhoaHoc(String maKhoaHoc) {
                this.maKhoaHoc = maKhoaHoc;
        }

        public String getTenKhoaHoc() {
                return tenKhoaHoc;
        }

        public void setTenKhoaHoc(String tenKhoaHoc) {
                this.tenKhoaHoc = tenKhoaHoc;
        }

}
