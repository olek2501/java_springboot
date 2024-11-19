package com.example.Praktyki7MapperDTO.mappers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String nazwa;
    private String email;
    private String marka;

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
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
}
