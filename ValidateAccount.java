package bank;

public class ValidateAccount {
    public final String MOBILE = "0967891234";
    public final String PASSWORLD = "Nguyen Huy Hoang";
    public boolean checkAcount(String mobile,String passworld){
        if(mobile.equals(MOBILE)){
            if(passworld.equals(PASSWORLD)){
                System.out.println("Đăng nhập thành công");
                return true;
            }else {
                System.out.println("Mật Khẩu sai, vui long nhập lại");
                return false;
            }
        }else {
            System.out.println("Kiểm tra lại số điện thoại hoặc passworld");
        return false;
        }
    }
}
