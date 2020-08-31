class TesteSimples {

  public void executar () {

    Filme filme = new Filme();
    filme.setTitulo("Lucas O formigueiro");
    filme.setAno(2001);
    filme.setTipo (7);

    System.out.println("Titulo = " + filme.getTitulo());
    System.out.println("Ano = " + filme.getAno());
    System.out.println("tipo = " + filme.getTipo());
  }

}