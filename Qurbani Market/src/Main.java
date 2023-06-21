public class Main implements Checks {
    public static void main(String[] args) {
        Store.readStoreFromFile();
        Record.readRecordFromFile();

        System.out.println("------------------------------------");
        System.out.println("<-------   QURBANI  MARKET   ------>");
        System.out.println("------------------------------------\n\n");
        MAIN_MENU:
        while (true) {
            System.out.println("\n1 - Customer");
            System.out.println("2 - Seller");
            System.out.println("0 - Exit");
            String mainMenuOption = Checks.checkedInputThroughStringForMainMenu("0 1 2 ");
            switch (mainMenuOption) {
                case "0":
                    System.exit(0);
                case "1":
                    SIGNING_MENU:
                    while (true) {
                        System.out.println("\n1 - Sign In");
                        System.out.println("2 - Sign Up");
                        System.out.println("0 - Move Back");
                        String signingMenuOption = Checks.checkedInputThroughString("0 1 2");
                        switch (signingMenuOption) {
                            case "0":
                                continue MAIN_MENU;
                            case "1":
                                Customer customer = Customer.signIn();
                                if (customer != null) customer.PerformFunctionality();
                                continue SIGNING_MENU;
                            case "2":
                                Customer.signUp();
                        }
                    }
                case "2":
                    SIGNING_MENU:
                    while (true) {
                        System.out.println("\n1 - Sign In");
                        System.out.println("2 - Sign Up");
                        System.out.println("0 - Move Back");
                        String signingMenuOption = Checks.checkedInputThroughString("0 1 2");
                        switch (signingMenuOption) {
                            case "0":
                                continue MAIN_MENU;
                            case "1":
                                Seller seller = Seller.signIn();
                                if (seller != null) seller.PerformFunctionality();
                                continue SIGNING_MENU;
                            case "2":
                                Seller.signUp();
                        }
                    }
            }
        }
    }
}