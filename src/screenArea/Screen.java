package screenArea;
import menuArea.Data;
import menuArea.DataKey;
import orderArea.Order;
import java.util.Scanner;

public class Screen {
    Order order = new Order();
    Scanner sc = new Scanner(System.in);
    public Screen() {

    }
    //메인 메뉴판 출력

    String mainMenu  = """
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
                        """;
    public void on(){
        while(true) {
            System.out.println(mainMenu);
            int num = sc.nextInt();
            sc.nextLine();
            order.selectMain(num);
        }
    }


}
