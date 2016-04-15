/**
 * Created by wsdevotion on 16/4/15.
 */
//有数组penny，penny中所有的值都为正数且不重复。每个值代表一种面值的货币，每种面值的货币可以使用任意张，再给定一个整数aim(小于等于1000)代表要找的钱数，求换钱有多少种方法。
//        给定数组penny及它的大小(小于等于50)，同时给定一个整数aim，请返回有多少种方法可以凑成aim。
//        测试样例：
//        [1,2,4],3,3
//        返回：2
public class dynamic {

    public static void main(String [] args) {
        int [] penny = new int [] {1, 2, 4};
        int result = countWays(penny, 3, 3);
        System.out.println(result);
    }

    public static int countWays(int[] penny, int n, int aim) {
        // write code here
        int f [] = new int [1000];
        f[0] = 1;
        for(int i=0; i< n; i++) {
            for (int j=penny[i]; j<= aim; j++ ){
                f[j] += f[j - penny[i]];
            }
        }
        return f[aim];
    }
}
