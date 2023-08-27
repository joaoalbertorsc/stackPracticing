public class TestConection {
    public static void main(String[] args) {

        try (Conection conection = new Conection()) {
            conection.readData();
        } catch (IllegalStateException exception){
            System.out.println("Deu erro na conexao");
        }



        // ................................

//        Conection conection = null;
//        try {
//            conection = new Conection();
//            conection.readData();
//        } catch (IllegalStateException exception){
//            System.out.println("Deu erro na conexao");
//        } finally {
//            System.out.println("finally");
//            if (conection != null) {
//                conection.close();
//            }
//        }
    }
}
