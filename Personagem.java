public class Personagem{
  String nome;
  int energia;
  int fome;
  int sono;

  //um método sempre tem, pelo menos, 4 partes
  //tipo de retorno
  //nome
  //lista de parâmetros
  //corpo
  //isso é a definição do método cacar
  //aqui, nós dissemos que ele existe
  void cacar(){
    System.out.printf("%s esta cacando...%n", nome);  
  }
}