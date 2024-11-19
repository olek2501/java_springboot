package com.example.Praktyki7MapperDTO.controller;

import com.example.Praktyki7MapperDTO.entity.Samochod;
import com.example.Praktyki7MapperDTO.entity.Users;
import com.example.Praktyki7MapperDTO.mappers.PomocDTO;
import com.example.Praktyki7MapperDTO.mappers.UserDTO;
import com.example.Praktyki7MapperDTO.service.UserSamochodyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/Praktyki7")
public class UserSamochodyController {

    private final UserSamochodyService userSamochodyService;
    private Object zmienna;

    public UserSamochodyController(UserSamochodyService userSamochodyService){
        this.userSamochodyService = userSamochodyService;
    }

//    @GetMapping("/oba{id}")
//    public Object getById3(@PathVariable Long id){
//        zmienna = userSamochodyService.getUserById(id);
//        zmienna = zmienna+" "+userSamochodyService.getSamochodById(id);
//        return zmienna;
//    }

    @GetMapping("/user{id}")
    public UserDTO getUserId(@PathVariable Long id){
        return userSamochodyService.getUser(id);
    }

    @GetMapping("/fulladmin{id}")
    public PomocDTO getAllId(@PathVariable Long id){
        return userSamochodyService.getAdmin(id);
    }

    @PostMapping("/fulladminInsert")
    public PomocDTO insertAll(@RequestBody PomocDTO pomoc){
        return userSamochodyService.createUser(pomoc);
    }



//    @GetMapping("/adminuser{id}")
//    public Users getUserAdmin(@PathVariable Long id){
//        return userSamochodyService.getUserById(id);
//    }

//    @GetMapping("/adminsamochod{id}")
//    public Samochod getSamochodAdmin(@PathVariable Long id){
//        return userSamochodyService.getSamochodById(id);
//    }

//    @PostMapping("/stworzUser")
//    public ResponseEntity<Users> stworzUser(@RequestBody Users users){
//        Users userCreated = this.userSamochodyService.createUser(users);
//        return new ResponseEntity<Users>(userCreated, HttpStatus.CREATED);
//    }












//    @GetMapping("/{id}")
//    public Pracownik getById(@PathVariable Long id){
//        return hurtowniaService.getProduktById(id);
//    }
//
    @DeleteMapping("/{id}")
    public Users deleteProdukt(@PathVariable Long id){
        userSamochodyService.delete(id);
        userSamochodyService.delete2(id);
        return null;
    }

    @PutMapping("/{id}")
    public PomocDTO putAll(@RequestBody PomocDTO pomoc, @PathVariable Long id){
        return userSamochodyService.putAllAdmin(id, pomoc);
    }
//
//    @PutMapping("/{id}")
//    public Pracownik putProdukt(@RequestBody Pracownik hurtownia, @PathVariable Long id){
//        return hurtowniaService.putProd(hurtownia, id);
//    }
//
//    @PostMapping("/dodaj")
//    public Pracownik createHurtownia(@RequestBody Pracownik hurtownia) throws Exception {
//        return hurtowniaService.saveHurtownia(hurtownia);
//    }


}
