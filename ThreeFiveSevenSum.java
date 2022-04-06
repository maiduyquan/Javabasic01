public class ThreeFiveSevenSum {
    public static void main(String[] args) {
        int lowerbound=1,upperbound=1000;
        int sum;
        int sum1=0;
        int sum2=0;
        int number=lowerbound;

        while (number<=upperbound ){
            if (number %3==0 && number %5==0 && number %7==0) {
                sum1 += number;
            }
            else if (number %3==0 || number %5==0 || number %7==0){
                sum2+=number;
            }
        }
        sum=sum2-sum1;

        System.out.println("tong cac so tu 1 den 1000 chia het cho 3,5,7 la:");
    }
}
