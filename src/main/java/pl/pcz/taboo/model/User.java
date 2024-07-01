package pl.pcz.taboo.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private int points;
    private int gamesPlayed;
    private int wins;
    private int losses;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
