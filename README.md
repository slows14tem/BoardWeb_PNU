# BoardWeb_PNU

## 소개
전반적인 웹의 기본 소양이 되는 CRUD 기능 구현 훈련을 위한 게시판 생성 프로젝트이다.
본 프로젝트는 루비페이퍼 출판사의 '스프링 부트 퀵스타트 - 누구나 끝까지 따라 할 수 있는' 의 Chapter8 게시판을 기본으로 한다.
교제의 내용에 몇가지 사항들을 추가하여 Spring Boot 와  JPA등에 대한 이해도를 높이려고 한다.

## 개요
1. 명칭: BoardWeb
2. 주요기능 
	* 게시판 게시물 목록 생성, 새 개시물 등록, 수정, 삭제 및 페이징 처리
	* 사용자 로그인, 유효성 검사 및 중복 검사
	* 개시물의 댓글 목록 생성, 새 댓글 등록, 수정, 삭제
3. 개발 언어 JAVA 17
4. 개발환경 : Spring Boot, JPA, Spring Security, Thymeleaf, BootStrap, H2 database, Git

## 게시판 전체 구조
![게시판 구조](https://user-images.githubusercontent.com/106790381/210834827-f52872f6-088a-4749-abcb-5e781a9fc067.jpg)

## DB 구조
![dbTable](https://user-images.githubusercontent.com/106790381/210834033-e09d41f5-1455-4d04-b320-b5eb4f40b30d.png)


## 화면 구성

### 1. index
![indexPage](https://user-images.githubusercontent.com/106790381/209680496-5adff416-2b9d-4d91-a22f-0ab14d5bcc3c.jpg)

### 2. join
![joinPage](https://user-images.githubusercontent.com/106790381/209680854-ff4e4c87-3cf0-43db-bc42-b52a0fd11e61.jpg)

### 3. login
![loginPage](https://user-images.githubusercontent.com/106790381/209681055-510ca889-e931-4ea7-8f92-ed1330dad7c3.jpg)

### 4. getBoardList
![getBoardListPage](https://user-images.githubusercontent.com/106790381/209681100-15b89967-a7cc-4e4b-b64c-c53b589c6581.jpg)

### 5. getBoard
![getBoardPage](https://user-images.githubusercontent.com/106790381/209681138-be8a1573-958e-456c-bf10-41d57fbec738.jpg)

### 6. insertBoard
![insertBoardPage](https://user-images.githubusercontent.com/106790381/209681351-51c844f2-ab10-4313-bbe2-b0e0d16782e7.jpg)

### 7. memberInfo
![memberInfoPage](https://user-images.githubusercontent.com/106790381/209681402-02561e0a-4624-46be-a4ed-76941ea515ab.jpg)

### 8. admin
![adminPage](https://user-images.githubusercontent.com/106790381/209681636-0e3abc90-28b2-47db-a912-36d137c70e8e.jpg)

### 9. accessDenied
![accessDeniedPage](https://user-images.githubusercontent.com/106790381/209681676-2ae81c83-05df-418d-9e2f-b9d59d5205d1.jpg)

## 배운점
1. Spring Data JPA를 활용하여 기본적인 CRUD를 구현을 연습해 볼 수 있었다.
2. Spring Security를 구현하여 인증, 인가, 세션 유지, 암호화등을 구현해 볼 수 있었다.
3. Validation 구현을 통해 회원가입, 로그인 상황에서 유효성 검사를 구현해 볼 수 있었다.
4. 여러가지 기능들의 비지니스 로직을 구현해 보면서 spring boot의 전반적인 구성에 대해서 이해할 수 있었다.
5. Entity의 연관관계 맵핑을 구현해보고 데이터베이스의 테이블의 연관관계와 함께 이해할 수 있었다.

## 개선 사항
1. DTO를 사용하는 방법에 대해서 공부하고 적용해볼 필요가 있다.
2. Thymleaf를 사용해서 개발하기 편했지만 이후에 사용할 가능성이 없어보인다. React등 다른 방식의 프론트앤드 개발이 필요해 보인다.
3. 전반적인 개발은 완료되었지만 배포하지 않아 다른 사람이 사용해 볼 수 없다. 프로젝트를 배포해 볼 필요성이 있어보인다.
