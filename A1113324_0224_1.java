import java.util.*;
public class A1113324_0224_1 {
  public static void main(String argv[]) {
    int num;
    System.out.println("請輸入任意整數");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    if (num % 2 == 0) { 
      System.out.println(num + " 是偶數。");
    } else {
      System.out.println(num + " 是奇數。");
    }
  }
}