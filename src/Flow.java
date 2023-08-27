public class Flow {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();

        } catch (Exception ex) {
            System.out.println("Exeption " + ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");

        throw new MineException("erro mine.");

//        ArithmeticException exception = new ArithmeticException("ERROR.");
//        throw exception;

//        System.out.println("Fim do metodo2");
    }
}
