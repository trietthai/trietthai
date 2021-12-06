/* Create an abstract class that only implements createPokemon 
and pokemonInfo(Pokemon pokemon) from the PokemonInterface. */

public abstract class AbstractPokemon implements PokemonInterface {
    AbstractPokemon(){}
    @Override
    public String pokemonInfo(Pokemon pokemon) {
        return "Name: "+ pokemon.getName()+" Type: "+pokemon.getType()+" Health: "+pokemon.getHealth();
    }
    @Override
    public Pokemon createPokemon(String name, int health, String type)
    {
        Pokemon pokemon = new Pokemon(name, health, type);
        return pokemon;

    }
    
    
}
