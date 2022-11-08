# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 1단계 - 문자열 계산기

### 기능 요구 사항
사용자가 입력한 문자열 값에 따라 사칙연산 수행  
숫자와 사칙연산 사이에는 반드시 빈 공백 문자열 존재  
나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정  
사칙연산 우선순위 고려 하지 않고 입력 값에 따라 계산
```
// 예시

2 + 3 * 4 / 2 = 10
```

### 요구 사항 정리

#### 숫자

- [x]  숫자는 정수이다. (문자열을 받아 정수로 파싱한다.)
- [x]  두 숫자를 더할 수 있다.
- [x]  두 숫자를 뺄 수 있다.
- [x]  두 숫자를 곱할 수 있다.
- [x]  한 숫자를 다른 숫자로 나눌 수 있다.
   - [x]  0으로 나눌 수 없다.
   - [x]  나눗셈 결과는 정수로 나누어 떨어진다.

#### 연산자

- [x]  연산자는 + - / * 4개 이다.
- [x]  연산자에 따라 다른 연산을 한다.

#### 계산기

- [x]  숫자와 연산자를 문자열로 받는다.
- [x]  문자열은 공백이나 null일 수 없다.

#### 사칙 연산 과정

- [x]  입력 받은 문자열을 공백 기준으로 나눈다.
- [x]  한 숫자만 입력하면 그대로 출력한다.
- [x]  사칙연산 우선순위를 따르지 않고 입력 순서대로 계산한다.


### 프로그래밍 요구사항

- [x]  indent 1 depth
- [x]  메소드 크기는 최대 10라인 미만
- [x]  else 사용하지 않기


## 2단계 - 로또(자동)

### 기능 요구 사항

1. 구입금액을 입력한다.
2. 구입개수를 구한다. (구입 금액 / 로또 티켓 금액)
   - 로또 1장의 가격은 1000원
3. 구입개수 만큼 로또 티켓을 발급한다.
   - 로또 번호는 1~45 사이에 존재한다.
   - 로또 티켓은 6개의 랜덤한 로또 번호를 가진다.
4. 당첨 번호를 입력한다.
5. 구입한 로또 티켓과 당첨 번호를 비교해서 일치하는 개수에 따라 당첨금액을 계산한다.
6. 수익률(당첨금액 / 구입금액)을 계산한다.

```
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```

## 3단계 - 로또(2등)

### 기능 요구 사항

- 보너스 볼을 입력 받는다.
- 입력 받은 보너스 볼과 번호 5개가 일치하면 2등 이다.
    - 1등: 6개 일치
    - 2등: 보너스볼 + 5개 일치
    - 3등: 5개 일치
    - 4등: 4개 일치
    - 5등: 3개 일치

```
[... 생략 ...]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6
보너스 볼을 입력해 주세요.
7

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
5개 일치, 보너스 볼 일치(30000000원) - 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```

### 프로그래밍 요구 사항

- [x] 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
- [x] java enum을 적용해 프로그래밍을 구현한다.
- [x] 규칙 8: 일급 콜렉션을 쓴다.
- [x] indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- [x] 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- [x] 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- [x] else 예약어를 쓰지 않는다.

### 4단계 - 로또(수동)

- 수동으로 추첨 번호를 입력할 수 있다.

```
구입금액을 입력해 주세요.
14000

수동으로 구매할 로또 수를 입력해 주세요.
3

수동으로 구매할 번호를 입력해 주세요.
8, 21, 23, 41, 42, 43
3, 5, 11, 16, 32, 38
7, 11, 16, 35, 36, 44

수동으로 3장, 자동으로 11개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6
보너스 볼을 입력해 주세요.
7

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
5개 일치, 보너스 볼 일치(30000000원) - 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```

## 전체 요구 사항 정리

#### LotteryNumber : 로또 번호

- [x]  1 ~ 45까지 존재 한다.
- [x]  입력 받은 문자를 파싱해 로또 번호를 생성 한다.

#### LotteryTicket : 로또 티켓

- [x]  로또 번호 6개를 가진다.
- [x]  각 로또 번호는 겹치지 않는다.
- [x]  “1, 2, 3, 4, 5, 6” 입력 받은 문자열을 파싱해서 티켓을 만든다.
- [x]  다른 로또 티켓을 받아 일치하는 번호의 개수를 찾는다.
- [x]  특정 로또 번호의 포함 여부를 확인 한다.

### LotteryTickets : 로또 티켓 리스트

- [x]  입력한 문자열(로또 티켓) 리스트로 로또 티켓 리스트를 생성한다.
- [x]  당첨 티켓(당첨 번호와 보너스볼)을 가지고 등수 계산 결과를 반환 한다.
- [x]  로또 티켓을 추가할 수 있다.

### Rank : 등수

- [x]  일치하는 번호 개수와 보너스 볼과 일치 여부에 따라 등수를 계산한다.
    - [x]  1등 6개 일치
    - [x]  2등 5개 일치, 보너스 볼 일치
    - [x]  3등 5개 일치, 보너스 볼 불일치
    - [x]  4등 4개 일치
    - [x]  5등 3개 일치
    - [x]  그 외

- [x]  등수의 개수를 가지고 상금을 계산할 수 있다.

### Ranks : 등수 Map

- [x]  등수 리스트를 받아 각 등수별 개수를 구한다.
- [x]  구입 금액과 당첨 금액을 이용해 수익률을 계산한다.

#### Price : 금액

- [x]  1000원 보다 커야 한다.
- [x]  구입 금액 / 로또 티켓 가격 ⇒ 구입 개수
- [x]  구입 급액이 로또 티켓 가격으로 나누어 떨어져야 한다.

#### Amount : 개수

- [x]  0개 보다 커야한다.
- [x]  문자로 받은 개수를 파싱한다.
- [x]  개수 만큼 로또 티켓을 생성한다.

#### AutoGenerateStrategy : 티켓 자동 생성기

- [x]  임의의 숫자 6개를 뽑아 로또 티켓을 만든다.

#### WinningTicket : 당첨 티켓

- [x] 당첨 번호와 보너스 볼을 가진다.
- [x] 당첨 번호와 보너스 볼의 번호는 모두 다르다.
- [x] 로또 티켓을 받아 등수를 계산 한다.

