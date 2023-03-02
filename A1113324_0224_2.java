import java.util.*;
public class A1113324_0224_2 {
  public static void main(String argv[]) {
  float tempc;
  System.out.printf("請輸入攝氏溫度： ");
  Scanner sc = new Scanner(System.in);
  tempc = sc.nextFloat();

  float tempf;
  tempf = tempc * 9/ 5 + 32 ;
  System.out.println("換算為華氏溫度為：" +tempf);
  }
}