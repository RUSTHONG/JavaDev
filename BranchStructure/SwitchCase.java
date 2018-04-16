/**
 * 执行流程：
 *      当程序运行到switch-case结构，直接利用switch之后的变量去case中做匹配，找到
 *      完全匹配的case选项，执行case之后的处理方式，如果没有任何的一个case匹配执行,
 *      default里面的最终处理方式
 * 
 * 注意事项
 *      1. 在switch-case结构中，运行的代码只能是在case到break之间的代码！！！
 *      2. break可以省略，但是之前的case会继续往下执行，直到遇到break跳出switch-case结构
 *      3. 在case之外的代码是不会被运行的，在java中这个会被认为是一个无效代码，如果是eclipse提示
 *      是一个unreachable code
 *      4. 在switch-case 中不能出现相同的case选项
 *      5. default 可省略
 */
import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {
        //定义变量，用于保存用户的输入选项
        int choose = 0;
        //创建Scanner扫描器，从键盘上获取用户输入的数据
        Scanner sc = new Scanner(System.in);

        System.out.println("please choose your order");
        System.out.println("1. fork");
        System.out.println("2. cheese");
        System.out.println("3. fish");
        System.out.println("4. beer");

        //获取用户输入的数据保存到choose变量中
        choose = sc.nextInt();

        //进行switch-case选择
        switch (choose) {
            case 1:
                System.out.println("a chunk of fork");
                break;
            case 2:
                System.out.println("a piece of cheese");
                break;
            case 3:
                System.out.println("a dish of fise");
                break;
            case 4:
                System.out.println("a glass of beer");
                break;
            default:
                System.out.println("搞错了");

        }
    }
}