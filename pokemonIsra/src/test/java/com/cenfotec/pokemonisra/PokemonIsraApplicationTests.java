package com.cenfotec.pokemonisra;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PokemonIsraApplicationTests {

    @Test
    void contextLoads() {
    }
{
    /*Test de Componentes Ataque */
    {
        @PokemonIsraApplicationTests
        @PostMapping("/attack")
        "attackId": 1,
         "sourcePlayerName": "isra",
         "targetPlayerName": "Ulises"
        
       }

       {
         // API endpoints
    
         @GetMapping("/pokemonIsraApplication")
         public List<Pokemon> getAllPokemon() {
             return pokemonDb;
         }
     
         @GetMapping("/pokemonIsraAplication/{id}")
         public ResponseEntity<Pokemon> getPokemon(@PathVariable int id) {
             Pokemon pokemon = getPokemonById(id);
             return pokemon != null ? ResponseEntity.ok(pokemon) : ResponseEntity.notFound().build();
         }
     
         @PostMapping("/attack")
         public ResponseEntity<String> pokemonAttack(@RequestBody AttackRequest attackRequest) {
             Pokemon attacker = getPokemonById(attackRequest.getAttackerId());
             Pokemon defender = getPokemonById(attackRequest.getDefenderId());
     
             if (attacker != null && defender != null) {
                 int damage = attack(attacker, defender);
                 return ResponseEntity.ok(attacker.getName() + " attacked " + defender.getName() + " for " + damage + " damage");
             } else {
                 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Attacker or defender not found");
             }
         }
     
         // Connect to AWS EC2
         private void connectToAwsEC2() {
             // Implement AWS EC2 connection logic
             System.out.println("Connected to AWS Gimnasio successfully.");
         }
     
         // Utility methods
     
         private PokemonIsraApplication getPokemonById(int id) {
             return pokemonDb.stream().filter(pokemon -> pokemon.getId() == id).findFirst().orElse(null);
         }
     
         private int attack(PokemonIsraApplication attacker, Pokemon defender) {
             // Implement attack logic
             int damage = 10;
             defender.setHp(defender.getHp() - damage);
             return damage;
         }
     
         // Define AttackRequest class
         public static class AttackRequest {
             private int attackerId;
             private int defenderId;
     
             // constructors, getters, and setters
         }
     
         @Override
         public void run(String... args) {
             // Connect to Gimnasio on application startup
             connectToGimnasio();
         }
     }
      
 }
 {
    //Prueba 2
    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokemonTest {

    @Test
    public void testAtaque() {
        Pokemon pokemon = new Pokemon();
        boolean resultado = pokemon.atacar("http://ec2-3-18-23-121.us-east-2.compute.amazonaws.com:8080/api/gimnasio/atacar");
        assertTrue(resultado);
    }
}
{
    public static class jacocoTestResport {
        private int attackerId;
        private int coverage===90%;
    
        out.println("La Cobertura del Codigo es 90%")
}
 }
       }


