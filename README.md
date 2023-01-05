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

## View 구성

### index
![indexPage](https://user-images.githubusercontent.com/106790381/209680496-5adff416-2b9d-4d91-a22f-0ab14d5bcc3c.jpg)

### join
![joinPage](https://user-images.githubusercontent.com/106790381/209680854-ff4e4c87-3cf0-43db-bc42-b52a0fd11e61.jpg)

### login
![loginPage](https://user-images.githubusercontent.com/106790381/209681055-510ca889-e931-4ea7-8f92-ed1330dad7c3.jpg)

### getBoardList
![getBoardListPage](https://user-images.githubusercontent.com/106790381/209681100-15b89967-a7cc-4e4b-b64c-c53b589c6581.jpg)

### getBoard
![getBoardPage](https://user-images.githubusercontent.com/106790381/209681138-be8a1573-958e-456c-bf10-41d57fbec738.jpg)

### insertBoard
![insertBoardPage](https://user-images.githubusercontent.com/106790381/209681351-51c844f2-ab10-4313-bbe2-b0e0d16782e7.jpg)

### memberInfo
![memberInfoPage](https://user-images.githubusercontent.com/106790381/209681402-02561e0a-4624-46be-a4ed-76941ea515ab.jpg)

### admin
![adminPage](https://user-images.githubusercontent.com/106790381/209681636-0e3abc90-28b2-47db-a912-36d137c70e8e.jpg)

### accessDenied
![accessDeniedPage](https://user-images.githubusercontent.com/106790381/209681676-2ae81c83-05df-418d-9e2f-b9d59d5205d1.jpg)

## 게시판 상세
[회원 가입, 정보 수정 및 회원 탈퇴](https://www.notion.so/3dd90be5986b4b728c5e2cd9dc8c3b25)
[댓글 출력 및 댓글 작성, 수정, 삭제](https://www.notion.so/3b56f4fdfc934bc8a179ef51b0b06d1f)
[Spring Security](https://www.notion.so/Spring-Security-a53c0076c41242cf9fb3e7c8b839e3f3)
[게시판 검색 및 페이징 처리](https://www.notion.so/3ed67f2140ca447e9360246d55166a35)
[조회수 증가](https://www.notion.so/c211e322434d41d4b6a274499bb96699)
[작성자만 수정, 삭제하기](https://www.notion.so/d79a3d59545c4b50aef6b7ed53759803)
[회원 가입 유효성 검사](https://www.notion.so/9ad23548468b40e6a35184445ad3c146)
[로그인 실패 알림](https://www.notion.so/842f6257c657488c956c54a4999f14e5)

## 마무리

수업에서 들었던 내용을 바탕으로 한 게시판 실습을 진행하던 중 기능의 부족함을 느껴 몇가지 기능을 추가해 보고싶다는 생각을 하게 되었다.
댓글 기능, 페이징 기능, 조회수 증가, 작성자만 수정/삭제 가능하도록 하는 기능 등 여러가지를 추가로 구현하기 위해 교제, 강의 블로그 등을 참고하면서 추가적인 공부를 해야 했기 때문에 개인적으로 조금 더 스프링부트를 깊게 이해할 수 있었다고 생각한다.
하지만 이해도를 높일 수 있었던 만큼 더 고민해 볼 수 있는 부분도 있음을 느꼈다.
첫번째로 교제에서는 Entity와 Repository를 통해서 CRUD기능을 구현하는 방식으로 학습했기 때문에 그 방식을 활용해 추가기능들을 구현했지만 구글링을 통해 DTO를 통해 레이어 간에 데이터를 전달하는 방식(DTO를 사용하는 이유는 domain 객체를 바로 접근하지 않기 위해서임. 테이블을 조작하기 위해 한단계더 거쳐가는 완충제역할)이 있음을 알게되었고 현재 구현된 기능들이 더 다양한 방식으로 개선될 수 있다는 생각을 하게 되었다. 때문에 항상 더 나은 방식은 없을지 생각하고 찾아보는 연습을 할 수 있었다.
두번째로 간단한 게시판이기 때문에 3개의 테이블로 구현할 수 있었기 때문에 DB구조를 설계해보는 경험이 부족함을 느꼈다. 차후 다양한 팀프로젝트가 계획되어 있기 때문에 이 부분에 대한 보강을 할 수 있을 것이다.
세번째로 필요한 기능을 검색할 때의 어려움이다. 내가 원하는 기능을 구글링을 통해 쉽게 구할 수 있지만 그 코드의 정확한 동작방식을 이해하기 위해서 많은 시간을 투자해야 했다. 블로그등을 주로 참고 했는데 작성자 각자의 생각과 주장이 달라 코드의 정확한 작동방식을 이해하기 어려웠던 상황이 있었다. 공식 문서를 활용하는 것에 빨리 익숙해 져야한다는 생각을 하게되었다.
이밖에도 OAuth 2.0을 활용한 소셜 로그인 구현이나 내가 작성한 코드의 리팩토링등 추가, 개선의 여지가 많기 때문에 지속적인 학습이 필요하다.

아직 많이 부족하지만 생각했던 만큼 서비스를 구현했다는 자신감과 흥미를 느낄 수 있었고 동시에 내가 부족했던 부분과 그것들을 어떻게 채워갈지에 대해 생각할 수 있는 값진 시간이었다. 
