public class ArmstrongNumber {
    static boolean isArmstrong (int value){
        int sum = 0;
        int tmp = value;
        while (tmp != 0){
            int l = tmp%10;
            tmp = tmp/10;
            sum += Math.pow(l, 3);
        }
        return sum == value ? true : false;
    }
    public static void main(String[] args) {
        System.out.print(isArmstrong(381));
    }
}
