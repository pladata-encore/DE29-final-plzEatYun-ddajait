# IT 자격증 스터디 플랫폼 : DDAJA-IT

## 📆 프로젝트 기간 

| 날짜 | 업무 내용 |
| --- | --- |
| 2024.04.08 ~ 2024.04.22 | 프로젝트 기획, 주제 선정, 자료 조사 |
| 2024.04.22 ~ 2024.04.30 | 화면 페이지 설계 및 기능 명세서 작성 |
| 2024.05.01 ~ 2024.05.14 | 데이터 수집 및 전처리 (Airflow를 사용한 워크플로 자동화) |
| 2024.05.15 ~ 2024.06.15 | 프론트앤드 백엔드 구축 및 API 연동, AWS 인프라 구축 |
| 2024.06.15 ~ 2024.06.20 | CI/CD (Spring Boot, React) |
| 2024.06.20 ~ 2024.06.24 | 문서 작업 및 발표 |

</br></br>

## 🕺 구성원

| 구성원 | 깃허브 주소 | 분담 역할 |
| --- | --- | --- |
| 장윤영 | https://github.com/Jyundev | CBT 자격증 시험 데이터 수집<br>SpringBoot RESTful API 개발 <br>ERD 및 API 설계<br>Swagger 기반  REST API 문서 자동화<br>프로젝트 문서화 작업|
| 조하민 | https://github.com/chohaming |AWS 인프라 설계 및 구축<br>airflow 데이터 수집 자동화<br>Git Actions 기반 프론트엔드 배포|
| 김도한 | https://github.com/rlaehgks115 |React 기반 프론트엔드<br>아키텍처 설계 및 개발<br>S3 기반 백엔드 배포|
| 김백운 | https://github.com/kimbw0615 | 자격증 접수일정,  시험 데이터 수집<br>자격증 시험 후기 데이터 수집 및 분석<br>데이터 정제 및 난이도 분석 모델링|

</br></br>


## Environment

<div align="center">
<img width="957" alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/b0a6141c-650b-483c-82db-b26ad88298cf" style="width: 75%; margin: 5px;">
</div>

- Window11, MacOS, Linux
- JDK 17
- Spring Boot : 3.2.5
- React : 18.2.0
- Docker 25.0.3
- Github Actions
- nginx : 1.27.0
- Mode-js : 20.12.2
- Airflow : 2.9.1
- AWS EC2, RDS, S3

## Contents Table

- [프로젝트 개요](#프로젝트-개요)
- [서비스 기능](#서비스-기능)
- [아키텍처](#아키텍처)
- [ERD](#ERD)
- [Spring REST Docs](#Spring-REST-Docs)


## 프로젝트 개요

<div align="center">
<img width="1165" alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/e39135c5-fb6d-4cf5-a6a1-1ace04fd1f0b" style="width: 75%; margin: 5px;">
</div>

</br></br>

## 서비스 기능
- 1차 목표로 총 10개의 IT 자격증 기준 프로젝트 진행했습니다.
- 리눅스 마스터, 정보처리기사,  정보보안기사, 네트워크 관리사, 정보처리산업기사, ADsP,  빅데이터분석기사 ,SQLD

<div align="center">
<img width="1143" alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/d5c31af4-d73b-4bca-8270-f9c974d1af6d"style="width: 75%; margin: 5px;">
</div>



</br></br>

## 아키텍처
## Frontend-Backend

<div align="center">
<img width="983" alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/2fa3238f-4ee6-49e0-b076-f203d26e0977"style="width: 75%; margin: 5px;">
</div>

## 화면 설계
### Menu Tree

<div align="center">
<img width="918" alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/da1ba34f-38d0-46c6-96a0-0b37d2e2797b" style="width: 75%; margin: 5px;">
</div>

### Flow Chart

<div align="center">
<img  alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/2152147e-7272-4786-9f6e-a423ea74c12e" style="width: 60%; margin: 5px;">
</div>

## Data ETL

<div align="center">
<img width="1294" alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/c7d8abc9-d1a7-4dd8-9c1d-a4c65f3480e3" style="width: 75%; margin: 5px;">
</div>


## 데이터 설명

<div align="center">
<img width="1207" alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/0252fc1c-614b-482b-9ed1-9491d9e11ff4" style="width: 75%; margin: 5px;">
</div>

### 자격증별 시험일정 데이터 

<div align="center">
<img width="1177" alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/747b1184-e931-4e1c-b47d-dbe39edf5cc5"style="width: 75%; margin: 5px;">
</div>

### 자격증별 시험 정보 데이터 

<div align="center">
<img width="1123" alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/a369261f-0aac-4b0d-9e18-c4336fbe84da"style="width: 75%; margin: 5px;">
</div>

### 자격증 시험 후기 데이터 
<div align="center">
<img width="1119" alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/88a1bc03-f537-48fb-8efc-7fc1ab0de5b1"style="width: 75%; margin: 5px;">
</div>


## ERD 

![ERD](/image/ERD-DDAJAIT.png)


## Spring REST Docs
###  Swagger - springdoc : 2.5.0
http://52.78.44.47/swagger-ui/index.html#/

<div align="center">
<img alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/40aeb83b-bd85-419d-8a2e-be3e7ca48d80"style="width: 100%; margin: 5px;">
</div>

## JWT 인증방식 
<div align="center">
<img width="816" alt="image" src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/9d170fe3-8e34-449c-893d-0feb4dae59a6"style="width: 70%; margin: 5px;">
</div>




