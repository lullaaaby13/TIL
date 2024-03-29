# CHAPTER6. STATE PATTERN(스테이트 패턴)

> 스테이트 패턴은 상태에 따라 동일한 작업이 다른 방식으로 실행될 때, 해당 상태가 작업을 수행하도록 위임하는 디자인 패턴이다.


### 문제점 1
> 형광등에 새로운 상태를 추가할 때, 가령 형광등에 '취침등'상태를 추가하려면?

* '켜짐' 상태에서 '켜짐버튼'을 누르면 '취침등' 상태로 변경된다.
* '취침등'상태에서 '켜짐버튼'을 누르면 '켜짐' 상태로 변경된다.
* '꺼짐' 버튼을 누르면 '꺼짐' 상태로 변경된다.

### 문제점 1에 대한 해결책
> 전략 패턴에서와 같이 무엇이 변하는가를 찾아서 캡슐화 하는 것이 매우 중요하다.

* '상태'를 클래스로 분리해 캡슐화 한다.
* '상태'에 의존적인 행위들도 '상태'클래스에 같이 두어 특정 상태에 따른 행위를 구현하도록 한다.

### 해결책에 대한 설명
* Light 클래스의 state 변수를 통해 현재 시스템의 상태 객체를 참조한다.
* 상태에 따른 행위를 수행하려면 state 변수가 참조하는 상태 객체에 작업을 위임해야 한다.
    * On / Off / Sleeping 클래스에 구체적인 작업을 위임했다.
* Light 클래스 코드 어디에도 구체적인 상태를 나타내는 코드는 남아 있지 않다. 즉, Light 클래스는 시스템이 어떤 상태에 있는지와 무관하하다는 의미다.
* On / Off / Sleeping 클래스는 단 하나의 객체만 존재할 필요가 있으므로 싱글톤으로 구성했다.
    
