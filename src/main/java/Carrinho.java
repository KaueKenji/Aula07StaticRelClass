
public class Carrinho {

  private Produto[] produtos;

  public Carrinho(int tamanho) {
    produtos = new Produto[tamanho];
  }

  public void inserir(Produto p, int i) {
    if (i < 0 || i >= produtos.length) {
      System.out.println("Erro");
      return;
    }
    if (p == null) {
      System.out.println("Produto nulo");
      return;
    }
    if (produtos[i] != null){
      System.out.println("Erro! já tem coisa aqui");
      return;
  }
      produtos[i] = p;
    
      
    
  }

  public void remover(int i) {
    if (i < 0 || i >= produtos.length) {
      System.out.println("Erro");
      return;
    }
    produtos[i] = null;
  }

  public void listar() {
    for (int i = 0; i < produtos.length; i++) {
      // O metodo mostrar esta sendo chamado
      // para cada produto indexado por i
      produtos[i].mostrar();
    }
  }

  public double calcularTotal() {
    double soma = 0;
    for (int i = 0; i < produtos.length; i++) {
      // Pego o valor de cada produto indexado
      // Por i e somo.
      soma = soma + produtos[i].valor();
    }
    return soma;
  }

  public double calcularTotalEsc() {
    double soma = 0;
    for (int i = 0; i < produtos.length; i++) {
      // Pego o valor de cada produto indexado
      // Por i e somo.
      if (produtos[i].isEscolar()) {
        soma = soma + produtos[i].valor();
      }
    }
    return soma;
  }

  public double calcularMedia(){
    double soma = 0;
    for (int i = 0; i < produtos.length; i++) {
      // Pego o valor de cada produto indexado
      // Por i e somo.
      soma = soma + produtos[i].valor();
    }
    return soma/produtos.length;
    
  }
  public void buscarNome(String nome){
    for (int i = 0; i < produtos.length; i++) {
      if (produtos[i].nome.equals(nome)){
        produtos[i].mostrar();
      }
    }
  }
}