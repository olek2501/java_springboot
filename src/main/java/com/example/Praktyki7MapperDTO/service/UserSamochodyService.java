package com.example.Praktyki7MapperDTO.service;

import com.example.Praktyki7MapperDTO.entity.Samochod;
import com.example.Praktyki7MapperDTO.entity.Users;
import com.example.Praktyki7MapperDTO.mappers.PomocDTO;
import com.example.Praktyki7MapperDTO.mappers.UserDTO;
import com.example.Praktyki7MapperDTO.repository.UsersRepository;
import com.example.Praktyki7MapperDTO.repository.SamochodRepository;
import org.apache.catalina.User;
//import org.modelmapper.Praktyki7MapperDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
//import java.awt.print.Hurtownia;


@Service
public class UserSamochodyService {

    @Autowired
    private final UsersRepository usersRepository;

    @Autowired
    private final SamochodRepository samochodRepository;

    @Autowired
    private final ModelMapper modelMapper;

    public UserSamochodyService(UsersRepository usersRepository, SamochodRepository samochodRepository, ModelMapper modelMapper) {
        this.usersRepository = usersRepository;
        this.samochodRepository = samochodRepository;
        this.modelMapper = modelMapper;
    }

    public UserDTO getUser(Long userId){
        Users users = this.usersRepository.findById(userId).get();
        Samochod samochod = this.samochodRepository.findById(userId).get();
        UserDTO userDTO = new UserDTO();
        modelMapper.map(users, userDTO);
        modelMapper.map(samochod, userDTO);
        return userDTO;
    };

    public PomocDTO createUser(PomocDTO pomoc){
        Users user = new Users();
        user.setImie(pomoc.getImie());
        user.setEmail(pomoc.getEmail());
        user.setHaslo(pomoc.getHaslo());
        user.setNazwa(pomoc.getNazwa());
        user.setNazwisko(pomoc.getNazwisko());
        usersRepository.save(user);
        Samochod samochod = new Samochod();
        samochod.setCena(pomoc.getCena());
        samochod.setMarka(pomoc.getMarka());
        samochod.setLiczbaSiedzen(pomoc.getLiczbaSiedzen());
        samochodRepository.save(samochod);
        return pomoc;
    }

    public PomocDTO getAdmin(Long id){
        Users users = this.usersRepository.findById(id).get();
        Samochod samochod = this.samochodRepository.findById(id).get();
        PomocDTO pomoc = new PomocDTO();
        modelMapper.map(users, pomoc);
        modelMapper.map(samochod, pomoc);
        return pomoc;
    }



    public Users getUserById(Long id){
        Optional<Users> usersOptional = usersRepository.findById(id);
        if(usersOptional.isPresent()){
            return usersOptional.get();
        }else{
            return null;
        }
    }

    public Samochod getSamochodById(Long id){
        Optional<Samochod> samochodOptional = samochodRepository.findById(id);
        if(samochodOptional.isPresent()){
            return samochodOptional.get();
        }else{
            return null;
        }
    }

    public PomocDTO putAllAdmin(Long id, PomocDTO pomoc){
        Optional<Users> usersOptional = usersRepository.findById(id);
        Optional<Samochod> samochodOptional = samochodRepository.findById(id);
        if(usersOptional.isPresent()&&samochodOptional.isPresent()){
            Users users = usersOptional.get();
            Samochod samochod = samochodOptional.get();
            users.setNazwisko(pomoc.getNazwisko());
            users.setImie(pomoc.getImie());
            users.setNazwa(pomoc.getNazwa());
            users.setHaslo(pomoc.getHaslo());
            users.setEmail(pomoc.getEmail());
            samochod.setMarka(pomoc.getMarka());
            samochod.setCena(pomoc.getCena());
            samochod.setLiczbaSiedzen(pomoc.getLiczbaSiedzen());
            usersRepository.save(users);
            samochodRepository.save(samochod);
            return pomoc;
        }else{
            return null;
        }
    }



    public Users delete(Long id){
        usersRepository.deleteById(id);
        return null;
    }

    public Samochod delete2(Long id){
        samochodRepository.deleteById(id);
        return null;
    }
//
//    public Pracownik putProd(Pracownik hurtownia, Long id){
//        Optional<Pracownik> hurtownia1 = hurtowniaRepository.findById(id);
//        if(hurtownia1.isPresent()){
//            Pracownik hurtownia2 = hurtownia1.get();
//            hurtownia2.setNazwa(hurtownia.getNazwa());
//            hurtownia2.setIlosc(hurtownia.getIlosc());
//            hurtownia2.setCena(hurtownia.getCena());
//            hurtownia2.setFirma(hurtownia.getFirma());
//            return hurtowniaRepository.save(hurtownia2);
//        }else{
//            return null;
//        }
//    }
//
//
//    public Pracownik getProduktById(Long id){
//        Optional<Pracownik> hurtownia = hurtowniaRepository.findById(id);
//        if(hurtownia.isPresent()){
//            return hurtownia.get();
//        }else{
//            return null;
//        }
//    }





}
