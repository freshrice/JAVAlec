import java.util.Scanner;

class Abgcd{

    int gcd(int m, int n){
        if(m<n){
            int temp = m;
            m = n;
            n = temp;
        }
        if(n==0){
            return m;
        }
        return gcd(n, m%n);
    }

}


public class Homework4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Abgcd gc = new Abgcd();
        System.out.print("두 수를 입력하세요: ");
        System.out.printf("두 수의 최대공약수는 %d입니다.", gc.gcd(sc.nextInt(), sc.nextInt()));


    }
}

//아래는 반복문으로 구현된 코드
/*public class Homework4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int temp = 0;
        if(m<n){
            temp = m;
            m = n;
            n = temp;
        }
        while(n!=0){
            temp = m;
            m = n;
            n = temp%n;

        }
        System.out.printf("두 수의 최대공약수는 %d입니다.", m);




    }
}*/
