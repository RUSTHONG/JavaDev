/**
 * 返回值：
 *      1. 这个返回值类型表示当前函数运行的结果返回的类型
 *      2. 返回值是通过在函数体【return关键字】返回的
 *      3. 如果返回值为void，表示这个函数没有返回值
 * 
 * 函数名：
 *      1. 符合动宾结构，见名知章
 *      2. 函数名是【通用】函数的方式，要求调用函数是 格式 函数名（实际参数列表）
 * 
 * 参数列表：
 *      1. 可以为空，表示该函数不需要借助于外部的数据来完成操作
 *      2. 参数列表可以放入多个参数，参数直接用逗号隔开
 *      3. 形式参数列表的顺序，决定了实际参数传入的顺序
 *          例如：
 *              (int num1, float num2, double num2, short num4)
 *          正确方式：
 *              (5, 1.4f, 2.5, 1)
 * 
 * 函数体：
 *      封装的功能代码
 */
class function {
    public static void main(String[] args) {
        //printHello();
        //addTwoNumber(10, 2);
        //用一个变量来保存函数的返回值
        int ret = returnFive();
        System.out.println("ret = " + ret);

        int sum = getSumOfTwoNumber(5,5);
        System.out.println("sum = " + sum);
    }
        /*
        修饰符(public static) 返回值类型 函数名(形式参数列表)
            //函数体
    
    }
    自定义函数在main函数之外
    */
    //无参数 无返回值的函数
    public static void printHello() {
        //函数体
        for (int i = 1; i <= 9; i++) {
            System.out.println("Hello!");
        }
    }

    //有参数 无返回值的函数
    public static void addTwoNumber(int num1, int num2) {
        System.out.println("num1 + num2 = " + (num1+num2));
    }

    /*
    return
    无参数，有返回值的函数
    */
    public static int returnFive() {
        return 5;
    }
    //有参数 有返回值的函数
    public static int getSumOfTwoNumber(int num1, int num2){
        return num1 + num2;
    }
    
}