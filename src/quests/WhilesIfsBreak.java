/* quests
    - quests/WhilesIfsBreak.java
    - 입력 받은 점수를 등급 표시(90이상:A 80이상:B, 70이상:C, 나머진:F
    - 종료는 -1 
*/
package quests;

import java.util.Scanner;   // Scanner 클래스를 사용하기 위해 java.util 패키지를 임포트 

public class WhilesIfsBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean whileFlag = true;
        while (whileFlag) {
            System.out.print("점수를 입력하세요 : ");
            int score = scanner.nextInt();     // 사용자로부터 입력 받은 정수를 읽어들여 number 변수에 저장
    
            if (score >= 90){
                System.out.println("당신의 학점은 A입니다.");
            } else if (score >= 80){
                System.out.println("당신의 학점은 B입니다.");
            } else if (score >= 70){
                System.out.println("당신의 학점은 C입니다.");
            } else if ((0 < score) && (score < 70)){
                System.out.println("당신의 학점은 F입니다.");
            } else if (score == -1){
                break;
            }
        } scanner.close();
    }
}