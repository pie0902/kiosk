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
