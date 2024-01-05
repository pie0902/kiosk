package screenArea;

import menuArea.Data;
import menuArea.DataKey;
import orderArea.Order;

import java.util.Scanner;

public class Screen {

    Data data = new Data();
    Order order = new Order();
    Scanner sc = new Scanner(System.in);

    public Screen(){
        //메인 메뉴판 출력
        while(true) {
            System.out.println(data.getData(DataKey.MAIN));
            int num = sc.nextInt();
            sc.nextLine();
            order.selectMain(num);
        }
    }

}
