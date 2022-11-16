import java.security.Key;
import java.sql.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] ints1= {1,2,3,5};
        Set<Integer> integerSet1 = new HashSet<>();
        for (int i = 0; i < ints1.length; i++) {
            integerSet1.add(ints1[i]);
        }
        int[] ints2= {2,5,7};
        Set<Integer> integerSet2 = new HashSet<>();
        for (int i = 0; i < ints2.length; i++) {
            integerSet2.add(ints2[i]);
        }
        Map<Integer,Integer>integerMap = new HashMap<>();
        addNumberToMap(integerMap,ints1);
        addNumberToMap(integerMap,ints2);

        List<Integer>integerList = new ArrayList<>(integerMap.keySet());
        for (Integer number:integerList) {
            if (integerMap.get(number) < 2) {
                integerMap.remove(number);
            }
        }

        List<Integer>result = new ArrayList<>(integerMap.keySet());
        System.out.println("Phần tử trùng nhau giữa 2 mảng là " +result);
    }


    //        String str = "abcba";
//        String[] strings = str.split("");
//        Map<String, Integer> result = addStringToMap(strings);
//        List<String> stringList = new ArrayList<>(result.keySet());
//        for (String string : stringList) {
//            System.out.println(string + " xuất hiện " + result.get(string));
//        }

    public static Map<Integer,Integer> addNumberToMap(Map<Integer,Integer> integerMap,int[] ints){
        for (int i = 0; i < ints.length; i++) {
            if (integerMap.containsKey(ints[i])) {
                integerMap.put(ints[i], integerMap.get(ints[i]) + 1);
            } else {
                integerMap.put(ints[i], 1);
            }
        }
        return integerMap;
    }

    public static Map<String,Integer> addStringToMap(String[] strings){
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (stringIntegerMap.containsKey(strings[i])) {
                stringIntegerMap.put(strings[i], stringIntegerMap.get(strings[i]) + 1);
            } else {
                stringIntegerMap.put(strings[i], 1);
            }
        }
        return stringIntegerMap;
    }












//        String str = "uhfsa";
//        System.out.println(str);
//        String swap;
//        String[] arr = str.split("");
//        for (int i = 0; i < arr.length -1; i++) {
//            System.out.println(arr[i]);
//            System.out.println(arr[i+1]);
////            if (arr[i].compareTo(arr[i+1]) > 0) {
////                swap = arr[i];
////                arr[i] = arr[i+1];
////                arr[i+1] = swap;
////            }
////            System.out.println(str);
//        }
//        System.out.println(str);



















    //Đổi số la mã thành số nguyên
    public static int convert(String str) {
        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            switch (str.charAt(i)) {
                case 'I':
                    arr[i] = 1;break;
                case 'V':
                    arr[i] = 5;break;
                case 'X':
                    arr[i] = 10;break;
                case 'L':
                    arr[i] = 50;break;
                case 'C':
                    arr[i] = 100;break;
                case 'D':
                    arr[i] = 500;break;
                case 'M':
                    arr[i] = 1000;break;
            }
        }
        int result = arr[arr.length - 1];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                result -= arr[i];
            } else {
                result += arr[i];
            }
        }
        return result;
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
