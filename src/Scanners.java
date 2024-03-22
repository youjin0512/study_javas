// 외부 입력
import java.util.Scanner;
    // java 안에 util이라는 패키지 안에 Scanner라는 클래스
    // 컴퓨터에 있는 메모리의 자원이 아님. 내부자원(cpu, 메모리) 빼고는 모두 외부자원 -> 자원 반납(close)해줘야 함
    // class의 자원을 인스턴스화

public class Scanners {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);      // 인스턴스화
        System.out.print("intFirst : ");
        int intFirst = scanner.nextInt();
        System.out.print("intSecond : ");
        int intSecond = scanner.nextInt();

        scanner.close();  // 자원 반납
    }
}