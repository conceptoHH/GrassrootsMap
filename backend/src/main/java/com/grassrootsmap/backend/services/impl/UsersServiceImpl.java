package com.grassrootsmap.backend.services.impl;

import com.grassrootsmap.backend.DTOs.UserRequestDTO;
import com.grassrootsmap.backend.DTOs.UserResponseDTO;
import com.grassrootsmap.backend.enums.UserRoleEnum;
import com.grassrootsmap.backend.enums.UserStatusEnum;
import com.grassrootsmap.backend.models.*;
import com.grassrootsmap.backend.repositories.*;
import com.grassrootsmap.backend.services.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsersServiceImpl implements UsersService {
    UsersRepository usersRepository;
    UserDanceStyleRepository userDanceStyleRepository;
    GeolocationPointRepository geolocationPointRepository;
    SocialsRepository socialsRepository;
    DanceStyleRepository danceStyleRepository;

    public UsersServiceImpl(DanceStyleRepository danceStyleRepository, SocialsRepository socialsRepository, GeolocationPointRepository geolocationPointRepository, UserDanceStyleRepository userDanceStyleRepository, UsersRepository usersRepository) {
        this.danceStyleRepository = danceStyleRepository;
        this.socialsRepository = socialsRepository;
        this.geolocationPointRepository = geolocationPointRepository;
        this.userDanceStyleRepository = userDanceStyleRepository;
        this.usersRepository = usersRepository;
    }

    @Override
    public UserResponseDTO getSpecificUserByUsername(String username) throws Exception {
        Optional<UserResponseDTO> resp = usersRepository.getUserProfile(username);
        if (resp.isEmpty()) {
            throw new Exception("User not found with username: "+ username);
        }
        return resp.get();
    }

    @Override
    public HttpStatusCode CreateUser(UserRequestDTO request) {
        Users user = new Users(
                UUID.randomUUID(),
                request.getUsername(),
                request.getEmail(),
                request.getPassword(),
                UserRoleEnum.CLIENT,
                UserStatusEnum.AVAILABLE,
                LocalDateTime.now(),
                LocalDateTime.now());

        try {
            usersRepository.save(user);
        } catch (Exception e) {
            throw new RuntimeException("Error saving the user: " + e);
        }

        List<DanceStyle> listDS = danceStyleRepository.findAllById(request.getDance_styles());
        List<UserDanceStyle> listUDS = null;
        for (DanceStyle danceStyle : listDS){
                UserDanceStyle uds = new UserDanceStyle(user, danceStyle);
                listUDS.add(uds);
        }
        try {
            userDanceStyleRepository.saveAll(listUDS);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Socials socials = new Socials(
                UUID.randomUUID(),
                "Instagram",
                request.getUsername_social(),
                request.getLink_social(),
                LocalDateTime.now(),
                LocalDateTime.now(),
                user);

        try {
            socialsRepository.save(socials);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        GeolocationPoint point = new GeolocationPoint(
                UUID.randomUUID(),
                request.getExact_location(),
                request.getPublic_location(),
                Boolean.TRUE,
                user,
                LocalDateTime.now(),
                LocalDateTime.now()
                );

        try {
            geolocationPointRepository.save(point);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return HttpStatus.CREATED;
    }
}
