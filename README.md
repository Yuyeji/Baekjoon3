# Baekjoon3
## String, StringBuffer, StringBuilder 차이
### 1. String
- 불변
- String 객체는 한번 생성되면 할당된 메모리 공간이 변하지 않음
- '+' 연산자 또는 concat 메서드를 통해 기존에 생성된 String 클래스 객체 문자열에 다른 문자열을 붙여도 기존 문자열에 새로운 문자열을 붙이는 것이 아니라,
새로운 String 객체를 만든 후, 새 String 객체에 연결된 문자열을 저장하고, 그 객체를 참조
- 문자열 연산이 많은 경우, 그 성능이 좋지 않음


### 2. StringBuffer & StringBuilder
기존의 버퍼 크기를 늘리며 유연하게 동작합니다. StringBuffer와 StringBuilder 클래스가 제공하는 메서드는 서로 동일합니다.
두 클래스의 차이점은? 동기화 여부
- StringBuffer는 각 메서드별로 Synchronized Keyword가 존재하여, 멀티스레드 환경에서도 동기화를 지원.
- 반면, StringBuilder는 동기화를 보장하지 않음.
#### ex)
StringBuilder builder = new StringBuilder();

builder.append("ASDF");
### 결론
String은 짧은 문자열을 더할 경우 사용합니다.

StringBuffer는 스레드에 안전한 프로그램이 필요할 때나, 개발 중인 시스템의 부분이 스레드에 안전한지 모를 경우 사용하면 좋습니다.

StringBuilder는 스레드에 안전한지 여부가 전혀 관계 없는 프로그램을 개발할 때 사용하면 좋습니다.
