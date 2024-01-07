# Kiosk Project
------------------------------------
#### 🟢 간단 설명
안녕하세요.이번 프로젝트는 키오스크를 자바 코드로 간단하게 구현하는 프로젝트 입니다.
키오스크 프로젝트는 스파르타 코딩클럽 내일배움캠프에 합류한 이후 첫 개인과제 입니다.
콘솔창에 아래와 같이 출력이 되야합니다.
*****************************
[Original version]("")
[Singleton version]("https://github.com/pie0902/kiosk/tree/Singleton")
*****************************


------------
#### 🟢 필수 요구사항

```
Java 클래스 설계 시 필수 요구사항!

메뉴 클래스는 이름, 설명 필드를 가지는 클래스로 만들어주세요.
상품 클래스는 이름, 가격, 설명 필드를 가지는 클래스로 만들어주세요.
상품 클래스의 이름, 설명 필드는 메뉴 클래스를 상속받아 사용하는 구조로 개발해주세요.
주문 클래스도 만들어서 상품 객체를 담을 수 있도록 해주세요.
```
------------------------------
#### 🟢 출력예제

##### 메인 메뉴판


```
"SHAKESHACK BURGER 에 오신걸 환영합니다."
아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.
[ SHAKESHACK MENU ]
1. Burgers | 앵거스 비프 통살을 다져만든 버거
2. Forzen Custard | 매장에서 신선하게 만드는 아이스크림
3. Drinks | 매장에서 직접 만드는 음료
4. Beer | 뉴욕 브루클린 브루어리에서 양조한 맥주
[ ORDER MENU ]
5. Order | 장바구니를 확인 후 주문합니다.
6. Cancel | 진행중인 주문을 취소합니다.
```

##### 상품 메뉴판
```
"SHAKESHACK BURGER 에 오신걸 환영합니다."
아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.
[ Burgers MENU ]
1. ShackBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거
4. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
5. Hamburger | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
```
*****************************
#### 🟢 진행 기간
##### 2024.01.04 ~ 2024.01~05


****************************

#### 🟢 진행 과정
1. 메뉴판과 상품 객체 들을 관리할 Data 클래스를 구현
2. 메뉴를 선택하고 주문할수있게 입력과 출력을 구현
3. 사용자가 주문한 메뉴들을 저장할 장바구니 기능 구현
4. 주문한 메뉴 합계 및 결제 기능 구현

****************************
#### 🟢 어려웠던 문제와 해결책
##### 1.상품 객체 관리
* 고민: 데이터베이스가 없다보니 상품들을 한개한개씩 객체로 생성하고 관리해야하는점에 대해서 고민을 많이 했습니다.
* 해결책: 객체를 한개한개 생성하고 리스트에 넣는 과정을 최대한 줄여야겠다라고 결론을 내렸습니다.
```  
//햄버거 메뉴판 리스트  
private HashMap<Integer,Product> bugerList = new HashMap<>();  
//아이스크림 메뉴판 리스트  
private  HashMap<Integer,Product> frozenList = new HashMap<>();  
//음료수 메뉴판 리스트  
private  HashMap<Integer,Product> drinkkList = new HashMap<>();  
//맥주 메뉴판 리스트  
private   HashMap<Integer,Product> beerList = new HashMap<>();


//상품메뉴판 리스트 객체 한번에 추가  
private void addProduct(HashMap<Integer,Product> productHashMap,int key,String name,String description,double price) {  
    Product product = new Product(name,description,price);  
    productHashMap.put(key,product);  
}  
private void productListData() {  
    addProduct(bugerList, 1, "ShackBuger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);  
    addProduct(bugerList, 2, "SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);  
    addProduct(bugerList, 3, "Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);  
    addProduct(bugerList, 4, "Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);  
    addProduct(bugerList, 5, "Hamburger", " 비프패티를 기반으로 야채가 들어간 기본버거", 5.4);  
    addProduct(frozenList, 1, "Chocolate IceCream", "초코맛 아이스크림", 1.9);  
    addProduct(frozenList, 2, "StrawberryIceCream ", "딸기맛 아이스크림", 1.9);  
    addProduct(frozenList, 3, "Oreo IceCream", "오레오 아이스크림", 2.9);  
    addProduct(drinkkList, 1, "Cola", "콜라", 1.5);  
    addProduct(drinkkList, 2, "Sprite", "스프라이트", 1.5);  
    addProduct(drinkkList, 3, "Fanta", "환타", 1.5);  
    addProduct(beerList, 1, "Cass", "카스", 2.9);  
    addProduct(beerList, 2, "Kloud", "클라우드", 2.9);  
    addProduct(beerList, 3, "Cozel", "코젤", 2.9);  
}

```


##### 2. 메인메뉴판과 상품메뉴판의 출력

* 고민: 메뉴클래스를 선언하고 메뉴 객체를 또 생성하고 그 객체들을 합쳐서 메인메뉴판을 만들고, 비슷한 방식으로 상품메뉴판도 만들어야하나? 고민했습니다.
* 해결책 튜터님께서 StringBuffer라는 자료형을 알려주셔서 StringBuffer에 대해 찾아봤습니다. "배운건 써보자!"라는 생각도 들고 확실히 메인메뉴판과 상품메뉴판을 단순히 출력하는게 더 단순하고 가독성도 좋을것 같아서 StringBuffer를 사용해서 메뉴판을 출력하는 문제를 해결을 했습니다.
```
private void board(){  
    //HashMap menuData 안에 집어넣는 코드  
    StringBuffer mainBoard = new StringBuffer("""  
            "SHAKESHACK BURGER 에 오신걸 환영합니다."  
             아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.                         
             [ SHAKESHACK MENU ]  
            1. Burgers         | 앵거스 비프 통살을 다져만든 버거  
            2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림            
            3. Drinks          | 매장에서 직접 만드는 음료            
            4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주                        [ ORDER MENU ]  
            5. Order       | 장바구니를 확인 후 주문합니다.            
            6. Cancel      | 진행중인 주문을 취소합니다.            """);  
    menuData.put(DataKey.MAIN, mainBoard);  
    StringBuffer buger = new StringBuffer("""  
            "SHAKESHACK BURGER 에 오신걸 환영합니다."            
            아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.                        
            [ Burgers MENU ]  
            1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거  
            2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거        
            3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거   
            4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거       
            5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거          
            6. """);  
  
    menuData.put(DataKey.BUGER, buger);  
    StringBuffer frozen = new StringBuffer("""  
            "SHAKESHACK BURGER 에 오신걸 환영합니다."
            아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.                        
            [ Frozen Custard MENU ]  
            1. Chocolate IceCream | W 1.9 | 초코맛 아이스크림  
            2. StrawberryIceCream | W 1.9 | 딸기맛 아이스크림            
            3. Oreo IceCream      | W 2.9 | 오레오 아이스크림            """);  
    menuData.put(DataKey.FROZEN, frozen);  
    StringBuffer drink = new StringBuffer("""  
            "SHAKESHACK BURGER 에 오신걸 환영합니다."
         아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.                        
			[ Drink MENU ]  
            1. Cola   | W 1.5 | 콜라  
            2. Sprite | W 1.5 | 스프라이트            
            3. Fanta  | W 1.5 | 환타            
            """);  
    menuData.put(DataKey.DRINK, drink);  
    StringBuffer beer = new StringBuffer("""  
	        "SHAKESHACK BURGER 에 오신걸 환영합니다."            
	        아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.                        
	        [ Beer MENU ]  
            1. Cass   | W 2.9 | 카스  
            2. Kloud  | W 2.9 | 클라우드            
            3. Kozel  | W 3.9 | 코젤            
            """);
    menuData.put(DataKey.BEER, beer);  
    StringBuffer add = new StringBuffer("""  
            위 메뉴를 장바구니에 추가하시겠습니까?
            1. 확인        2. 취소            
            2. """);  
    menuData.put(DataKey.ADD, add);  
    StringBuffer cancle = new StringBuffer("""  
            진행하던 주문을 취소하시겠습니까?            
            1. 확인        2. 취소            
            """);  
    menuData.put(DataKey.CANCLE, cancle);  
  
}
```
***************************
##### ✏️ 느낀점
어떻게 시작해야할까? -> 일단은 짜봐야겠다. -> 메뉴 데이터를 어떻게 관리해야할까? -> 상품 객체를 어떤식으로 생성해서 관리할까? -> 메인 메뉴판과 상품 메뉴판을 구성하는 방법은 뭐가 좋을까? -> ...
일단 감이 안잡혀서 무작정 코드를 작성했습니다.내일배움캠프는 오전 9시부터 오후 9시까지 진행되는데 하루의 시간을 거의 다써서 저녁에 코드를 거의 완성했습니다.콘솔창에 구현은 되긴 했습니다만.. 가독성이 정말 안좋고 너무 반복되는 코드가 많다는 생각이 들었습니다.
자기전까지 고민하며 더 효율적인 방법을 찾으려 이런저런 자료들을 검색하고 찾아보다가 잠들기전에 "내일 마저 해보자"라는 마음은 "내일 처음부터 다시 작성하자"로 변했습니다.그리고 다음날 확실히 전날보다 정리가 잘 되었고 코드작성하는것이 수월했습니다.
역시 프로그래밍은 직접 해보는게 중요한것같습니다.

