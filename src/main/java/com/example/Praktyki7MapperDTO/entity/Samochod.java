package com.example.Praktyki7MapperDTO.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "samochod")
public class Samochod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="samochodId")

    private Long samochodId;
    private String marka;
    private Integer cena;
    private Integer liczbaSiedzen;



//    @ManyToMany(mappedBy = "zamowienia")
//    private Set<Klienci> klienci = new HashSet<>();




    // Gettery i Settery:
    public Long getSamochodId(){
        return samochodId;
    }

    public void setSamochodId(Long id){
        this.samochodId = id;
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
