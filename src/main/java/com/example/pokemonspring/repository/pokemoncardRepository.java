package com.example.pokemonspring.repository;

import com.example.pokemonspring.DatabaseConnectionManager;
import com.example.pokemonspring.model.PokemonCard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class pokemoncardRepository {


    private Connection conn = DatabaseConnectionManager.getConnection();

    // Get all cards from the database
    public List<PokemonCard> getAllpokemonCards(){

        List<PokemonCard> pokemonCards = new ArrayList<>();

        try {
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM pokemoncards22.pokemon");
            ResultSet resultSet = psts.executeQuery();

            while(resultSet.next()){
                pokemonCards.add(new PokemonCard(
                        resultSet.getInt("pokedex_number"),
                        resultSet.getString("name"),
                        resultSet.getInt("speed"),
                        resultSet.getInt("special_defence"),
                        resultSet.getInt("special_attack"),
                        resultSet.getInt("defence"),
                        resultSet.getInt("attack"),
                        resultSet.getInt("hp"),
                        resultSet.getString("primary_type"),
                        resultSet.getString("secondary_type")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        return pokemonCards;
    }

    public void create(PokemonCard pc)  {

        try {
            PreparedStatement psts = conn.prepareStatement("INSERT INTO pokemoncards22.pokemon (pokedex_number, name, primary_type) VALUES (?,?,?)");
            psts.setString(2,pc.getName());
            psts.setString(3,pc.getPrimary_type());
            psts.setInt(1,pc.getPokedex_number());
            psts.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}






