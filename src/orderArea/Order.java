package orderArea;
import menuArea.Data;
import menuArea.DataKey;
import menuArea.Product;

import java.util.HashMap;
import java.util.Scanner;
public class Order{
    //주문번호 대기표
    int cnt = 0;
    Scanner sc = new Scanner(System.in);
    // 숫자로 선택할때 쓰는 int형 변수
    //선택할 숫자를 입력받을 변수
    int num;
    // 문자열로 선택할때 사용하는 String 변수
    String check;
    //Product 객체를 담아주는 변수
    Product orderList;
    //데이터 객체 생성
    Data data = new Data();
    public Order() {

    }
    //정수 입력 메소드
    public int intScanner(){
        num = sc.nextInt();
        sc.nextLine();
        return num;
    }
    //문자 입력 메소드
    public String stringScanner() {
        check = sc.nextLine();
        return check;
    }



    //메뉴판 선택 메소드
    public void selectMain(int choose) {
            //배열로 관리
            DataKey[] dateKeys = {DataKey.BUGER, DataKey.FORZEN, DataKey.DRINK, DataKey.BEER};
            if (choose >= 1 && choose <= 4) {
                select(dateKeys[choose - 1], choose);
            } else if (choose == 5) {
                System.out.println("아래와 같이 주문 하시겠습니까?\n[ Orders ]");
                data.getCartList();
                System.out.println("\n[ Total ]\nW " + data.getSum());
                System.out.println("\n1.주문       2.메뉴판");
                stringScanner();
                if (check.equals("1.주문")) {
                    cnt++;
                    data.setSum(0);
                    data.clearCart();
                    System.out.println("주문이 완료되었습니다!\n");
                    System.out.println("대기번호는 [ " + cnt + " ] 번 입니다.\n(3초 후 메뉴판으로 돌아갑니다.)");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("오류");
                    }
                    return;

                } else if (check.equals("2.메뉴판")) {
                    return;
                }
            } else if (choose == 6) {
                System.out.println("진행하던 주문을 취소하시겠습니까?\n" +
                        "1. 확인        2. 취소");
                stringScanner();
                if (check.equals("1.확인")) {
                    data.setSum(0);
                    data.clearCart();
                    return;
                } else if (check.equals("1.취소")) {
                    return;
                } else {
                    System.out.println("올바른 값을 입력하세요.");
                }
            } else {
                System.out.println("정해진 숫자를 입력하세요");
            }
    }
    //메뉴판 생성할때 중복되는 코드 관리 메소드
    public void select(DataKey datakey,int choose){
        while(true) {
            System.out.println(data.getData(datakey));
            intScanner();
            orderList = data.getHash(choose, num);
            System.out.println(orderList + "\n" + data.getData(DataKey.ADD));
            stringScanner();
            if(check.equals("1.확인")){
                data.addSum(orderList);
                System.out.println(orderList.getName() + "가 추가되었습니다.");
                data.getCartList(orderList);
                break;
            }
            else if(check.equals("2.취소")){
                break;
            }
            else{
                System.out.println("정확한 답변을 해주세요!");
                return;
            }

        }
    }

}
