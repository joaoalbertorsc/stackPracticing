public class AccountTestCheckedException {

    public static void main(String[] args) {

        Account c = new Account();
        try {
            c.deposit();
        } catch (Exception ex) {
            System.out.println("Treatment.....");
        }

    }
}
