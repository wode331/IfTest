import javax.swing.*;
import java.io.IOException;

/**
 * @author 享学课堂-SaiLing老师
 * @老师qq:2408524688
 */
public class Demo{   //class,是java的组成的零部件,class叫做类,java程序的组成由多个class组成
    //这是写java程序的区域
    //java是从一个特殊的位置开始读: main方法:是程序的入口
    public static void main(String[] args){
        //让程序做一件事,按照的我的要求,输出一句话
         /*
         注释:
             单行
             多行
         */
            System.out.println("我家养了一只会说话的鹦鹉,你想去看吗?");
            System.out.println("--好呀好呀");
            System.out.println("---你看我养的鹦鹉");
            System.out.println("----怎么让鹦鹉说话?");
            System.out.println("-----逗它");
            System.out.println("------鹦鹉叫了");
            System.out.println("-------鹦鹉没有说话呀");
            System.out.println("--------鹦鹉说的是鹦鹉它们自己的话呀");
            /*
            表达式:
            算术表达式:+ - * /
            比较表达式:>  >=  <   <=   ==  !=

             */
            System.out.println(10>5);
            System.out.println(10>=5);
            System.out.println(10<5);
            System.out.println(10!=5);
            System.out.println(10==5);


        /*  支付:
            银行卡刷卡后,待你输入密码,会获取到什么信息?
            1.银行卡里的钱余额
            2.需要支付的额度
            3.判断余额是否大于支付额度
                大于支付额度
            4.执行支付
                小于支付额度
            5.提示余额不足
         */
        //银行卡里的钱
        int money =156; //变量 int money
        //需求支付500块
        int pay = 500;

        if(money >= pay){
            System.out.println("执行支付");
        }

        if(money<pay){
            System.out.println("你的余额不足");
        }
//------------------------------------------------------
        /*
            登录:
            账号
            密码
            核实账号和密码
            如果都ok
                登录
            如果不OK
                提示

         */
        int account = 742494484;
        int password = 53321;
        if(account == 742494484){


        }

    }

}
