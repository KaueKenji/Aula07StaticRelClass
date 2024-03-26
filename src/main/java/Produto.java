public class Produto{

  String nome;
  double valor;
  Tipo tipo;
  
public Produto(String nome, Tipo tip, double val) {
  this.nome = nome;
  this.tipo = tip;
  this.valor = val;
}
  
  public boolean isEscolar() {
    return tipo == Tipo.ESCOLAR;
  }

  public void mostrar() {
    System.out.println("Nome: " + nome);
    System.out.println("Tipo: " + tipo);
    System.out.println("Valor: " + valor);
  }

  public double valor() {
    return valor;
  }


}