class Main {
  public static void main(String[] args) {
    int vidaMeuPokemon;
    int vidaOutroPokemon;

    // Instanciar um novo objeto
    Pokemon meuPokemon = new Pokemon("Charmander", "Fogo", 10);
    Pokemon outroPokemon = new Pokemon("Squirtle", "Agua", 50);

    meuPokemon.imprimiPokemon();
    outroPokemon.imprimiPokemon();

    vidaMeuPokemon = meuPokemon.getVida();
    vidaOutroPokemon = outroPokemon.getVida();

    if (vidaMeuPokemon > vidaOutroPokemon) {
      System.out.println("Eu ganhei");
    } else {
      System.out.println("Eu perdi");
    }
  }
}