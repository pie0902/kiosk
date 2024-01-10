# Kiosk Project

*****************************
##### 📌수정사항(2024.01.10)

[Original version](https://github.com/pie0902/kiosk) <br/>
[Singleton version](https://github.com/pie0902/kiosk/tree/Singeton)<br/>
[StringBuffer 수정 version](https://github.com/pie0902/kiosk/tree/StringBuffer) 📍
*****************************

------------------------------------
#### 🟢 수정사항 설명

StringBuffer에 문자열을 담는 방법을 수정했습니다.
```
 private StringBuffer menuText = new StringBuffer();
 public void board(DataKey key){
        menuText.delete(0,menuText.length());
        switch(key) {
            case BUGER:
                menuText.append("""
                        "SHAKESHACK BURGER 에 오신걸 환영합니다."
                        아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.
                                        
                        [ Burgers MENU ]
                                        
                        1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
                        2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
                        3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거
                        4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
                        5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
                        """);

                menuData.put(DataKey.BUGER,menuText);
                break;
            case FROZEN:
                menuText.append("""
                        "SHAKESHACK BURGER 에 오신걸 환영합니다."
                        아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.
                                        
                        [ Frozen Custard MENU ]
                                        
                        1. Chocolate IceCream | W 1.9 | 초코맛 아이스크림
                        2. StrawberryIceCream | W 1.9 | 딸기맛 아이스크림
                        3. Oreo IceCream      | W 2.9 | 오레오 아이스크림
                        """);
                menuData.put(DataKey.FROZEN,menuText);
                break;
            case DRINK:
                menuText.append("""
                        "SHAKESHACK BURGER 에 오신걸 환영합니다."
                        아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.
                                        
                        [ Beer MENU ]
                                        
                        1. Cola   | W 1.5 | 콜라
                        2. Sprite | W 1.5 | 스프라이트
                        3. Fanta  | W 1.5 | 환타
                        B""");
                menuData.put(DataKey.DRINK,menuText);
                break;
            case BEER:
                menuText.append("""
                        1. Cass   | W 2.9 | 카스
                        2. Kloud  | W 2.9 | 클라우드
                        3. Kozel  | W 3.9 | 코젤
                        """);
                menuData.put(DataKey.BEER,menuText);
                break;
            case ADD:
                menuText.append("""
                                위 메뉴를 장바구니에 추가하시겠습니까?
                                        1. 확인        2. 취소
                        """
                );
                menuData.put(DataKey.ADD,menuText);
                break;
            default:
                System.out.println("에러");
                break;
        }

    }


```

*******************************

#### 🟢 코드를 수정하고 느낀점

2차 개인 과제 제출을 내려고 코드를 살펴보다가 Buffer가 다시 눈에 들어왔습니다.
이렇게 사용하는 게 아닌 것 같고 다시 보니깐 어제 자기 전에 본 강의에서 Buffer에 담긴 내용을 수정하는 방법을 본 게 기억이 나서 수정을 해봤습니다.
결국 board 방법에 매개변수를 받게 됐지만 Buffer 객체를 여러 번 선언하지 않고 한 번만 수정해서 내용을 수정한 것에 의미를 두고 수정해봤습니다.
