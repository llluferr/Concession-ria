package br.com.fiap;

public class Veiculo{
    //Model BO POJO Entity Resource
    //atributos 
    private String marca;
    private String modelo;
    private String placa;
    private double preco;
    private int ano;
    public Veiculo(String marca, String modelo, String placa, double preco, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.preco = preco;
        this.ano = ano;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo [ano=" + ano + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", preco="
                + preco + "]";
    }
    
    //metodos
    
}
