/**
 * 展示100以内的偶数
 */

 class EvenNum {
     public static void main(String[] args) {
        int num = 100;
        do {
            System.out.println(num);
            num -= 2 ;
        } while (num >= 0); 

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        
        for (int a = 0; a <=100; a += 2) {
            System.out.println(a);
        }
        }
     }
 }