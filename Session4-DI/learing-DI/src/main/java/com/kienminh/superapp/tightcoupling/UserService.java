package com.kienminh.superapp.tightcoupling;

public class UserService {
    //UserSerVice goij Repo để CRUD user trong table
    //Xóa : xóa cứng (xóa tht trong table, SQL : delect,....)
    //      xóa mềm  (ko xóa thật đổi Status, active = False)!!! phải nhớ làm cái này trong APP
    // Ngoài ra CLASS SERVICE còn làm việc :
    // khi khách hàng đăng kí tài khoản mới, ngoài việc INSERT TABLE USER (qua REPO)
    // ta còn cần gửi mail confirm , hoặc SMS confirm,... hoặc NOTI qua FIREBASE
    // Nguyên lý SRP - Single Responsibility : mỗi class chỉ nên làm việc mình giỏi
    // Chỉ có 1 chỗ cần sửa nếu class cần sửa hay thay đổi

    // Để code gửi mail, gửi SMS ở đây , có 2 chỗ để sửa - khác nhau ý nghĩa code
    // Tránh vi phạm, tách class!!!!

    private EmailSender emailSender = new EmailSender(); //Service phụ thuộc EmailSender, EmailSender là dependency
    // new ngay tại đây gọi là direct control
    // ta gấn chặt thằng này rồi , khi ta new Service lậy tức có thằng EmailSender : tight-coupling

    // Ổn cho đến khi ta mở rộng bài toán
    // tạm thời bỏ qua info đưa bào từ GUI : email,password...
    public void registerUser() {
        //đoạn này mình sẽ gọi repo để persist() 1 dòng Account/user vào table

        emailSender.sendEmail();
    }
}
