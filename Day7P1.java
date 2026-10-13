public class Day7P1 {
 
    public static int sum(int n) {
        if (n > 0) {
            return n + sum(n - 1);
        } else {
            return 0;
        }
    }
 
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
 
// 10+sum(10-1)
// 10+9+sum(9-1)
// 10+9+8+sum(8-1)
// 10+9+8+7+sum(7-1)
// 10+9+8+7+6+sum(6-1)
// 10+9+8+7+6+5+sum(5-1)
// 10+9+8+7+6+5+4+sum(4-1)
// 10+9+8+7+6+5+4+3+sum(3-1)
// 10+9+8+7+6+5+4+3+2+sum(2-1)
// 10+9+8+7+6+5+4+3+2+1+sum(1-1)
// 10+9+8+7+6+5+4+3+2+1+0