<h1>스파르타 코딩클럽 첫번째 프로젝트</h1>
<h2>자바 기초를 다지기 위한 프로젝트</h2>
<h3>배운 내용만을 사용하여 키오스크 만들기 <br/> 콘솔창에 구현해보기</h3>

---

### Language Java 17
### IDE - IntelliJ

#### 과제 소개

- 내가 좋아하는 음식점의 키오스크를 만들기 <br/>
- 지금까지 배워온 Java 언어를 사용하여 키오스크 프로그램을 만들어보기 <br/>

  1. 메뉴판을 보고 주문할 수 있는 Java 프로그램 <br/>
  2. 화면은 System.out.println() 메소드를 사용하여 출력 <br/>
  3. 메뉴 클래스와 주문 클래스를 사용하여 Java의 핵심 기능인 상속을 최대한 사용 <br/>
  4. 내가 좋아하는 메뉴들로 다양하게 구성해보기 <br/>

#### 요구 사항

- 메뉴 클래스는 이름, 설명 필드를 가지는 클래스로 만들기
- 상품 클래스는 이름, 설명, 가격 필드를 가지는 클래스로 만들기
- 상품 클래스의 이름, 설명은 메뉴 클래스를 상속 받아서 사용하기
- 주문 클래스도 만들어 상품 객체를 담을 수 있도록 해보기

***

##### 1. 메인 메뉴판
- 메인 메뉴판이 출력되면 메뉴판에는 상품 메뉴가 출력됩니다.
- 상품 메뉴는 간단한 설명과 함께 출력되며 최소 3개 이상 출력됩니다.
- 상품 메뉴 아래에는 Order(주문)와 Cancel(취소) 옵션을 출력해줍니다

***

##### 2. 상품 메뉴판
- 상품 메뉴 선택 시 해당 카테고리의 메뉴판이 출력됩니다.
- 메뉴판에는 각 메뉴의 이름과 가격과 간단한 설명이 표시됩니다.

***

##### 3. 구매 화면
- 상품 선택 시 해당 상품을 장바구니에 추가할지 확인하는 문구가 출력됩니다.
- 확인 입력 시 장바구니에 추가되었다는 안내 문구와 함께 메인 메뉴로 다시 출력됩니다.

***

##### 4. 주문 화면
- order 입력 시 장바구니 목록을 출력해줍니다.
- 장바구니에서는 추가된 메뉴들과 총 가격의 합을 출력해줍니다.
- 주문 입력 시 주문완료 화면으로 넘어가고, 메뉴판 입력 시 다시 메인 메뉴로 돌아옵니다.

***

##### 5. 주문 완료 화면
- 주문 입력 시 대기번호를 발급해줍니다.
- 장바구니는 초기화되고 3초 후에 메인 메뉴판으로 돌아갑니다.

***

##### 6. 주문 취소 화면
- 메뉴판에서 Cancel 입력 시 주문을 취소할지 확인을 요청하는 문구가 출력됩니다.
- 확인을 입력하면 장바구니는 초기화되고 취소 완료 문구와 함께 메뉴판이 출력됩니다.

