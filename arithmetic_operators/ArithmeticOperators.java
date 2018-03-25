/**
 * 在操作算术运算的时候，如果一个变量或者一个数据，没有被赋值号赋值的情况下，是不会发生任何的改变
 */
class ArithmeticOperators
{
    public static void main(String[] arg)
    {
        int number1 = 20;
        int number2 = 10;

        System.out.println("number1-number2: " + (number1-number2));
        System.out.println("number1: " + number1);
        System.out.println("number2: " + number2);

        /* 
        +=, -=, /=, %=
        例如：num1 = num1 + num2; num1 += num2;
        */
        number1 += number2;
        System.out.println("number1: " + number1);

        /*
        自增自减运算符
            这些运算符是提供给【变量】使用
            ++: 自增操作，相当于当前变量 += 1
                优先级问题：如果++运算符在变量之后，先执行该行语句，再来执行++自增操作，如果在变量
                之前，先执行自增操作，再来执行该行语句的运行
            
            --：自减操作，相对于当前变量 -= 1
                自减的优先级同上
        */
        //建议：在代码中使用自增自减运算符，一般都是单独成行，避免没必要的歧义
        /*
        面试题
            int num = 5;
            ++(num++) 语法错误
                解释：
                    按照语法，首先执行num++，结果是一个6，是一个常量，这个常量就是小括号表示的数值，也是一个
                    常量。在这里括号里面的内容会被认为是一个常量6来处理
                    在++或者--中不能操作任何的【常量】
        */
        int num = 10;

        System.out.println("num = " + num++);
        System.out.println("num = " + num);

        System.out.println("num = " + ++num);
        System.out.println("num = " + num);

        System.out.println("num = " + num--);
        System.out.println("num = " + num);

        System.out.println("num = " + --num);
        System.out.println("num = " + num);

        /*
        关系运算符
            < > == <= >= !=
            代码中支持关系运算符
            关系运算符的结果：boolean: true;false
        */

        System.out.println("5>3: " + (5 > 3));
        System.out.println("2>3: " + (2 > 2));

        /*
        逻辑运算符
        与& 同真为真，有假为假；
        或| 有真为真，同假为假；
        非! 真变假假变真
        */
        boolean ret = (5>4) && (2>3);
        System.out.println("ret = " + ret);

        ret = (5>4) || (2>3);
        System.out.println("ret = " + ret);

        ret = !(5>4);
        System.out.println("ret = " + ret);

        /*
        在计算机世界中，默认的真假关系是1和0，而java不支持这样的方式，采用的是true和false来代表
        在计算机世界中，非0即真
        while (true) 死循环 java支持
        while (1) 死循环 其他语言支持 C/OC/C++/JavaScript
        */

        /*
        面试题：（不针对Java）
            请解释以下内容的含义，用通俗的代码表示
            前提：n是一个int类型的变量

            !n的含义
            n = 1; !n = false;
            n = 0; !n = true;
            n = 2; !n = false; //非0即真

            !n的含义是：判断当前n的值是否等于0，换一种方式表示如下
            n == 0;
        */
    }
}