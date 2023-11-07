public class Main {
    public static void main(String[] args) {
        Veiculo moto = new Moto();
        Veiculo carro = new Carro();

        moto.ligar();
        moto.acelerar();

        carro.ligar();
        carro.acelerar();
    }
}