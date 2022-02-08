import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        float rate = 23000;
        System.out.printf("1USD = %fVND",rate);
        System.out.println(" Nhập số tiền USD muốn chuyển đổi");
        Scanner input = new Scanner(System.in);
        float usd = input.nextFloat();
        float vnd = usd * rate;
        System.out.printf("%f USD = %f VND",usd,vnd);
    }
}
