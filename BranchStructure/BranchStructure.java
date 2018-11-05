/**
 * 代码中有三大结构：顺序结构、分支结构和循环结构
 * if (判断语句 true/false) //语句体
 * {
 * }
 * 运行流程：
 *  当程序运行到if语句，首先判断if之后的括号里面的内容是否为true，如果为true执行语句体，如果为false，直接
 * 执行大括号之后的语句
 * 
 * if (判断语句 true/false){
 * //true 语句体
 * }else{
 * //false 语句体}
 * 运行流程：
 *      当程序运行到if-else语句，首先判断if之后的括号里面的内容是否为true，如果为true执行true语句体，如果为
 *      false执行false语句体
 * 
 * if (条件1){
 * } else if (条件2) {
 * } else if (条件3){
 * }
 * 
 * swith - case
 */
class BranchStructure
{
    public static void main(String[] args)
    {
        //闰年条件：能被400整除，或者能被4整除但是不能被100整除
        int year = 2016;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println("This is leapYear");
        }
        else
        {
            System.out.println("This isn't leapYear");
        }

        
    }
}
