public class hocSinh {
    //khai báo thuộc tính
    private String id;
    private String hoTen;
    private String lop;
    private String diaChi;
    private double toan;
    private double ly;
    private double hoa;
    //Khởi tạo constructor không có tham số
    //public hocSinh(){}

    //Constructor
    public hocSinh(String id, String hoTen, String lop, String diaChi, double toan, double ly, double hoa){
        this.id = id;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diaChi=diaChi;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
    }

    public void displayInfo(){
        System.out.println("ID: " + id
                + " | Họ và tên học sinh: " + hoTen
                + " | Lớp: " + lop
                + " | Địa chỉ: " + diaChi
                + " | Điểm toán: " + toan
                + " | Điểm lý: " + ly
                + " | Điểm hóa: " + hoa
                + " | Tổng điểm: " + tongDiem()
                + " | Điểm trung bình: " + diemTrungBinh());
    }

    public String getId() {return id;}
    public double tongDiem(){return (toan+ly+hoa);}
    public double diemTrungBinh (){return tongDiem()/3; }
    //Lấy tên trong họ và tên
    public String getName() {
        String[] parts = hoTen.trim().split("\\s+");
        return parts[parts.length - 1];
    }


}
