# Multiplication

_Spring 연습 프로젝트 #1 곱셈기_

## 3계층 구조   
- 클라이언트 계층 : 사용자 인터페이스 제공 계층 (=프런트엔드)
- 애플리케이션 계층 : 비즈니스 로직, 상호작용 인터페이스, 데이터 저젱 인터페이스 등을 포함 (=백엔드)
- 데이터 저장 계층 : 애플리케이션의 데이터를 보관하틑 계층. 데이터베이스, 파일 시스템 등
---   
-> 메인은 애플리케이션 계층. 애플리케이션 계층은 세 개의 레이어로 나뉨
- 비즈니스 레이어 : 도메인과 비즈니스 명세를 모델링한 클래스 존재. 애플리케이션의 두뇌 역할을 함. 일반적으로 객체와 비즈니스 로직을 제공하는 서비스의 조합으로 이루어짐. 해당 레이어를 도메인(개체)와 애플리케이션(서비스)로 나누기도 함.   
- 프레젠테이션 레이어 : 웹 클라이언트에 기능을 제공하는 컨트롤러 클래스가 프레젠테이션 레이어에 해당함. 이 컨트롤러에 REST API를 구현   
- 데이터 레이어 : 개체들을 데이터 스토리지나 데이터베이스에 보관. 보통 데이터 액세스 객체(Data Access Object) 또는 저장소 클래스를 포함. DAO는 데이터베이스 모델을 다루고 저장소 클래스는 도메인 데이터베이스 레이어로 변환하는 클래스   
