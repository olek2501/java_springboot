package com.example.Praktyki7MapperDTO.mappers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class PomocDTO {
    private String marka;
    private Integer cena;
    private Integer liczbaSiedzen;
    private String nazwa;
    private String haslo;
    private String imie;
    private String nazwisko;
    private String email;

    // GETTERY I SETTERY:

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
    public String getMarka(){
        return marka;
    }

    public void setMarka(String marka){
        this.marka = marka;
    }

    public Integer getCena(){
        return cena;
    }

    public void setCena(Integer cena){
        this.cena = cena;
    }
    public Integer getLiczbaSiedzen(){
        return liczbaSiedzen;
    }

    public void setLiczbaSiedzen(Integer liczbaSiedzen){
        this.liczbaSiedzen = liczbaSiedzen;
    }
}
