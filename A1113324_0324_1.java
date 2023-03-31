import java.util.Scanner;

class Animal{
    String name;
    double height;
    double weight;
    double speed;

    double distance(double x){
	double k=x*this.speed;  
        return k;  
    }
    double distance(double x, double y){  
        double k=x*y*this.speed;  
        return k;  
    }
    void show(){
        System.out.println("姓名：" + this.name);
        System.out.println("身高(公尺)：" + this.height);
        System.out.println("體重(公斤)：" + this.weight);
        System.out.println("速度(公尺/分鐘)：" + this.speed);
    }
}

public class A1113324_0324_1 {
    public static void main(String[] args) {

	Animal []member = new Animal[4];

        member[0]=new Animal();
        member[0].name="雪寶";
        member[0].height=1.1;
        member[0].weight=52;
        member[0].speed=100;

        member[1]=new Animal();
        member[1].name="驢子";
        member[1].height=1.5;
        member[1].weight=99;
        member[1].speed=200;

        member[2]=new Animal();
        member[2].name="安那";
        member[2].height=1.7;
        member[2].weight=48;
        member[2].speed=120;

        member[3]=new Animal();
        member[3].name="愛沙";
        member[3].height=1.7;
        member[3].weight=50;
        member[3].speed=120;

	for(int i=0;i<member.length;i++){
          member[i].show();
        }

        for(int m=0;m<member.length;m++){
	double x;
	System.out.printf("請輸入"+member[m].name+"跑步的時間：");
        Scanner input=new Scanner(System.in);
	x=input.nextDouble();
        input.nextLine();
	double y;
        System.out.printf("請輸入"+member[m].name+"的加速度：");
        y=input.nextDouble();
	input.nextLine();

	if (y==0){
        System.out.println(member[m].name+"跑的距離為:"+member[m].distance(x));
        }else{
        System.out.println(member[m].name+"跑的距離為:"+member[m].distance(x,y));
	}
      
    }	
  }
}



