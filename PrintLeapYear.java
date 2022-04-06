public class PrintLeapYear {
    int a;
    int count=0;
    public static void main(String[] args) {
        System.out.println("các năm nhuận từ AD999 đến AD2010 là: ");

        for (int i = 999; i <= 2010; i++) {
            // nếu i không chia hết cho 5 thì quay lại vòng lặp for
            if (i % 4 != 0) {
                continue;
            }

            System.out.print(i + ",");
        }
    }
}
