import java.util.Scanner;

public class Main {
    static Menu menu = new Menu();
    static Product product = new Product();
    static Order order = new Order();

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        boolean kioskRun = true;
        while (kioskRun) {
            int buggerArr;
            int iceCreamArr;
            int coffeeArr;
            System.out.println(
                    "\"SHAKESHACKE에 오신걸 환영합니다.\"\n" +
                            "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n\n" +
                            "[ SHAKESHACK MENU ]"
            );
            for (int i = 0; i < menu.mainMenu.length; i++) {
                System.out.println(
                        (i+1) + ". " + menu.mainMenu[i]
                );
            }
            System.out.println(
                    "\n[ ORDER MENU ]"
            );
            for (int i = 0; i < order.menuOrder.length; i++) {
                System.out.println(
                        (menu.mainMenu.length + i + 1) + ". " + order.menuOrder[i]
                );
            }
            int menuSelect = in.nextInt();
            switch (menuSelect) {
                case 1:
                    System.out.println(
                            "\n \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                                    "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n\n" +
                                    "[ Burgers MENU ]");
                    for (int i = 0; i < product.buggersInfo.length; i++) {
                        System.out.println(
                                (i + 1) + ". " +
                                        product.buggersInfo[i]
                        );
                    }
                    int buggerSelect = in.nextInt();
                    switch (buggerSelect) {
                        case 1 : case 2 : case 3 : case 4 : case 5 :
                            System.out.println(
                                    "\n" + "\"" +
                                            product.buggersInfo[buggerSelect - 1] + "\"" +
                                            "\n위 메뉴를 장바구니에 추가하시겠습니까?"
                            );
                            for (int i = 0; i < order.menuCheck.length; i++) {
                                System.out.print(
                                        (i + 1) + ". " +
                                                order.menuCheck[i] +
                                                "       "
                                );
                            };
                            System.out.println();
                            int menuCheckSelect = in.nextInt();
                            switch (menuCheckSelect) {
                                case 1 :
                                    buggerArr = product.buggersInfo[buggerSelect - 1].indexOf("|");
                                    System.out.println();
                                    order.buggersMenu.add(
                                            product.buggersInfo[buggerSelect - 1]
                                    );
                                    System.out.println(
                                            product.buggersInfo[buggerSelect - 1].substring(0, buggerArr - 1) +
                                            "가 장바구니에 추가되었습니다.");
                                    System.out.println();
                                    break;
                                case 2 :
                                    System.out.println("\n주문이 취소 되었습니다.\n");
                                    break;
                            }
                            break;
                    }
                    break;
                case 2 :
                    System.out.println(
                            "\n \"SHAKESHACK ICECREAM 에 오신걸 환영합니다.\"\n" +
                                    "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n\n" +
                                    "[ ICECREAM MENU ]");
                    for (int i = 0; i < product.iceCreamInfo.length; i++) {
                        System.out.println(
                                (i + 1) + ". " +
                                        product.iceCreamInfo[i]
                        );
                    }
                    int iceCreamsSelect = in.nextInt();
                    switch (iceCreamsSelect) {
                        case 1 : case 2 : case 3 : case 4 : case 5 :
                            System.out.println(
                                    "\n" + "\"" +
                                            product.iceCreamInfo[iceCreamsSelect - 1] + "\"" +
                                            "\n위 메뉴를 장바구니에 추가하시겠습니까?"
                            );
                            for (int i = 0; i < order.menuCheck.length; i++) {
                                System.out.print(
                                        (i + 1) + ". " +
                                                order.menuCheck[i] +
                                                "       "
                                );
                            };
                            System.out.println();
                            int menuCheckSelect = in.nextInt();
                            switch (menuCheckSelect) {
                                case 1 :
                                    iceCreamArr = product.iceCreamInfo[iceCreamsSelect - 1].indexOf("|");
                                    System.out.println();
                                    order.iceCreamMenu.add(
                                            product.iceCreamInfo[iceCreamsSelect - 1]
                                    );
                                    System.out.println(
                                            product.iceCreamInfo[iceCreamsSelect-1].substring(0, iceCreamArr - 1) +
                                            "가 장바구니에 추가되었습니다.");
                                    System.out.println();
                                    break;
                                case 2 :
                                    System.out.println("\n주문이 취소 되었습니다.\n");
                                    break;
                            }
                            break;
                    }
                    break;
                case 3 :
                    System.out.println(
                            "\n \"SHAKESHACK COFFEE 에 오신걸 환영합니다.\"\n" +
                                    "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n\n" +
                                    "[ Iscreams MENU ]");
                    for (int i = 0; i < product.coffeeInfo.length; i++) {
                        System.out.println(
                                (i + 1) + ". " +
                                        product.coffeeInfo[i]
                        );
                    }
                    int coffeeSelect = in.nextInt();
                    switch (coffeeSelect) {
                        case 1 : case 2 : case 3 : case 4 : case 5 :
                            System.out.println(
                                    "\n" + "\"" +
                                            product.coffeeInfo[coffeeSelect - 1] + "\"" +
                                            "\n위 메뉴를 장바구니에 추가하시겠습니까?"
                            );
                            for (int i = 0; i < order.menuCheck.length; i++) {
                                System.out.print(
                                        (i + 1) + ". " +
                                                order.menuCheck[i] +
                                                "       "
                                );
                            };
                            System.out.println();
                            int menuCheckSelect = in.nextInt();
                            switch (menuCheckSelect) {
                                case 1 :
                                    coffeeArr = product.coffeeInfo[coffeeSelect - 1].indexOf("|");
                                    System.out.println();
                                    order.coffeeMenu.add(
                                            product.coffeeInfo[coffeeSelect - 1]
                                    );
                                    System.out.println(
                                            product.coffeeInfo[coffeeSelect-1].substring(0, coffeeArr) +
                                            "가 장바구니에 추가되었습니다.");
                                    System.out.println();
                                    break;
                                case 2 :
                                    System.out.println("\n주문이 취소 되었습니다.\n");
                                    break;
                            }
                            break;
                    }
                    break;
                case 4 :
                    double TotalPrice = 0;
                    if (order.buggersMenu.isEmpty() && order.iceCreamMenu.isEmpty() && order.coffeeMenu.isEmpty()) {
                        System.out.println("\n장바구니에 아무것도 없습니다. 메뉴판으로 돌아가겠습니다.");
                        Thread.sleep(1000);
                        break;
                    }
                    System.out.println(
                            "\n아래와 같이 주문 하시겠습니까?\n\n" +
                            "[ Orders ]"
                    );
                    if (!order.buggersMenu.isEmpty()) {
                        for (String buggerStr : order.buggersMenu) {
                            System.out.println(buggerStr);
                        }
                        for (int i = 0; i < order.buggersMenu.size(); i++) {
                            TotalPrice += Double.parseDouble(order.buggersMenu.get(i).replaceAll("[^0-9.]", ""));
                        }
                    }
                    if (!order.iceCreamMenu.isEmpty()) {
                        for (String iceCreamStr : order.iceCreamMenu) {
                            System.out.println(iceCreamStr);
                        }
                        for (int i = 0; i < order.iceCreamMenu.size(); i++) {
                            TotalPrice += Double.parseDouble(order.iceCreamMenu.get(i).replaceAll("[^0-9.]", ""));
                        }
                    }
                    if (!order.coffeeMenu.isEmpty()) {
                        for (String coffeeStr : order.coffeeMenu) {
                            System.out.println(coffeeStr);
                        }
                        for (int i = 0; i < order.coffeeMenu.size(); i++) {
                            TotalPrice += Double.parseDouble(order.coffeeMenu.get(i).replaceAll("[^0-9.]", ""));
                        }
                    }
                    System.out.println(
                            "\n[ Total ]" + "\n" +
                            "W " + String.format("%.1f", TotalPrice) +
                            "\n\n1. 주문      2. 메뉴판"
                    );
                    int orderSelect = in.nextInt();
                    switch (orderSelect) {
                        case 1 :
                            System.out.println(
                                    "주문이 완료되었습니다!" +
                                    "대기번호는 [ 1 ]번 입니다.\n"
                            );
                            order.buggersMenu.clear();
                            order.iceCreamMenu.clear();
                            order.coffeeMenu.clear();
                            Thread.sleep(1500);
                            break;
                    }
                    break;
                case 5 :
                    System.out.println(
                            "\n진행하던 주문을 취소하시겠습니까?\n" +
                            "1. 확인       2. 취소"
                    );
                    int orderCancelSelect = in.nextInt();
                    switch (orderCancelSelect) {
                        case 1 :
                            if (order.buggersMenu.isEmpty() && order.iceCreamMenu.isEmpty() && order.coffeeMenu.isEmpty()) {
                                System.out.println("\n진행 중이던 주문이 없습니다.\n");
                            } else {
                                System.out.println(
                                        "\n진행하던 주문이 취소되었습니다.\n"
                                );
                                order.buggersMenu.clear();
                                order.iceCreamMenu.clear();
                                order.coffeeMenu.clear();
                                Thread.sleep(1000);
                            }
                            break;
                        case 2 :
                            System.out.println(
                                    "\n취소되었습니다. 메뉴판으로 돌아가겠습니다.\n"
                            );
                            break;
                    }
                    break;
                case 6 :
                    System.out.println("키오스크를 종료합니다.");
                    kioskRun = false;
                    break;
                default:
                    System.out.println("항목에 없는 번호를 선택하셨습니다.");
            }
        }
    }
}