public class JogoV1{
  public static void main (String [] args){
    //1. construir um objeto Personagem
    Personagem cacador = new Personagem();
    //2. atribuir um nome a ele
    cacador.nome = "John";
    //3. Fazer o personagem caçar
    //aqui é a chamada do método cacar, ou seja, aqui nós colocamos ele em execução
    //call (invoke)
    //colocar em execução
    cacador.cacar();

    System.out.println("Game over...");
  }
}