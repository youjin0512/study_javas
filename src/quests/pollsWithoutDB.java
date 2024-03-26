/* quests
    - quests/pollsWithoutDB.java
    - 영화 설문 3 문항 답하는 설문 구현
    ex) 1. 인터스텔라 선호도
        1) 좋음 2) 중간 3) 나쁨
        답하기 : 1
        2. 해리 포터 선호도
        1) 좋음 2) 중간 3) 나쁨
        답하기 : 3
        3. 라라랜드 선호
        1) 좋음 2) 중간 3) 나쁨
        답하기 : 1
    ...
    답한 내용 출력 : 1,3,1
    답한 내용 받을 때 
    - scanner.nextLine();   <-- string으로 받기  ==> 숫자를 저장해도 문자로 저장됨.

    질문 리스트 1개
    답항 리스트 1개

    arrayList 3개

    *cast 사용
 */
package quests;

import java.util.Scanner;   // Scanner 클래스를 사용하기 위해 java.util 패키지를 임포트
import java.util.ArrayList;
import java.util.List;

public class pollsWithoutDB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner 객체 생성
        List<String> movies = new ArrayList<String>();  // 영화 목록을 담을 ArrayList 생성
        List<String> questions = new ArrayList<String>();  // 질문 목록을 담을 ArrayList 생성
        List<String> answers = new ArrayList<String>();  // 사용자의 답변을 담을 ArrayList 생성
        
        // 질문 목록에 질문 추가
        movies.add("1.인터스텔라 선호도");
        movies.add("2.해리 포터 선호도");
        movies.add("3.라라랜드 선호도");

        // 각 질문에 대해 사용자로부터 선호도 입력받기
        questions.add()
        for (String question : questions) {
            System.out.println(question);
            System.out.println("1) 좋음 2) 중간 3) 나쁨");
            System.out.println("답하기 : ");
            String answer = scanner.nextLine();  // 사용자로부터 입력 받기
            questions.add(answer);  // 입력받은 답변을 ArrayList에 추가
        }

        // 답한 내용 출력
        System.out.println("답한 내용 출력 : ");
        for (int i = 0; i < answer.size(); i++){
            System.out.println(answers.get(i));  // ArrayList에서 답변 가져와서 출력
            if (i < answers.size() -1){
                System.out.print(",")
            }
        }
       scanner.close();  // 자원 반납(리소스 누수를 방지하기 위해 더 이상 사용하지 않을 때는 Scanner 객체를 닫아야함)
    }
}
