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
4. 개발환경 : Spring Boot, JPA, Spring Security, Thymeleaf, H2 database, Git

## 게시판 전체 구조
![게시판 구조](https://user-images.githubusercontent.com/106790381/209680321-1d40a04b-2049-4cac-9489-6bb41f18ce99.jpg)

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
* Entity - Board, Member, Comment, Role
* 연관관계 매핑 : Board - Member, Board - Comment, Member - Comment 양방향 연관관계 생성
* Repository - MemberRepository, BoardRepository, CommentRepository 구현
* Controller 제작 및 Service interface 의존성 주입
* Service Interface 및  ServiceImpl class 구현, Repository 의존성 주입으로 CRUD 기능 구현
  * 회원가입, 로그인, 회원정보 수정, 회원 탈퇴
  * 게시판 리스트 생성, 새로운 게시물 작성, 수정, 삭제
  * 댓글 리스트 작성, 새 댓글 작성, 수정, 삭제
* Thymeleaf를 이용한 Presentation Layer 구현
* Spring Security 커스터마이징 및 시큐리티 화면 개발, 사용자 인증 및 비밀번호 암호화, 사용자 정보 출력
* 다이나믹 쿼리를 사용한 검색기능, search 전용 class 생성, Repository에 검색을 위한 동적 쿼리 추가
* Pageable 활용한 게시물 페이징 기능 구현, getBoardList에 페이징 화면 구성
* 게시글 조회수 증가
* 해당 게시물, 댓글 작성자만 수정, 삭제 가능하도록 만들기
* 회원가입시 아이디 중복 체크
* Thymeleaf로 구성된 Presentation Layer에 부트스트랩 적용

## 마무리

### 보완 사항
* 아이디, 페스워드 유효성 검사
* 각종 오류들 alert메세지 띄우기(로그인 비밀번호 오류, 회원가입시 중복된 아이디가 있을 경우 등등)
* 소셜 로그인 기능 구현
* 댓글 리스트 페이징 기능 구현
* 이전, 다음 페이지/첫페이지, 마지막 페이지 기능

### 후기
수업에서 들었던 내용을 바탕으로 한 게시판 생성 실습을 진행하던 중 기능의 부족함을 느껴 몇가지 기능을 추가해 보고싶다는 생각을 하게 되었다.
댓글 기능, 페이징 기능, 조회수 증가, 작성자만 수정/삭제 가능하도록 하는 기능 등을 추가로 구현해보면서 개인적으로 조금 더 스프링부트를 깊게 이해할 수 있었다고 생각한다.
또한 교제, 강의 블로그 등을 참고하며 이해도를 높일 수 있었던 만큼 더 고민해 볼 수 있는 부분도 있음을 느꼈다.
예를 들어 교제에서는 Entity와 Repository를 통해서 CRUD기능을 구현하는 방식으로 학습했기 때문에 그 방식을 활용해 추가기능들을 구현했지만 구글링을 통해 DTO를 통해 레이어 간에
데이터를 전달하는 방식(DTO를 사용하는 이유는, 자바 domain 객체를 바로 접근하지 않기 위해서임. 테이블을 조작하기 위해 한단계더 거쳐가는 완충제역할)이 있음을 알게되었고
내가 만든 로직이 더 다양한 방식으로 개선될 수 있다는 생각을 하게 되었다. 때문에 항상 더 나은 방식은 없을지 생각하고 찾아보는 연습을 할 수 있었다.

이번 프로젝트는 이미 쌓여있는 돌탑에 작은 돌맹이를 올려놓은것 뿐일수 있지만 그 돌맹이를 더 잘, 효율적으로 쌓아 올릴 수 있는 방법을 연습할 수 있었다는 점에서 의미가 있다고 생각한다.
추가적인 프로젝트를 처음부터 진행하여 지금 느꼈던 부족한 점들을 개선하고 발전하는 기회를 가질 것이다.
