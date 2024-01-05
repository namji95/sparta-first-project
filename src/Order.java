import java.util.ArrayList;

public class Order {
    String[] menuOrder = {
            "Order          | 장바구니를 확인 후 주문합니다.",
            "Cancel         | 진행중인 주문을 취소합니다.",
            "KIOSK End      | 키오스크를 종료합니다."
    };
    String[] menuCheck = {
            "확인",
            "취소"
    };
    ArrayList<String> buggersMenu = new ArrayList<>();
    ArrayList<String> iceCreamMenu = new ArrayList<>();
    ArrayList<String> coffeeMenu = new ArrayList<>();
}
