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

* StringBuffer
    - mutable (변경 가능)
         String 클래스는 immutable
    - 다중 쓰레드 사용에 안전
    - 기본적으로 16자의 버퍼를 가지고 있다.
    - 유용한 메소드
        + append
           + 문자열을 추가해 나갈 수 있다.
           + length()위치에 insert하는 것과 동일한 효과.
        + insert
           + 원하는 위치에 원하는 문자열을 추가
        + length
           + StringBuffer의 길이 반환
        + delete
           + 원하는 만큼 문자열 삭제
        + substring
           + String의 substring과 사용법 동일

* Array
    - 같은 종류의 자료형을 순서대로 배열한 자료형
    - 배열의 길이는 고정
        + 더 긴 배열이 필요할 경우, 새로운 배열을 선언하고 데이터를 옯겨야 한다.
    - index를 이용하여 값에 접근
    - 배열의 길이
        + length 속성을 이용

* List
    - List는 자료형이 아니고 인터페이스
        + 인터페이스는 실질적인 내용이 아니라 필요한 입출력의 내용만 선언한 것
    - ArrayList는 List Interface의 implementation
    - ArrayList의 유용한 메소드
        + add
        + get
        + size
        + contains
        + remove

* Generics
    - 클래스나 인터페이스를 파라미터화 하는 것이다.
    - 더 명확한 자료형 선언 가능
    - 형변환 과정 생략 가능

* Map
    - python의 dict와 유사하다.
    - key와 value의 쌍으로 구성

### 제어문

* if
    - 조건을 판단하여 실행하거나 실행하지 않는다.
    - if, else if, else로 구분

* switch, case
    - switch 뒤에 나오는 변수에 따라 case 실행
    - break; 가 없으면 그 뒤에 있는 모든 case 실행

* while
    - 조건문이 참인 동안 계속 실행
    - break 로 탈출 가능
    - continue 로 조건문으로 다시 보내기 가능

* for
    - for(초기치, 조건문, 증감)
    - while처럼 break와 continue 사용 가능
    - 실행 매커니즘 파악하기
        - 실행할 때, 초기치로 변수 할당
        - 그 후 조건문과 비교하고 주어진 연산 실행
        - 증감문이 여러 개 일 때, 순서대로 실행
    - 향상된 for 문
        + for each문이라고도 한다.
        + for(변수 : 반복 가능한 객체){}
        + 파이썬의 for in 문과 비슷하게 사용 가능

### 객체지향

* 클래스와 인스턴스
    - 클래스는 현실의 개체를 표현하기 위해 동작과 값을 표함하고 있는 하나의 데이터 셋이다.
    - 인스턴스는 클래스를 기반으로 만들어진 데이터이다.
    - 클래스는 객체 변수와 메소드를 갖는다.
    - python과 같은 언어에서는 함수와 메소드가 둘 다 존재한다.
    - java에서는 메소드만 존재한다.

* call by value, call by reference
    - 값을 전달 받은 경우에는 변수의 값을 바꿀 수 없다. (call by value)
    - 변수가 아니라 변수의 값을 전달 받은 경우이다.
    - 객체를 전달 받은 경우에는 변수의 값을 바꿀 수 있다. (call by reference)
    - 변수의 위치를 전달 받은 경우이다.

* 상속
    - 자식 클래스가 부모 클래스의 변수와 메소드를 사용할 수 있는 것을 의미한다.
    - python에서는 클래스 뒤에 (부모 클래스)를 선언해서 사용한다.
    - java에서는 extends라는 예약어를 사용한다.
    - IS-A 관계
        + 자식 클래스가 부모 클래스로 표현 가능할 때 IS-A 관계라고 한다.
        + 이 때 자식 클래스는 부모 클래스의 자료형인 것처럼 사용할 수 있다.
    - 메소드 오버라이딩, 메소드 오버로딩
        + 부모 클래스가 가지고 있는 메소드를 새롭게 정의할 때 메소드 오버라이딩이라고 한다.
        + 부모 클래스가 가지고 있는 메소드와 이름은 같지만 다른 파라미터를 받아 새롭게 정의할 때 메소드 오버로딩이라고 한다.
    - java는 다중 상속을 지원하지 않는다.

* 생성자
    - 인스턴스를 만들 때 조건을 입력받을 수 있도록 생성자를 작성할 수 있다.
    - 생성 조건에 따라 여러 경우를 감안할 수 있도록 생성자 오버로딩이 가능하다.
        + ex) 아무것도 입력받지 않은 경우, 정수 하나만 입력받은 경우 등

* 인터페이스
    - 인터페이스는 편리함을 위해 만든 입출력에 대한 규칙이다.
    - implements 예약어를 사용한다.
    - 전체적인 뼈대를 인터페이스에서 작성한 후, 구체적인 메소드는 implemented된 클래스에서 정의한다.
    - java의 클래스는 여러 인터페이스를 implements할 수 있다.

* 다형성
    - 하나의 객체가 여러 개의 자료형 타입을 가질 수 있는 것을 다형성이라고 한다.
    - 하나의 객체이지만 메소드에 따라서 다르게 응답할 수 있다.
    - 인터페이스는 extends 예약어를 사용해 여러 인터페이스를 동시에 상속 가능하다.

### 콘솔 입출력

* Scanner 사용하지 않는 경우
    - InputStream, InputStreamReader, BufferedReader를 차례로 인자로 받으면서 사용
    - InputStream은 byte, InputStreamReader는 char, BufferedReader는 String을 다룬다.

* Scanner 사용
    - Scanner 인스턴스 선언한 후 사용
    - next()은 단어 하나, nextLine()은 라인, nextInt()는 정수 반환

### 파일 입출력

* FileOutputStream 클래스 이용
    - byte 단위로 쓰기
    - write() 메소드 이용하여 쓰기 가능

* FileWriter 클래스 이용
    - String으로 쓰기
    - write() 메소드 이용하여 쓰기 가능

* PrintWriter 클래스 이용
    - String으로 쓰기
    - println() 메소드 이용 가능(줄바꿈 포함)