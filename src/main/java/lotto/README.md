### 기능 요구사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.  
- 로또 1장의 가격은 1000원이다.
- 로또 1장은 1~43 사이의 6개의 숫자로 구성된다.
- 로또 당첨 번호 6개를 입력받는다.
- 3개 일치(5천원), 4개 일치(5만원), 5개 일치(150만원), 6개 일치(20억)
- 당첨 통계와 수익률을 보여준다.


- 2등을 위해 추가 번호를 하나 더 추첨한다.
- 당첨 통계에 2등도 추가해야 한다.


- 로또 수동 구매 기능을 추가한다.

### TODO
- [x] 금액을 입력하면 구매 가능한 로또 갯수를 출력한다
- [x] 남는 금액은 버림한다
- [x] 로또 갯수만큼의 리스트를 뽑는다
- [x] 로또 번호의 범위는 1~43 사이이다.
- [x] 로또 티켓은 6개의 랜덤숫자를 포함한다.
- [x] 중복 숫자를 포함하지 않는다.
- [x] 당첨 번호를 ,로 구분해 입력받는다
- [x] 로또 당 맞는 갯수를 계산한다.
- [x] 로또 당 당첨 금액을 계산한다.
- [x] (당첨 금액) / (구입 금액) 으로 수익률을 구한다(소수점 둘째자리까지 표시)


- [x] 보너스 볼을 입력 받는다.
- [x] 5개 일치 + 보너스 볼 일치의 경우 2등 당첨
- [x] 로또 티켓 번호 정렬


- [x] 수동 구매할 로또 수를 추가로 입력받는다.
- [x] 수동 구매 로또 수가 돈을 초과하면 에러
- [x] 자동으로 구매하는 티켓 수 계산
- [x] 수동으로 구매할 번호를 입력받는다.
- [x] 수동, 자동으로 구매한 로또를 함께 출력한다.