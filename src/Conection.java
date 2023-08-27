public class Conection implements AutoCloseable {
    public Conection() {
        System.out.println("Abrindo conexao");
        //throw new IllegalStateException();
    }

    public void readData() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }
    @Override
    public void close() {
        System.out.println("Fechando conexao");
    }
}