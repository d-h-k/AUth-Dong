# 실험적 기능 구현용  저장소

오어쓰
데이터베이스 스위칭

1. 설치 및 환경설정 가이드
2. 테이블 생성 SQL
3. API 사용 가이드


## 1. 설치 및 환경설정 가이드
- 소스코드를 다운받습니다
```
git clone https://github.com/d-h-k/pirates.git
```
- 내려받은 폴더로 이동합니다
```
cd pirates
```
- 소스코드를 빌드해 ##.jar 파일을 사용하며 이때 gradle을 사용합니다
  - Java11 JDK는 설치되어있어야 합니다
```
./gradlew build -x test
```
- 빌드파일이 생성된곳으로 이동합니다
```
cd build/libs
```
- 위 과정이 정상대로 진행됬다면, "pirates-0.0.1-SNAPSHOT.jar" 라는 파일이 생성되어 있는데 실행을 위해 아래 명령어를 사용하여 실행합니다
```
java -jar pirates-0.0.1-SNAPSHOT.jar
```
- 정상적으로 실행되었다면 아래와 같은 console화면을 볼 수 있습니다
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.5)

2021-05-15 21:33:08.648  INFO 3040 --- [           main] net.pirates.PiratesApplication           : Starting PiratesApplication using Java 11.0.10 on Dongui-Macmini.local with PID 3040 (/Users/dong/Workspace/pirates/build/libs/pirates-0.0.1-SNAPSHOT.jar started by dong in /Users/dong/Workspace/pirates/build/libs)
2021-05-15 21:33:08.652  INFO 3040 --- [           main] net.pirates.PiratesApplication           : No active profile set, falling back to default profiles: default
2021-05-15 21:33:09.644  INFO 3040 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.

...
<중략>
...


2021-05-15 21:33:12.337  INFO 3040 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2021-05-15 21:33:12.346  INFO 3040 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2021-05-15 21:33:12.705  WARN 3040 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2021-05-15 21:33:12.869  INFO 3040 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2021-05-15 21:33:13.237  INFO 3040 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2021-05-15 21:33:13.244  INFO 3040 --- [           main] net.pirates.PiratesApplication           : Started PiratesApplication in 5.247 seconds (JVM running for 5.854)
```

<br><br><br>

## 2. 테이블 생성 SQL
- JPA를 사용하였습니다.

<br><br><br>

## 3. API 사용 가이드

|  번호  | 구분    | 메서드| URL   | 로컬 테스트 링크|   
| :----: | :-----: | :-----: | ----- | ----- |
|1| 점포 추가 | POST |/store|http://localhost:8080/store|
|2| 점포 휴무일 등록 |POST|/store/holidays|http://localhost:8080/holidays|
|3| 점포 목록 조회 |GET|/store|http://localhost:8080/store|
|4| 점포 상세 조회 |GET|/store/detail|http://localhost:8080/store/detail?id=1|
|5| 점포 삭제|POST|/store/delete|http://localhost:8080/store/delete?id=1|
