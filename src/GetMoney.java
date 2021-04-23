/*  我要去取款流程:
           1.找ATM机
           2.坐公交
           3.过马路
           4.插卡
           5.输入密码
           6.如果 我的密码是正确的
                取款
           7.如果 密码错误
                提示 密码有误重新输入
           8.去嗨皮!

           用英语表达:
           GetMoney
           {
                1.find ATM bank
                2.Take bus
                3.cross road
                4.insert card
                5.password
                6.if(password is ok){
                   money out
                }
                7.if(password is not ok){
                   password error
                }
                8.go happy
           }
           变成电脑能看懂的: C  PHP  python  JAVA(就业,哪个城市薪资, )

*/
//程序跑到电脑中
public class GetMoney {   //class,是java的组成的零部件,class叫做类,java程序的组成由多个class组成
   //这是写java程序的区域
   //java是从一个特殊的位置开始读: main方法:是程序的入口
   public static void main(String[] args) {
       //让程序做一件事,按照的我的要求,输出一句话
        /*
        注释:
            单行
            多行
        */
        System.out.println("我要去取款流程");
        System.out.println("找ATM机");
        System.out.println("坐公交");
        System.out.println("过马路");
        System.out.println("插卡");
        System.out.println("输入密码");
        System.out.println("如果 我的密码是正确的");
        System.out.println("取款");
        System.out.println("如果 密码错误,提示");
        System.out.println("去嗨皮!");
			
            /*
            表达式:
            1.算术表达式:+ - * /    计算的结果是一个数字
            2.比较表达式:>  >=  <   <=   ==  !=   计算的结果是布尔值(true或false)
        System.out.println(10 > 5);
        System.out.println(10 >= 5);
        System.out.println(10 < 5);
        System.out.println(10 <= 5);
        System.out.println(10 == 5);
        System.out.println(10 != 5);
*/
        //银行里存储的密码
        int password = 123456; //变量 int password
        //输入的密码
        int input = 123434;

        if (input == password) {
            System.out.println("执行取款");
        }

        if (input != password) {
            System.out.println("你的密码不正确,请重新输入");
        }
    }
}