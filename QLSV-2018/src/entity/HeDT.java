/**
 * 
 */
package entity;

/**
 * @author HQTrung
 *
 */
public class HeDT {
        // mã hệ đào tạo
        private char maHeDT;
        // tên hệ đào tạo
        private String tenHeDT;

        /**
         * 
         */
        public HeDT() {
        }

        /**
         * @param maHeDT
         * @param tenHeDT
         */
        public HeDT(char maHeDT, String tenHeDT) {
                this.maHeDT = maHeDT;
                this.tenHeDT = tenHeDT;
        }

        @Override
        public String toString() {
                return "HeDT [maHeDT=" + maHeDT + ", tenHeDT=" + tenHeDT + "]";
        }

        public char getMaHeDT() {
                return maHeDT;
        }

        public void setMaHeDT(char maHeDT) {
                this.maHeDT = maHeDT;
        }

        public String getTenHeDT() {
                return tenHeDT;
        }

        public void setTenHeDT(String tenHeDT) {
                this.tenHeDT = tenHeDT;
        }

}
