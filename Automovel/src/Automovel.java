public class Automovel {
    private boolean ligado;

    public Automovel() {
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O automóvel foi ligado.");
        } else {
            System.out.println("O automóvel já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O automóvel foi desligado.");
        } else {
            System.out.println("O automóvel já está desligado.");
        }
    }

    public void acelerar() {
        if (ligado) {
            System.out.println("Vrum vrum! O automóvel está acelerando.");
        } else {
            System.out.println("Não é possível acelerar, o automóvel está desligado.");
        }
    }

    public void frear() {
        if (ligado) {
            System.out.println("O automóvel está freando.");
        } else {
            System.out.println("O automóvel já está parado, não é possível frear.");
        }
    }
}
