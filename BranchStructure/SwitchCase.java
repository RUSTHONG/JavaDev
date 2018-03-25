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