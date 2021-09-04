# JavaBasic
자바 기초 공부하기

### 변수
* int, String 등의 자료형이 있다.
* 클래스를 선언하고, 그 클래스에 의거한 자료형 변수를 만들 수 있다.

### 주석
* /* (코드) */으로 블록 주석을 작성할 수 있다.
* (코드)//로 라인 주석을 작성할 수 있다.

### main 메소드
* main 메소드는 프로그램의 시작점을 의미한다.
<pre><code>public static void main(String[] args) {
(코드 내용)
}
</code></pre>
* 위와 같은 형태가 자주 이용된다.
* HelloWorld 예제에서 궁금한 점
    + javac으로 실행하면 println()의 내용이 출력되지 않는다.
    + java로 실행하면 println()의 내용이 출력된다.
    + 두 가지의 차이는?
        - javac은 클래스와 인터페이스 정보를 읽어서 class파일을 생성하는 역할을 수행한다.
        - java는 .java파일을 실행한다.
            - java 파일과 class파일의 관계는?
                - java 파일을 컴파일해서 class 파일을 만든다.
                - class 파일은 JVM 환경에서 읽을 수 있다.
                - class 파일은 java byte code로 이루어져 있다.
                    - java byte code는 JVM이 이용하는 명령어이다.
                    - C언어와 어셈블리어의 관계와 비슷하다.
    + 결론: javac 명령어는 클래스를 생성하므로 java 파일 안의 명령어를 직접 실행하지 않는다.

### 자료형
* 숫자
    - 정수형
        + int, long
        + 8진수는 0으로 시작, 16진수는 0x로 시작.
    - 실수형
        + float, double
    - 사칙연산
        + 다른 언어와 동일
* boolean
    - 참(true)이나 거짓(false)만 가능
    - python에서 bool의 True와 False와 동일

* String
    - 문자열을 표현하는 자료형
    - 객체이므로 new String으로 선언
    - 유용한 메소드
        + equals
            + == 연산자는 같은 객체인지 판별하기 때문에 문자열 값만 비교하고 싶을 때 유용하다.
        + indexOf
            + 주어진 문자열 값이 어디서부터 시작되는지 반환한다.
        + replaceAll
            + 대상 문자열 값을 주어진 문자열 값으로 변환한다.
        + substring
            + 문자열 중 원하는 부분을 추출한다
            + python의 문자열 슬라이싱과 같은 역할
        + toUpperCase, toLowerCase
            + 문자열을 모두 대문자(소문자)로 변경
            + python의 upper(), lower()와 같은 역할
            + case-sensitive 하지 않은 경우에 유용