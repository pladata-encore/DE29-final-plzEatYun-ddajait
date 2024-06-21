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
| 장윤영 | https://github.com/Jyundev | SpringBoot RestFul API 개발|
| 조하민 | https://github.com/chohaming |AWS 인프라 구축|
| 김도한 | https://github.com/rlaehgks115 |React 프론트엔드 개발|
| 김백운 | https://github.com/kimbw0615 | 데이터 수집 및 전처리, 모델링|

</br></br>


## Environment
- Window11, MacOS, Ubuntu
- JDK 17
- Spring Boot : 3.2.5
- React : 
- Docker 25.0.3, Docker Compose
- Github Actions
- nginx
- AWS EC2, RDS, S3

## 🔗 ERD 
![ERD](/image/ERD-DDAJAIT.png)

## ⚙️ CI/CD 파이프라인
GitHub Actions, nginx , AWS EC2를 이용하여 Spring 애플리케이션 무중단 배포 환경을 구축했습니다.

![CI](/image/spring_ci_cd.png)

## 📝 Spring REST Docs
###  Swagger - springdoc : 2.5.0
http://52.78.44.47/swagger-ui/index.html#/

![swagger](/image/swagger.png)
