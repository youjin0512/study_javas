// refer : https://www.w3schools.com/java/java_for_loop.asp
public class LoopsFors {
    public static void main(String[] args){
        /* 
            for문 동작하기 위한 조건 : 반복 횟수, 종료 조건, 시작점
            statement 1 : 시작점
            statement 2 : 종료 조건
            statement 3 : 반복 횟수
         for (statement 1 ; statement 2 ; statement 3){
         }
         */

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
        System.out.println("Hello Main !");
    }
}