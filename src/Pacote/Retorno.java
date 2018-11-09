package Pacote;

public class Retorno {

    int p;
    int v;
    float pv;

    public Retorno(int peso, int valor) {
        this.p = peso;
        this.v = valor;
        this.pv = peso/valor;
    }

    public int getPeso() {
        return p;
    }

    public void setPeso(int peso) {
        this.p = peso;
    }

    public int getValor() {
        return v;
    }

    public void setValor(int valor) {
        this.v = valor;
    }

    public float getPesoValor() {
        return pv;
    }

    public void setPesoValor(float pesoValor) {
        this.pv = pesoValor;
    }

    @Override
    public String toString() {
        return "Retornos [" +
                "Peso = " + p + 
                " Valor = " + v + 
                " ]";
    }
}
