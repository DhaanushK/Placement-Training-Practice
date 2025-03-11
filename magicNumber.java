import java.util.Scanner;

public class magicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int sum = 0;
        while(n>0){
            i = n % 10;
            sum+=i;
            n=n/10;
            if(sum>9){
                n=sum;
                sum=0;
            }
        }
        System.out.println(sum);
        if(sum==1){
            System.out.println("magic number");
        }
    }
}
