# 프로젝트 : Ref - 패스트캠퍼스 fastcampus-board-project

* SpringBoot 의 간단하고 보편적인 기능들을 활용하여 게시판 프로젝트 구현
* Mock, MockMvc 를 활용한 TDD (테스트 주도 개발) 방식 개발
* of(), toEntity(), toDto() 등 팩토리 메소드 활용한 매핑 전략 활용
* GitKraken 을 통한 Git Flow Feature Branch 전략으로 형상 관리
* Heroku 를 통해 배포

## 주요 기능

* JPA 의 Page, Pageable 를 활용 정렬, 검색, 페이징 구현
* Querydsl 을 활용하여 JPA Repository 를 커스터마이징 한 키워드 검색 및 해시태그 검색 기능 구현
* SpringSecurity 를 적용한 인증/인가 및 패스워드 암호화 구현
* 그 외 게시판 기본 CRUD 기능과 댓글 등록, 삭제 기능 구현

## 개발 환경

* window 10
* Intellij IDEA Ultimate 2022.3.2
* Java 17
* Gradle 8.2.1
* Spring Boot 2.7.14

## 기술 세부 스택

Spring Boot

* Spring Boot Actuator
* Spring Web
* Spring Data JPA
* Rest Repositories
* Rest Repositories HAL Explorer
* Thymeleaf
* Spring Security
* H2 Database
* MySQL Driver
* Lombok
* Spring Boot DevTools
* Spring Configuration Processor

그 외

* QueryDSL 5.0.0
* Bootstrap 5.2.3
* Heroku

## 데모 페이지 (프로젝트 배포)
※ 최초 슬립 상태에서 페이지 진입까지 15초 이상 소요되므로 기다려주세요

https://project-board-aebong-98d476ce6f08.herokuapp.com/

## Reference

* 유즈케이스 다이어그램 : document 폴더 참고
* ERD : document 폴더 참고
* API Endpoint 구글 시트 : https://docs.google.com/spreadsheets/d/1xSqANLi5EYdPLw0DW1UGPFS6Ja8ck5PmuoAfKw6EDfk/edit?usp=sharing
