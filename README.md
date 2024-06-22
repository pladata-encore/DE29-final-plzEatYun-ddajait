# PROJECT : IT자격증 챌린지 웹사이트 

</br></br>

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
| 장윤영 | https://github.com/Jyundev | SpringBoot Rest API 개발|
| 조하민 | https://github.com/chohaming |AWS 인프라 구축|
| 김도한 | https://github.com/rlaehgks115 |React 프론트엔드 개발|
| 김백운 | https://github.com/kimbw0615 | 데이터 수집 및 전처리, 모델링|

</br></br>


## Environment

<div align="center">
  <img src="https://github-production-user-asset-6210df.s3.amazonaws.com/83933219/341933055-6b85c800-e28c-41c2-ab80-e112e6eb46dd.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240622%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240622T043650Z&X-Amz-Expires=300&X-Amz-Signature=b2a9bb8d4cc0267811649c84d562af4db9a6aab0455f61fa0363bf74ca769fad&X-Amz-SignedHeaders=host&actor_id=83933219&key_id=0&repo_id=811617170" alt="Alt text" style="width: 75%; margin: 5px;">
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
  <img src="https://github.com/pladata-encore/DE29-final-plzEatYun-ddajait/assets/83933219/3aa5391c-6dd4-4590-8f5a-699eae45d2a2" alt="Alt text" style="width: 75%; margin: 5px;">
</div>


</br></br>

## 서비스 기능

<div align="center">
  <img src="https://github-production-user-asset-6210df.s3.amazonaws.com/83933219/341932154-1f2d3a88-ca72-4482-8b54-f41342b11246.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240622%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240622T043506Z&X-Amz-Expires=300&X-Amz-Signature=bfeaf88d8b44356e2f17f646084794b2639acd54f8d7b01929f59e3cf43e83c8&X-Amz-SignedHeaders=host&actor_id=83933219&key_id=0&repo_id=811617170" alt="Alt text" style="width: 75%; margin: 5px;">
</div>

</br></br>

## 아키텍처
## Frontend-Backend

<div align="center">
  <img src="https://github-production-user-asset-6210df.s3.amazonaws.com/83933219/341933705-28c138aa-7065-4f79-9b4d-088a75f08439.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240622%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240622T043853Z&X-Amz-Expires=300&X-Amz-Signature=2f0463b97f4117b1c2cfb62049238294974125690feb80f6592a772a59f0134e&X-Amz-SignedHeaders=host&actor_id=83933219&key_id=0&repo_id=811617170" alt="Alt text" style="width: 75%; margin: 5px;">
</div>


## Data ETL

<div align="center">
  <img src="https://github-production-user-asset-6210df.s3.amazonaws.com/83933219/341933906-ad07d36c-4f4c-4a6b-9cef-8c883bbe9162.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240622%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240622T044035Z&X-Amz-Expires=300&X-Amz-Signature=97052a9a655218b2e1f9ba1f0c9f7c9b464c88a5644012c05f80f196c335758a&X-Amz-SignedHeaders=host&actor_id=83933219&key_id=0&repo_id=811617170" alt="Alt text" style="width: 75%; margin: 5px;">
</div>

<div align="center">
<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/83933219/341934323-6ebe4fb2-10b8-4c93-9809-1c7a99124ad3.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240622%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240622T044610Z&X-Amz-Expires=300&X-Amz-Signature=f97783a460cd9678049829f4de2bd121b3d6891735db8c198bd7609d65f257b0&X-Amz-SignedHeaders=host&actor_id=83933219&key_id=0&repo_id=811617170" alt="Alt text" style="width: 75%; margin: 5px;">
</div>

## ERD 

![ERD](/image/ERD-DDAJAIT.png)


## Spring REST Docs
###  Swagger - springdoc : 2.5.0
http://52.78.44.47/swagger-ui/index.html#/

![swagger](/image/swagger.png)

