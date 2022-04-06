public class ArithmeticTest {
    public static void main(String[] args) {
        int num1=98;
        int num2=5;
        int sum1,difference,product,quotient, remainder;

        sum1=num1+num2;
        difference=num1-num2;
        product=num1*num2;
        quotient=num1/num2;
        remainder=num1 % num2;

        System.out.print("the sum,difference,product,quotient, remainder of");
        System.out.print(" num1 ");
        System.out.print(" and ");
        System.out.print(" num2 ");
        System.out.print(" are ");
        System.out.print(sum1);
        System.out.print(", ");
        System.out.print(difference);
        System.out.print(", ");
        System.out.print(product);
        System.out.print(", ");
        System.out.print(quotient);
        System.out.print(", and ");
        System.out.println(remainder);

        ++num1;

        --num2;
        System.out.println("num1 after increment is "+num1);
        System.out.println("num2 after decrement is "+num2);
        quotient=num1/num2;
        System.out.println("new quotient of "+ num1 +" and "+ num2 +" is " +quotient);

    }
}
