// refer : https://www.w3schools.com/java/java_strings.asp

public class DataTypeStrings {
    public static void main(String[] args) {
        String strFirst = "Hello !"; // String : datatype, "Hello !" : 생성자 //
        String strSecond = new String("World !"); // 정식 방법 //
        // strFirst instanceof String      * instanceof : 디버깅 모드에서 제대로 할당해서 클래스 되었는지 확인할 때(=파이썬에서의 type)
        // true

        // strSecond instanceof String
        // true

        // strFirst.length()
        // 7

        // strSecond.length()
        // 7

        // strSecond.concat(strFirst)
        // "World !Hello !"

        // String strThird = strFirst.replaceAll("l", "R")
        // "HeRRo !"

        System.out.println("Hello World!");
       // return 0; 


    }
}