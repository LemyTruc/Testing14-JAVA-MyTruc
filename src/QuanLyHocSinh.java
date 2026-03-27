import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHocSinh {
    private ArrayList<hocSinh> danhSachHocSinh = new ArrayList<>();

    //Tìm học sinh theo ID
    public hocSinh timHocSinhTheoId(String id) {
        for (hocSinh nv : danhSachHocSinh) {
            if (nv.getId().equals(id)) {
                return nv;
            }
        }
        return null;
    }

    // 1. thêm học sinh
    public void themHocSinh(Scanner sc) {
        System.out.println("Nhập id học sinh");
        String id = sc.nextLine();

        //kiểm tra id đã tồn tại hay chưa
        if (timHocSinhTheoId(id) != null) {
            System.out.println("id đã tồn tại, vui lòng nhập lại id");
            return;
        }
        //nếu chưa tồn tại thì thêm mới
        System.out.println("Nhập họ và tên học sinh");
        String hoTen = sc.nextLine();
        System.out.println("nhập lớp: ");
        String lop = sc.nextLine();
        System.out.println("nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.println("nhập điểm toán: ");
        double toan = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm lý");
        double ly = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm hóa");
        double hoa = Double.parseDouble(sc.nextLine());
        hocSinh hs = new hocSinh(id, hoTen, lop, diaChi, toan, ly, hoa);

        danhSachHocSinh.add(hs);
        System.out.println("Thêm học sinh thành công!");
    }

    // 2. hiển thị danh sách học sinh
    public void hienThiDanhSachHocSinh() {
        if (danhSachHocSinh.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (hocSinh nv : danhSachHocSinh) {
            nv.displayInfo();
        }
    }

    // 3. xóa học sinh dựa vào id
    public void xoaHocSinh(Scanner sc) {
        System.out.print("Nhập ID cần xóa: ");
        String id = sc.nextLine();
        // đặt cờ hiệu
        boolean found = false;
        for (hocSinh nv : danhSachHocSinh) {
            if (nv.getId().equals(id)) {
                danhSachHocSinh.remove(nv);
                System.out.println("Xóa học sinh thành công");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy!");
        }
    }
        // 4. tìm kiếm học sinh dựa vào id
        public void timHocSinh(Scanner sc) {
            System.out.print("Nhập ID cần tìm: ");
            String id = sc.nextLine();

            // đặt cờ là chưa tìm thấy = false
            boolean found = false;
            for (hocSinh nv : danhSachHocSinh) {
                if (nv.getId().equals(id)) {
                    nv.displayInfo();
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Không tìm thấy!");
            }
        }
        // 5. tìm học sinh có điểm trung bình cao nhất
        public void diemTrungBinhCaoNhat() {
            if (danhSachHocSinh.isEmpty()) {
                System.out.println("Danh sách học sinh rỗng");
                return;
            };
            hocSinh maxhs = danhSachHocSinh.get(0);

            //tìm kiểm
            for (hocSinh hs : danhSachHocSinh){
                if (hs.diemTrungBinh() > maxhs.diemTrungBinh()){
                    maxhs = hs;
                }
            }
            System.out.println("Nhân viên có tổng lương cao nhất");
            maxhs.displayInfo();
        }
        // 6. tìm học sinh có điểm trung bình thấp nhất
        public void diemTrungBinhThapNhat() {
            if (danhSachHocSinh.isEmpty()) {
                System.out.println("Danh sách học sinh rỗng");
                return;
            };
            hocSinh minhs = danhSachHocSinh.get(0);

            //tìm kiểm
            for (hocSinh hs : danhSachHocSinh){
                if (hs.diemTrungBinh() < minhs.diemTrungBinh()){
                    minhs = hs;
                }
            }
            System.out.println("Nhân viên có tổng lương cao nhất");
            minhs.displayInfo();
        }
        // 7. sắp xếp học sinh theo tên
        public void sapXepTheoTen() {
            danhSachHocSinh.sort((hs1,hs2)->hs1.getName().compareTo(hs2.getName())) ;
            System.out.println("Danh sách sinh viên sau khi sắp xếp theo tên: ");
            hienThiDanhSachHocSinh();
        }
        // 8. cập nhật thông tin học sinh dựa vào id
        public void capNhatThongTinHocSinh (Scanner sc){
            //kiểm tra rỗng
            if(danhSachHocSinh.isEmpty()){
                System.out.println("Danh sách học sinh trống");
                return;
            }
            // tìm học sinh cần cập nhật theo id
            System.out.println("nhập id nhân viên muốn cập nhật");
            String id = sc.nextLine();
            hocSinh hs = timHocSinhTheoId(id);
            // kiểm tra xem có tìm thấy id hay không
            if(hs == null){
                System.out.println("Không tìm thấy học sinh với id" + id);
                return;
            }

            //nếu tìm thấy học sinh thì cập nhật
            System.out.println("Nhập họ và tên học sinh mới");
            String hoTen = sc.nextLine();
            System.out.println("nhập lớp mới: ");
            String lop = sc.nextLine();
            System.out.println("nhập địa chỉ mới: ");
            String diaChi = sc.nextLine();
            System.out.println("nhập điểm toán mới: ");
            double toan = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập điểm lý mới");
            double ly = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập điểm hóa mới");
            double hoa = Double.parseDouble(sc.nextLine());

            //Tạo đối tượng
            hs = new hocSinh(id, hoTen, lop, diaChi, toan, ly, hoa);
            // cập nhật lại thông tin học sinh trong danh sách
            for (int i = 0; i <danhSachHocSinh.size(); i++){
                if (danhSachHocSinh.get(i).getId().equals(id)){
                    danhSachHocSinh.set(i,hs);
                    break;
                }
            }
            System.out.println("Cập nhật thông tin học sinh thành công");
        }
        // 9. hiển thị ra học sinh có tổng điểm 3 môn trên 24đ
        public void danhSachHSTren24d() {
            //kiểm tra rỗng
                if(danhSachHocSinh.isEmpty()){
                    System.out.println("Danh sách học sinh trống");
                    return;
                }
            boolean found = false;
            for (hocSinh hs : danhSachHocSinh) {
                if (hs.tongDiem() > 24) {
                    hs.displayInfo();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Không có học sinh nào > 24 điểm");
            }
        }
        // 10. hiển thị ra học sinh có tổng điểm dưới 18đ
    public void danhSachHSDuoi18d() {
            //kiểm tra rỗng
            if(danhSachHocSinh.isEmpty()){
                System.out.println("Danh sách học sinh trống");
                return;
            }
            boolean found = false;
            for (hocSinh hs : danhSachHocSinh) {
                if (hs.tongDiem() < 18) {
                    hs.displayInfo();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Không có học sinh nào < 18 điểm");
            }
        }
        // 11. hiển thị ra danh sách học sinh đạt chất lượng giỏi (đtb > 8)
        public void danhSachHSGioi() {
            //kiểm tra rỗng
            if(danhSachHocSinh.isEmpty()){
                System.out.println("Danh sách học sinh trống");
                return;
            }
            boolean found = false;
            for (hocSinh hs : danhSachHocSinh) {
                if (hs.diemTrungBinh() > 8) {
                    hs.displayInfo();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Không có học sinh giỏi");
            }
        }
}
