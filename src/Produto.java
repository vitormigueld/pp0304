public class Produto implements ItemLoja{
    private String nome;
    private double preco;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println("<" + prefixo +"> Produto: " + nome +" | Preço: R$ " + preco);
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
