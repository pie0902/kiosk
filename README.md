# Kiosk Project

*****************************
##### 📌수정사항(2024.01.07)

[Original version](https://github.com/pie0902/kiosk) <br/>
[Singleton version](https://github.com/pie0902/kiosk/tree/Singeton) 📍

*****************************

------------------------------------
#### 🟢 수정사항 설명

김재환 튜터님께서 저에게 싱글턴 패턴을 말씀해주셔서 ＂싱글톤 패턴이란 게 있구나＂라고만 알고 있었습니다.
오늘은 일요일이라 [혼자 공부하는 자바]를 보면서 기초문법을 복습하고 있었는데, 싱글톤 패턴을 알려주는 페이지가 있어서 실습하고자 바로 적용해봤습니다.
상품 객체를 생성하고 관리하는 방법을 수정했습니다.
```
package menuArea;

import java.util.HashMap;

public class MenuTest {
    private static MenuTest makeMenu = new MenuTest();
    private static HashMap<Integer,Product> bugerList;
    private static HashMap<Integer,Product> frozenList;
    private static HashMap<Integer,Product> drinkkList;
    private static HashMap<Integer,Product> beerList;



    private MenuTest(){
        bugerList = new HashMap<>();
        frozenList = new HashMap<>();
        drinkkList = new HashMap<>();
        beerList = new HashMap<>();
        productListData();

    }
    public static MenuTest getMenu() {
        return makeMenu;
    }
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

    public Product getHash(int choose,int num){
        switch (choose) {
            case 1:
                return bugerList.get(num);
            case 2:
                return frozenList.get(num);
            case 3:
                return drinkkList.get(num);
            case 4:
                return beerList.get(num);
            default:
                System.out.println("정해진 숫자만 입력하세요");
                return null;
        }
    }

}

```

*******************************

#### 🟢 코드를 수정하고 느낀점

싱글톤 패턴을 사용해봤지만 몇번 더 실습을 해서 완전히 저의것으로 만들어야겠습니다.
제가 느끼기에 Data class 안에 있는 코드들이 더 깔끔해 보이긴 하지만 Product 객체를 여러번 생성 하는것은 똑같아서, 어떤 상황에서 어떻게 사용해야 더 실용적인지에 대해서 더 고민해보고 사용해봐야겠다고 생각이 듭니다.
