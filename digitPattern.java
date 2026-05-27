import java.util.* ;
public class digitPattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int sum = 0;
        int num = 1;
        for(int i=0; i<rows; i++){
            sum=0;
            for(int j=rows; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print(num+" ");
                int temp=num;
                while(temp!=0){
                    sum = sum + temp%10;
                    temp /=10;
                }
                num++;
            }
            num=sum;
            System.out.println();
        }
    }
}
