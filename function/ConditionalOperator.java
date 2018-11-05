/**
 * 条件运算符（三目运算符）
 * 条件 ? 语句1 : 语句2
 * 类似于if-else 结构
 * 执行流程：
 *      条件如果为true 执行语句1，如果为false 执行语句2
 *      
 */
class ConditionalOperator {
    public static void main(String[] args) {
       int num1 = 5;
       int num2 = 10;
       num1 = (num1 > num2) ? num1 : num2;
       System.out.println("num1 = " + num1); 
    }
}