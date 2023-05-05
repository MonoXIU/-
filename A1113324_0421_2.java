import java.util.Scanner;
//日期為（YYYY/MM/DD 或 MM/DD/YYYY)

public class A1113324_0421_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String check_1="[0-9]{4}/(0[0-9]|1[1-2])/(0[1-9]|[1-2][0-9]|3[0-1])";
        String check_2="([0][0-9]|[1][1-2])/([0-2][0-9]|[3][0-1])/[0-9]{4}";
        String input;
        String[] datecheck;
        String year="",month="",day="";

        while(true){
            System.out.print("請輸入日期：");
            input = scanner.next();
            if (input.matches(check_1)) {
                datecheck= input.split("/");
                year = datecheck[0];
                month = datecheck[1];
                day = datecheck[2];
                break;
            } else if(input.matches(check_2)) {
                datecheck= input.split("/");
                year = datecheck[2];
                month = datecheck[0];
                day = datecheck[1];
                break;
            } else {
                System.out.println("輸入的日期格式不正確，請重新輸入！");
            }
        }
        System.out.println("年：" + year);
        System.out.println("月：" + month);
        System.out.println("日：" + day);
    }
}

