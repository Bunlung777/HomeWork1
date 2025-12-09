package com.TestFinal1.demo.service;

import com.TestFinal1.demo.entity.BunlungEntity;
import com.TestFinal1.demo.repository.BunlungRepository;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import org.apache.catalina.User;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.Date;
import java.sql.Timestamp;

@Service
public class BunlungService {
    @Autowired
    private BunlungRepository bunlungRepository;

    public BunlungEntity saveUser(BunlungEntity bunlungEntity){
        if (bunlungEntity.getSsoType() == null || bunlungEntity.getSsoType().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ไม่มีข้อมูลSsoType");
        }
        if (bunlungEntity.getSystemId() == null || bunlungEntity.getSystemId().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลSystemId");
        }
        if (bunlungEntity.getSystemName() == null || bunlungEntity.getSystemName().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลSystemName");
        }
        if (bunlungEntity.getSystemTransactions() == null ||  bunlungEntity.getSystemTransactions().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลSystemTransactions");
        }
        if (bunlungEntity.getSystemPrivileges() == null || bunlungEntity.getSystemPrivileges().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลPrivileges");
        }
        if (bunlungEntity.getSystemUserGroup() == null || bunlungEntity.getSystemUserGroup().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลSystemUserGroup");
        }
        if (bunlungEntity.getSystemLocationGroup() == null || bunlungEntity.getSystemLocationGroup().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลSystemLocationGroup");
        }
        if (bunlungEntity.getUserId() == null || bunlungEntity.getUserId().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลUserId");
        }
        if (bunlungEntity.getUserFullName() == null || bunlungEntity.getUserFullName().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลUserFullName");
        }
        if (bunlungEntity.getUserOfficeCode() == null || bunlungEntity.getUserOfficeCode().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลUserOfficeCode");
        }
        if (bunlungEntity.getClientLocation() == null || bunlungEntity.getClientLocation().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลClientLocation");
        }
        if (bunlungEntity.getLocationMachineNumber() == null || bunlungEntity.getLocationMachineNumber().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลLocationMachineNumber");
        }
        if (bunlungEntity.getTokenId() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลTokenId");
        }

        if(bunlungEntity.getRequestDate() == null){
            bunlungEntity.setRequestDate(new Timestamp(System.currentTimeMillis()));
            }
        return bunlungRepository.save(bunlungEntity);


    }
}
