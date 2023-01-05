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
* [회원 가입, 정보 수정 및 회원 탈퇴](https://www.notion.so/3dd90be5986b4b728c5e2cd9dc8c3b25)
* [댓글 출력 및 댓글 작성, 수정, 삭제](https://www.notion.so/3b56f4fdfc934bc8a179ef51b0b06d1f)
* [Spring Security](https://www.notion.so/Spring-Security-a53c0076c41242cf9fb3e7c8b839e3f3)
* [게시판 검색 및 페이징 처리](https://www.notion.so/3ed67f2140ca447e9360246d55166a35)
* [조회수 증가](https://www.notion.so/c211e322434d41d4b6a274499bb96699)
* [작성자만 수정, 삭제하기](https://www.notion.so/d79a3d59545c4b50aef6b7ed53759803)
* [회원 가입 유효성 검사](https://www.notion.so/9ad23548468b40e6a35184445ad3c146)
* [로그인 실패 알림](https://www.notion.so/842f6257c657488c956c54a4999f14e5)

