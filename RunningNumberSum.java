public class RunningNumberSum {
    public static void main(String[] args) {
        int lowerbound=1;
        int upperbound=1000;
        int sum2 =0;
        int num=lowerbound;
        while (num<=upperbound){
            sum2=sum2+num;
            ++num;
        }
        System.out.println("the sum from " + lowerbound +" to " + upperbound + " is " + sum2);

    }
}
