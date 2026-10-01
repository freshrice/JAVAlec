import java.util.Scanner;


public class Homework3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int arrNum = sc.nextInt();
        int[] arr1 = new int[arrNum];
        System.out.print("수를 입력하세요: ");
        for(int i = 0; i<arrNum; i++){
            arr1[i] = sc.nextInt();
        }
        int maxIm = arr1[0];
        int minIm = arr1[0];
        for(int i = 0; i<(arrNum-1); i++){
            if(arr1[i]<=arr1[i+1]){
                maxIm = arr1[i+1];
            }

        }
        for(int i = 0; i<(arrNum-1); i++){
            if(arr1[i]>=arr1[i+1]){
                minIm = arr1[i+1];
            }

        }
        System.out.print("최대값: " + maxIm + "\n");
        System.out.print("최소값: " + minIm + "\n");


    }
}
