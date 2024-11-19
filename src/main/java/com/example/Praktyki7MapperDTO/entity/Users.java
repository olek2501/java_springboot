package com.example.Praktyki7MapperDTO.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userId")

    private Long userId;
    private String nazwa;
    private String haslo;
    private String imie;
    private String nazwisko;
    private String email;



//    @ManyToMany(cascade = CascadeType.ALL)
//    Set<Samochod> zamowienia = new HashSet<>();



//    public Pracownik(String name, String firmaPochodzenia, int ilosc, int cena){
//        super();
//        this.nazwa = name;
//        this.firmaPochodzenia = firmaPochodzenia;
//        this.ilosc = ilosc;
//        this.cena = cena;
//    }

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long id) {
        this.userId = id;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getHaslo(){
        return haslo;
    }
    public void setHaslo(String haslo){
        this.haslo = haslo;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
