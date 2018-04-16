class VarType
{
    public static void main(String[] arg)
    {
        // 定义声明变量的格式（单行注释）
        // 数据类型 变量名 = 数据
        /**（文档注释）
         * boolean 布尔值 true false
         * byte 8位有符号整数 min -128;max 127
         * short 16位有符号整数 min -32768;max32767
         * int 32位有符号整数 min -2147483648（-2^31）;max 2147483647（2^31-1）
         * long 64位有符号整数 -2^63~(2^63-1)
         * float 32位浮点数 1.4E-45~3.4028235E38
         * double 64位浮点数 4.9E-324~1.7976931348623157E308
         * char 16位Unicode字符
         */
        /*整型的定义格式*/
        byte byteNumber = 10;
        short shortNumber = 20;
        int intNumber = 40;
        long longNumber = 80; // 80l或者80L表示这个数据是一个long类型的数据

        System.out.println("byte: " + byteNumber);
        System.out.println("short: " + shortNumber);
        System.out.println("int: " + intNumber);
        System.out.println("long: " + longNumber);

        /*浮点型变量定义*/
        /*
        如果一个float类型变量接受一个小数，而这个小数没有作任何的修饰，系统
        会默认这个小数是double类型，而double类型能保存的数据范围远远大于float，系统
        会认为这样的操作是错误的
        */
        float floatNumber = 3.14f; // 3.14f或3.14F表示是float类型
        double doubleNumber = 3.14;

        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);

        /* 布尔类型 Boolean类型 */
        boolean trueValue = true;
        boolean falseValue = false;

        System.out.println("trueTest: " + trueValue);
        System.out.println("falseTest: " + falseValue);

        /* char类型变量定义 */
        char ch1 = 'a'; // 一个字符 单引号包含的单个元素
        char ch2 = '\101'; // 转义字符，后面跟随的数字是一个八进制数
        char ch3 = 97; // 字符小写a对应的ASCII值
        char ch4 = '\0'; // ASCII码表中的一个字符 nul \0 这是字符类型的"0"值

        System.out.println("char1: " + ch1);
        System.out.println("char2: " + ch2);
        System.out.println("char3: " + ch3);
        System.out.println("char4: " + ch4);

        /*注意事项：
            a)在java当中一个变量在没有赋值的情况下，是不能被使用的
            b)在计算机中，原则是保证数据的完整性，不考虑所占内存空间问题，那么浮点型（小数）系统默认
            为double类型，保证数据的精度，完整性，但是要给float类型赋值的时候，如果不加修饰，赋值会
            报错，所以要求给float类型赋值的浮点类型数据必须加上f或F修饰
            例如：
                float floatNumber = 3.14f;
                float floatNumber = 0.618F;
            c)字符变量是可以赋值一个字母，一个转义字符甚至一个数字但是数字范围要求在ASCII码范围内，转义
            字符之后可以使用八进制数，一个特殊字符\0，这是ASCII码表里面第一个字符，是字符的"0"值
            d) = 赋值
        */
    }
}