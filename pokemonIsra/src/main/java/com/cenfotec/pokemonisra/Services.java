package com.cenfotec.pokemonisra;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

@SpringBootApplication
public class PokemonIsraApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonIsraApplication.class, args);
    }

{
    // Get Pokemon Info from the Gym
    //http://ec2-3-18-23-121.us-east-2.compute.amazonaws.com:8080/api/gimnasio/info
    {
        {
            "playerName": "isra",
            "pokemon": {
                "name": "personitaPoke",
                "type": "normal",
                "life": 900,
                "attacks": [
                    {
                        "type": "normal",
                        "power": 100
                    }
                ]
            }
        }
      }

}
{
    @GetMapping("/pokemonIsraApplication")
    public List<Pokemon> getAllPokemon() {
        return http://ec2-3-18-23-121.us-east-2.compute.amazonaws.com:8080/api/gimnasio/info;
    }

    @GetMapping("/pokemonIsraAplication/{id}")
    public ResponseEntity<Pokemon> getPokemon(@PathVariable int id) {
        Pokemon pokemon = getPokemonById(id);
        return pokemon != null ? ResponseEntity.ok(pokemon) : ResponseEntity.notFound().build();
    }
}
{
    //Unirse a la Batalla
    //http://ec2-3-18-23-121.us-east-2.compute.amazonaws.com:8080/api/gimnasio/unirse
    {
        "playerName": "isra",
        "pokemon": {
            "name": "personitaPoke",
            "type": "normal",
            "life": 900,
            "attacks": [
                {
                    "type": "normal",
                    "power": 100
                }
            ]
        }
    }
}

{
    //Iniciar Pokemon.  Parametros Null
    //http://ec2-3-18-23-121.us-east-2.compute.amazonaws.com:8080/api/gimnasio/iniciar
}

{
//Atacar Pokemon:http://ec2-3-18-23-121.us-east-2.compute.amazonaws.com:8080/api/gimnasio/atacar

Private class(Players);
players=string{out.println"attachID"+"targetPlayerName"}
{
    "attackId": 1,
     "sourcePlayerName": "isra",
     "targetPlayerName": "Renato"
    
   }
}
}