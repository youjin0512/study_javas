// refer : https://www.w3schools.com/java/java_for_loop.asp

import java.util.ArrayList;

public class LoopsFors {
    public static void main(String[] args){
        ArrayList<String> listFirst = new ArrayList<String>();    // <> : array 안에 들어가는 실제 값의 타입 적어줌 -> cast
        // 값 넣기
        listFirst.add("Volvo");
        listFirst.add("BMW");
        listFirst.add("Ford");
        
        /* 
            for문 동작하기 위한 조건 : 반복 횟수, 종료 조건, 시작점
            statement 1 : 시작점
            statement 2 : 종료 조건
            statement 3 : 반복 횟수
        for (statement 1 ; statement 2 ; statement 3){
         }
         */
        for (int i=0; i < listFirst.size(); i ++ ){
            System.out.println("for count " + listFirst.get(i));
        }

        // for (type variableName : arrayName) {
        // code block to be executed
        // }
        for(String str:listFirst){
            System.out.println("for each " + str);
        }

        /* 
        예제 : 1부터 5까지 1씩 증가하며 출력
         */
        /*아래 한줄을 풀어쓸 경우
        int count = 1 ;
        boolean count <= 5 ;
        count = count + 1 ;
        */
        // for (int count = 1 ; count <= 5 ; count + 1){
        for (int count = 1 ; count <= 5 ; count ++){
            System.out.println("For count : "+count);
        }

        // for (type variableName : arrayName) {
        // code block to be executed
        // }


        System.out.println("Hello Main !");
    }
}