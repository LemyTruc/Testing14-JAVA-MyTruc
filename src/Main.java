import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. thêm học sinh
        // 2. hiển thị danh sách học sinh
        // 3. xóa học sinh dựa vào id
        // 4. tìm kiếm học sinh dựa vào id
        // 5. tìm học sinh có điểm trung bình cao nhất
        // 6. tìm học sinh có điểm trung bình thấp nhất
        // 7. sắp xếp học sinh theo tên
        // 8. cập nhật thông tin học sinh dựa vào id
        // 9. hiển thị ra học sinh có tổng điểm 3 môn trên 24đ
        // 10. hiển thị ra học sinh có tổng điểm dưới 18đ
        // 11. hiển thị ra danh sách học sinh đạt chất lượng giỏi (đtb > 8)
        // 12. thoát khỏi chương trình
        // học sinh = {id, hoTen, lop, diaChi, toan, ly, hoa}

        Scanner sc = new Scanner(System.in);
        QuanLyHocSinh ql = new QuanLyHocSinh();
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Hiển thị danh sách học sinh");
            System.out.println("3. Xóa học sinh dựa vào id");
            System.out.println("4. Tìm kiếm học sinh dựa vào id");
            System.out.println("5. Tìm học sinh có điểm trung bình cao nhất");
            System.out.println("6. Tìm học sinh có điểm trung bình thấp nhất");
            System.out.println("7. Sắp xếp học sinh theo tên");
            System.out.println("8. Cập nhật thông tin học sinh dựa vào id");
            System.out.println("9. Hiển thị ra học sinh có tổng điểm 3 môn trên 24đ");
            System.out.println("10. Hiển thị ra học sinh có tổng điểm dưới 18đ");
            System.out.println("11. Hiển thị ra danh sách học sinh đạt chất lượng giỏi (đtb > 8)");
            System.out.println("12. Thoát");

            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: ql.themHocSinh(sc); break;
                case 2: ql.hienThiDanhSachHocSinh(); break;
                case 3: ql.xoaHocSinh(sc); break;
                case 4: ql.timHocSinh(sc); break;
                case 5: ql.diemTrungBinhCaoNhat(); break;
                case 6: ql.diemTrungBinhThapNhat(); break;
                case 7: ql.sapXepTheoTen(); break;
                case 8: ql.capNhatThongTinHocSinh(sc); break;
                case 9: ql.danhSachHSTren24d(); break;
                case 10: ql.danhSachHSDuoi18d(); break;
                case 11: ql.danhSachHSGioi(); break;
                case 12:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("Chọn sai!");
            }
        } while (choice != 12);}
}