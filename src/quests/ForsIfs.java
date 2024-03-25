/* quests
    - 입력 받은 값을 2에 지수 연산하고, 4 배수일 때만 출력
    ex ) input number : 50
    0 : 2 ** 0 4 배수 아님        -> 확인용
    1 : 2 ** 1 4 배수 아님
    2 ** 2 = 4
    2 ** 3 = 8
    2 ** 4 = 16
*/
/* 
    for문 동작하기 위한 조건 : 반복 횟수, 종료 조건, 시작점
    statement 1 : 시작점
    statement 2 : 종료 조건
    statement 3 : 반복 횟수
    for (statement 1 ; statement 2 ; statement 3){
    }
*/
/*
    for문 돌려서 4의 배수 찾기
    50까지 세고 4의 배수일 때만 출력, 아닐때는 pass
    50까지 숫자 셌을 때 빠져나오기
    값 input으로 입력 받아야 함
*/
package quests;

import java.util.Scanner;

public class ForsIfs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("input number : ");
        int number = scanner.nextInt();
        
        for (int count = 0; count <= number; count++) {
            int result = (int)Math.pow(2, count);       /* Math.pow(2, count) : 2의 count 제곱 */
            if (result % 4 == 0) {
                System.out.println("4의 배수 출력 = 2 ** " + count + " = " + result);
            } else {
                System.out.println(count + " = 2 ** " + count + " , 4의 배수 아님"); // 확인용 출력
            }
            
            if (result > number) break; // 입력 받은 number 보다 크면 반복문 종료
        }

        scanner.close();  // 자원 반납
    }
}