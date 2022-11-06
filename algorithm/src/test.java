import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        makeFibonacis(100);
    }

//    tạo dãy fibonacy nhỏ hơn number
    public static  void makeFibonacis(int number){
        int a = 0;
        int b = 1;
        int fibonaci = 1;
        ArrayList<Integer> fibonaciArr = new ArrayList();
        fibonaciArr.add(0);
        fibonaciArr.add(1);
        for (; fibonaci <= number; ) {
            fibonaciArr.add(fibonaci);
            a = b;
            b = fibonaci;
            fibonaci = a + b;
        }
        System.out.println(fibonaciArr);
    }




//        int sum = 0;
//        for (int i = 0; i < 100; i++) {
//            if (checkPrime(i)) {
//                sum += i;
//            }
//        }
//        System.out.println("Tổng các số nguyên tố trong dãy số từ 1 tới 100 là: "+ sum);


    public static void log() {
        String str = "abcabcdef";
        String[] arr = str.split("");
        int count;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "*") {
                continue;
            } else {
                count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        count++;
                        arr[j] = "*";
                    }
                }
                System.out.println("ký tự " + arr[i] + " xuất hiện " + count + " lần");
            }
        }
    }


//    Kiểm tra số nguyên tố
    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % 2 == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
