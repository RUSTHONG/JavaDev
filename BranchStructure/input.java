//导包，让当前代码拥有使用Scanner工具的能力
import java.util.Scanner;
class input {
    public static void main(String[] args) {
        int score = 59;

        /*
        让程序能够接受从键盘上出入的数据
        需要使用Scanner扫描器，需要导包

        1. 导包
        2. 使用Scanner工具，创建Scanner
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in:");
        score = sc.nextInt();
        
        //如果说成绩大于100或者小于0，认为是错误的数据，就终止程序
        if (score > 100 || score < 0) {
            System.out.println("invalid parameter");
            return; // 表示程序结束，之后的代码不会运行
        }
        
        if (score >= 60) {
            System.out.println("pass");
        } else {
            System.out.println("please call your parents");
        }
    }
}