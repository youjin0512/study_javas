// 두 정수를 받아서 합산하는 프로그램 작성
package quests;

import java.util.Scanner;

public class Additions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);      // 인스턴스화
        
        System.out.print("intFirst : ");
        int intFirst = scanner.nextInt();
        System.out.print("intSecond : ");
        int intSecond = scanner.nextInt();
        int intAdditions = intFirst + intSecond;
        System.out.print("Addition : "+intAdditions);

        scanner.close();  // 자원 반납
    }
}