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