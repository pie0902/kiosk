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

    public Data() {
        board();
//        productListData();
    }

    private void board(){
        //HashMap menuData 안에 집어넣는 코드
        StringBuffer mainBoard = new StringBuffer("""
                
                "SHAKESHACK BURGER 에 오신걸 환영합니다."
                 아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.
                 
                [ SHAKESHACK MENU ]
                
                1. Burgers         | 앵거스 비프 통살을 다져만든 버거
                2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림
                3. Drinks          | 매장에서 직접 만드는 음료
                4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주
                
                [ ORDER MENU ]
                5. Order       | 장바구니를 확인 후 주문합니다.
                6. Cancel      | 진행중인 주문을 취소합니다.
                """);
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
                """);

        menuData.put(DataKey.BUGER, buger);
        StringBuffer frozen = new StringBuffer("""
                "SHAKESHACK BURGER 에 오신걸 환영합니다."
                아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.
                
                [ Frozen Custard MENU ]
                
                1. Chocolate IceCream | W 1.9 | 초코맛 아이스크림
                2. StrawberryIceCream | W 1.9 | 딸기맛 아이스크림
                3. Oreo IceCream      | W 2.9 | 오레오 아이스크림
                """);
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
                """);
        menuData.put(DataKey.ADD, add);
        StringBuffer cancle = new StringBuffer("""
                진행하던 주문을 취소하시겠습니까?
                1. 확인        2. 취소
                """);
        menuData.put(DataKey.CANCLE, cancle);

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

//    기존 코드

//햄버거 메뉴판 리스트
//    private HashMap<Integer,Product> bugerList = new HashMap<>();
//    //아이스크림 메뉴판 리스트
//    private  HashMap<Integer,Product> frozenList = new HashMap<>();
//    //음료수 메뉴판 리스트
//    private  HashMap<Integer,Product> drinkkList = new HashMap<>();
//    //맥주 메뉴판 리스트
//    private   HashMap<Integer,Product> beerList = new HashMap<>();
//    //생성자

//    private void addProduct(HashMap<Integer,Product> productHashMap,int key,String name,String description,double price) {
//        Product product = new Product(name,description,price);
//        productHashMap.put(key,product);
//    }
//    private void productListData() {
//        addProduct(bugerList, 1, "ShackBuger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
//        addProduct(bugerList, 2, "SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
//        addProduct(bugerList, 3, "Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
//        addProduct(bugerList, 4, "Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
//        addProduct(bugerList, 5, "Hamburger", " 비프패티를 기반으로 야채가 들어간 기본버거", 5.4);
//        addProduct(frozenList, 1, "Chocolate IceCream", "초코맛 아이스크림", 1.9);
//        addProduct(frozenList, 2, "StrawberryIceCream ", "딸기맛 아이스크림", 1.9);
//        addProduct(frozenList, 3, "Oreo IceCream", "오레오 아이스크림", 2.9);
//        addProduct(drinkkList, 1, "Cola", "콜라", 1.5);
//        addProduct(drinkkList, 2, "Sprite", "스프라이트", 1.5);
//        addProduct(drinkkList, 3, "Fanta", "환타", 1.5);
//        addProduct(beerList, 1, "Cass", "카스", 2.9);
//        addProduct(beerList, 2, "Kloud", "클라우드", 2.9);
//        addProduct(beerList, 3, "Cozel", "코젤", 2.9);
//    }


//각 메뉴판에서 메뉴 객체 한개씩 가져오기
//    public Product getHash(int choose,int num){
//        switch (choose) {
//            case 1:
//                return bugerList.get(num);
//            case 2:
//                return frozenList.get(num);
//            case 3:
//                return drinkkList.get(num);
//            case 4:
//                return beerList.get(num);
//            default:
//                System.out.println("정해진 숫자만 입력하세요");
//                return null;
//        }
//    }
