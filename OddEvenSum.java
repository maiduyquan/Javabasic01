public class OddEvenSum {
    public static void main(String[] args) {
        int lowerbound=1,upperbound=1000;
        int sumOdd=0;
        int sumEven=0;
        int number=lowerbound;
        while (number<=upperbound){
            if (number % 2 ==0){
                sumEven+=number;
            }else{
                sumOdd+=number;
            }
            ++number;
        }
        System.out.println("the sum of odd number from " + lowerbound + " to " + upperbound + " is " + sumOdd);
        System.out.println("the sum of even number from " + lowerbound + " to " + upperbound + " is " + sumEven);
        System.out.println("the difference between the two sums is " +(sumOdd-sumEven));
    }
}
