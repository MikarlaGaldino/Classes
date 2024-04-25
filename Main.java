// Classe Main
public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(4);
        meuCarro.ligar();
        meuCarro.acelerar();

        Moto minhaMoto = new Moto(true);
        minhaMoto.ligar();
        minhaMoto.acelerar();

        meuCarro.frear();
        minhaMoto.frear();

        meuCarro.desligar();
        minhaMoto.desligar();

        meuCarro.abrirPortas();
        minhaMoto.colocarCapacete();
    }
}
