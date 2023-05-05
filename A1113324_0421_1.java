import java.util.Scanner;
public class A1113324_0421_1 {
    public static void main(String[] args){
        String mail;
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入你的Email: ");
        mail = sc.next();

        if(mail.matches("[a-z]+@[a-z]+\\.[a-z]+")){
            System.out.println(mail+"是正確的email格式。");
        }else{
            System.out.println(mail+"非正確的email格式。");
        }
    }
}