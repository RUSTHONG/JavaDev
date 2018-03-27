/**
 * 数组能够顺序存储相同类型的多个数据
 * 在Java程序中创建一个数组需要三步：1. 声明数组的名字和类型；2. 创建数组；3. 初始化数组元素
 * 完整模式：
 *      double[] a;
 *      a = new double[N];
 *      for (int i = 0; i < N; i++)
 *          a[i] = 0.0;
 * 
 * 简化写法：
 *      double[] a = new double[N];
 * 
 * 声明初始化：
 *      int [] a = {1, 1, 12, 3}
 */
class Array {
    public static void main(String[] args) {
        int [] array = {1, 1, 12, 3};
        int maxElement = maxElement(array);
        System.out.println(maxElement);
        
    }

    //找出数组中最大的元素
    public static int maxElement(int []a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
            
    }
}