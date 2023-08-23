import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("hello");
        //soutm: 현재 작업중인 class.method 이름을 표시
        System.out.println("Main.main");
        //soutp: 매개변수의 값을 출력할 때
        System.out.println("args = " + Arrays.toString(args));

        //구구단
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i<=b; i++){
            for(int j = 1; j<=9; j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }

        // TestClass의 testMethod1을 호출하고 호출결과 출격

        Test_Class tc = new Test_Class();
        System.out.println(tc.testMethod1());
    }
}