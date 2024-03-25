public class Ifs {
    public static void main(String[] args){
        // 기본 구문
        // if (condition) {
        // } else if (condition) {
        // } else {
        // }

        /*
        예제 : 시간에 따른 영어 인사
        Good morning : 6 ~ 11
        Good day : 12 ~ 17
        Good evening : 18 ~ 23 
        */
        int hour = 11;   // 첫 번째 구문
        if (hour <= 11) { // Good morning : 6 ~ 11
            System.out.println("Good morning !");            
        } else if (hour <= 17) { // Good day : 12 ~ 17
            System.out.println("Good day !");
        } else { // Good evening : 18 ~ 23
            System.out.println("Good evening !");
        }
        System.out.println("Hello Main !");


        /*
        예제 : 시간에 따른 영어 인사
        Good morning : 6 ~ 11
        Good day : 12 ~ 17
        Good evening : 18 ~ 23 
        */
        // error : Duplicate local variable hour Java(Main 안에 같은 위치의 변수가 2개일 때), 해결 Datatype 정리
        // int hour = 11;  ** 첫 번째 구문
        hour = 24;         // ** 두 번째 구문  
        if ((hour >= 6) && (hour <= 11)) { // Good morning : 6 ~ 11
            System.out.println("Good morning !");            
        } else if ((hour >= 12) && (hour <= 17)) { // Good day : 12 ~ 17
            System.out.println("Good day !");
        } else if ((hour >= 18) && (hour <= 23)) { // Good day : 18 ~ 23
            System.out.println("Good evening !");
        } else {
            System.out.println("Don't know !");
        }
        System.out.println("Hello Main !");
        // (hour >= 6) && (hour <= 11)
        // false
        // (hour >= 6)
        // true
        // (hour <= 11)
        // false
    }
}