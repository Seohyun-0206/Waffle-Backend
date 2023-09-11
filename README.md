# <img width="40" src="https://github.com/Seohyun-0206/Waffle-Backend/assets/81468092/b0c501ca-c6e4-451f-842c-eaea073d4d9e"> Waffle (프로젝트 관리를 위한 협업 웹서비스)
프로젝트 관리를 위한 협업 웹서비스로 다음의 목표로 개발하게 되었다.
- 팀원들 간 소통 기능 확대 및 편리한 기능 제공
- 프로젝트시 일정 관리, 진행 사항 관리 편의성 향상
- 팀 프로젝트시 생기는 부담감 해소

## ⭐ 설명
### Waffle?
- 와플 기계로 찍어먹으면 무엇이든 맛있고 성공하듯이 우리의 서비스를 이용하면 어떠한 프로젝트라도 성공할 수 있다는 의미
- "이리와 플젝할래?"의 줄임말
### 개발 기간
- 2023.03 ~ 2023.06
### 개발 인원
- 3명(프론트 1명, 백 2명)

## ⭐ 시연 영상
👉[waffle 시연 영상](https://www.youtube.com/watch?v=53iTT8urirE&t=5s)👈


## ✨ Waffle의 주요 기능
### 그룹 및 룸 기능
- 프로젝트 별로 원하는 사람들과 그룹을 생성하여 관리 가능
- 그룹 내에 룸을 생성하여 파트별로 나누어 관리 가능
### DM 및 화상채팅 기능
- 원하는 사람들과 채팅방을 개설하여 실시간 DM, 화상채팅 가능
### 일정 관리 기능
- 캘린더 및 보드 두 가지 형태로 일정 관리 가능
- 일정 제목, 내용, 날짜, 상태 등 기록 가능
### 프로필 기능
- 프로필 사진, 한줄 소개 등록 가능
- ongoing project를 등록하여 본인이 현재 참여하고 있는 프로젝트 설명을 등록하여 표현 가능
### 게시판 기능
- 게시판을 이용하여 중요한 정보를 공유하고 규칙 공지 가능

## ⭐ 서비스 화면
### 회원가입 및 로그인
<img width="966" alt="회원가입및로그인" src="https://github.com/Seohyun-0206/Waffle-Backend/assets/81468092/064b1686-1fc0-41c4-a7c7-ea969eb94562">

### 캘린더
<img width="959" alt="캘린더" src="https://github.com/Seohyun-0206/Waffle-Backend/assets/81468092/fbd4418c-045c-4e7f-81c4-bce92bb0f095">

### 그룹
<img width="961" alt="그루" src="https://github.com/Seohyun-0206/Waffle-Backend/assets/81468092/1a87ce1f-dfcd-4362-98a5-28ac302f4d76">

### 룸
<img width="955" alt="룸" src="https://github.com/Seohyun-0206/Waffle-Backend/assets/81468092/c0fe82bb-ed83-4187-ba35-a6d614e65b8f">

### DM 및 화상채팅
<img width="953" alt="채팅" src="https://github.com/Seohyun-0206/Waffle-Backend/assets/81468092/7cca5bf2-9563-4490-bfd1-8079b218833f">

### 프로필
<img width="959" alt="프로필" src="https://github.com/Seohyun-0206/Waffle-Backend/assets/81468092/aabf4510-1eb0-4ff0-b276-b4323c8712cf">


## 💻 개발 환경
- Backend
  - Intellij
  - java 17
  - Springboot 3.0.4
  - Springboot-jpa
  - Spring Security
  - MySQL
  - Redis
  - websocket
  - STOMP
- Frontend
  - VSCode
  - JavaScript
  - React
  - Axios
  - Style Components
  - STOMP
  - NPM
- WebRTC
  - openvidu 2.27.0
  - openvidu browser 2.27.0
- 협업 툴
  - Figma(디자인)
  - Notion
  - Git & Github
- 배포
  - AWS EC2, RDS
  - Docker
  - Nginx

## ✨ 서비스 아키텍처
- AWS EC2를 이용하여 서버 구축
- React는 80번 포트로 들어오는 입력을 받을 수 있도록 Nginx 프록시 설정을 하여 docker 이미지화
- EC2 인스턴스에 docker 이미지로 된 React와 Spring boot jar 파일을 올리고 Redis도 docker 이미지를 다운 받아 설정, openvidu는 on-premises 버전을 docker에서 다운 받아 설정
- 데이터베이스는 클라우드 데이터베이스로 RDS를 이용하여 구성
- 도메인을 구매하여 EC2에도 Nginx 설정을 하여 SSL 인증서를 발급받아 https 통신이 가능하도록 함
- https://waproject.store (현재 접속 불가)
<img width="746" alt="스크린샷 2023-06-12 033129" src="https://github.com/Seohyun-0206/Waffle-Backend/assets/81468092/9360ead3-49e7-468f-9e3b-92153ca54646">
  
## ✨ 기술
- WebRTC(Openvidu)
  - 웹 상에서 유연하게 실시간 화상채팅을 가능하게 하는 플랫폼
  - 화상채팅 버튼을 누르면 채팅방 내의 사용자들이 모두 같은 화상채팅방으로 접속되도록 함
  - 카메라, 마이크 사용 가능
- WebSocket, STOMP
  - 실시간 통신이 가능하도록 하는 웹소켓 통신, 메시지 전송을 쉽게 하는 STOMP(Simple Text Oriented Messaging Protocol)
  - publisher-subscriber 방식을 이용하여 연결하고 통신
  - 최대 6명까지 입장 가능
- Redis
  - Spring Security, JWT를 이용하여 인증 구현, 사용자 로그아웃시 토큰을 만료되도록 하여 다시 인증 불가하도록 구현

## ✨ 화면 설계서
<img width="896" alt="화면 설계" src="https://github.com/Seohyun-0206/Waffle-Backend/assets/81468092/7deb8680-23d8-4fea-8f63-44c89154646b">

## ✨ E-R 다이어그램
<img src="https://github.com/Seohyun-0206/Waffle-Backend/assets/81468092/4ada91cc-ceff-4b4e-8973-ee5b106f8347" width="900">

## ✨ 최종 테스트 케이스
<img width="989" alt="테스트1" src="https://github.com/Seohyun-0206/Waffle-Backend/assets/81468092/3486ea00-6777-4028-87b0-070c6be270b8">
<img width="840" alt="테스트2" src="https://github.com/Seohyun-0206/Waffle-Backend/assets/81468092/9bb8b78d-233e-488d-aaf3-8aacc0863159">

## 👨‍👩‍👧 팀원
- [전서현(팀장, 본인, 백엔드)](https://github.com/Seohyun-0206)
  - 서비스에 필요한 기능 설계 및 기능 명세서 작성
  - 기능에 따른 ERD를 구성하고 이에 따른 DB 구축
  - 기능을 잘 보여줄 수 있도록 Figma를 이용한 UX 및 UI 디자인 설계
  - Spring security, JWT, Redis를 이용한 로그인 기능 구현
  - 백엔드 룸 CRUD 및 게시판 CRUD API 구현
  - openvidu를 이용한 화상채팅 기능 구현
  - 통합 테스트 문서 작성 및 통합 테스트
  - AWS, Nginx, Docker를 이용한 클라우드 서버 구축

- [주다현(프론트엔드)](https://github.com/judahhh)
  - UI/UX 설계 및 UI 구현
  - 프론트엔드 전반의 CRUD 구현 - openvidu 플랫폼을 이용한 화상채팅 기능 구현
  - 소켓 통신과 StompJS를 이용한 실시간 채팅 기능 구현 - jwt를 이용한 로그인 기능 구현
  - 프론트엔드 배포를 위한 docker 이미지화

- [최호경(백엔드)](https://github.com/HoGyeongC)
  - 기능 설계 및 DB 구축
  - Spring security, JWT, Redis를 이용한 회원가입 기능 구현
  - 백엔드 그룹, 프로필, 일정, 채팅방 각각의 CRUD API 구현
  - websocket, STOMP를 사용한 실시간 채팅 기능 구현
  - 통합 테스트 문서 작성 및 통합 테스트
  - AWS, Nginx, Docker를 이용한 클라우드 서버 구축

## ✊ 프로젝트를 개발한 후 회고
- 의사소통의 중요성을 알았다.
  - 혼자서만 개발하던 사람들끼리 만나 개발을 하다보니 서로의 사정을 이해하기 힘들었고 프론트와 백 통신 부분에서 가장 많은 어려움을 겪었다. 상대방이 더욱 쉽게 이해할 수 있도록 말해야겠다!
- 리엑트를 배우고 싶다.
  - 마냥 웹 퍼블리싱만 하는 줄 알았던 프론트엔드와 함께 프로젝트를 진행해보니 그것은 정말 작은 부분이었다. 서버에서 전달된 데이터를 다루고, 통신을 요청하는 것들이 흥미를 유발했다. 또한, 리엑트 코드를 더 잘 알다면 프론트와의 협업 시 더 좋은 역량을 발휘할 수 있을 것이라고 생각한다.
- 테스트의 중요성!!
  - 개발을 하면서 모든 API에 대한 테스트와 기능별 단위 테스트는 진행했지만 통합 테스트를 할 생각을 하지 못했었다. 프로젝트를 진행해가면서 통합 테스트의 중요성을 깨닫게 되었고 배포 전 마지막 통합 테스트를 해보았다.
  - 모든 기능이 오동작했다. 각각 하나만 실행했을 경우에는 괜찮았지만 연속적으로 다른 기능들과 함께 요청하면 오류가 발생했다. 테스트는 항상 많이 자주!
- 기록하자
  - 프로젝트를 하면서 수없이 외쳤던 말은 "기록하자" 였다. 내가 왜 코드를 이렇게 짰는지, 어떤 오류가 발생했고 어떻게 수정했는지 등등 모든 개발 내용들을 기록하였다.
  - 특히 백엔드는 두명이서 진행했기 때문에 서로의 진행상황과 왜 이런 코드를 작성했는지를 공유함에 있어서 아주 좋게 작용했다.
- 긍정적인 마인드로 포기하지말고 끝까지!
  - 프로젝트를 진행하면서 아주 많은 어려움이 있었고 왜 이걸 하려고 했지라는 생각이 수없이 들었다. 하지만, 모두 우리는 할 수 있다는 마인드로 끝까지 완성했고 좋은 결과를 얻을 수 있었다.
  - 항상 긍정적인 생각을 가지고 끝까지 해내는 멋쟁이가 되자!
