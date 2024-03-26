public class Main {

  public static void main(String[] args) {
    Produto p1 = new Produto("Livro 1", Tipo.ESCOLAR, 60);
    Produto p2 = new Produto("Livro 2", Tipo.ESCOLAR, 70);
    Produto p3 = new Produto("Caneta", Tipo.ESCRITÓRIO, 20);
    Produto p4 = new Produto("Pen drive", Tipo.TECNOLOGIA, 90);
    Produto p5 = new Produto("Disquete 3/4", Tipo.TECNOLOGIA, 30);
    Carrinho c = new Carrinho(4);

    c.inserir(p1, 2);
    c.inserir(p2, 0);
    c.inserir(p3, 1);
    c.inserir(p4, 3);
    c.inserir(p5, 2);
    c.listar();
    System.out.println("Total: " + c.calcularTotal());
    System.out.println("Média: " + c.calcularMedia());
    System.out.println("Total escolar: " + c.calcularTotalEsc());
    
  }

}
