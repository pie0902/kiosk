package menuArea;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
public class Data {
    //데이터 클래스
    private double sum;

    private List<Product> cart = new ArrayList<>();
    //메인 메뉴 출력 변수
    //메뉴판 리스트
    private HashMap<DataKey,StringBuffer> menuData = new HashMap<>();
    private DataKey key;
    private StringBuffer menuText = new StringBuffer();
    public Data() {
//        productListData();
    }
    public void getKey(DataKey key){
        this.key =key;
    }

    //메뉴 출력
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


    //카트 출력 메소드
    public void getCartList() {
        for (Product product : cart) {
            System.out.println(product.toString());
        }
    }
    //주문가격 합계 메소드
    public double getSum(){
        return sum;
    }
    public void addSum(Product product){
        sum = sum + product.price;
    }

    //주문가격 초기화 메소드
    public void setSum(double sum){
        this.sum = sum;
    }
    //카트 비우기 메소드
    public void clearCart() {
        cart.clear();
    }

    //메뉴판 가져오는 메소드 (데이터키 enum의 상수를 인자로 받음)
    public StringBuffer getData(DataKey datakey){
        return menuData.get(datakey);
    }
//    //상품메뉴판 리스트 객체 한번에 추가

    //장바구니
    public void getCartList(Product product){
        cart.add(product);
    }
}

