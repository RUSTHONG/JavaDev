/**
 * 循环结构的三种方式
 *      while （判断条件 true false） {
 *          循环体；
 *          （循环条件变更）      
 *      }
 *      
 *      do {
 *          循环体；
 *          （循环条件变更）
 *      } while (循环条件);（分号不能少）
 * 
 *      
 *      for ()
 */
class circulation {
    public static void main(String[] args) {
        int num = 10;
        //循环条件
        while (num > 0) {
            //循环体
            System.out.println(num);
            num--;
        
        int num1 = 3;
        do {
            System.out.println(num1);
            num1--;
        } while (num1 > 0);
        }
    }
}