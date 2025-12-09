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
        if (bunlungEntity.getSsoType() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ไม่มีข้อมูลSsoType");
        }
        if (bunlungEntity.getSystemId() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลSystemId");
        }
        if (bunlungEntity.getSystemName() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลSystemName");
        }
        if (bunlungEntity.getSystemTransactions() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลSystemTransactions");
        }
        if (bunlungEntity.getSystemPrivileges() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลPrivileges");
        }
        if (bunlungEntity.getSystemUserGroup() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลSystemUserGroup");
        }
        if (bunlungEntity.getSystemLocationGroup() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลSystemLocationGroup");
        }
        if (bunlungEntity.getUserId() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลUserId");
        }
        if (bunlungEntity.getUserFullName() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลUserFullName");
        }
        if (bunlungEntity.getUserOfficeCode() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลUserOfficeCode");
        }
        if (bunlungEntity.getClientLocation() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"ไม่มีข้อมูลClientLocation");
        }
        if (bunlungEntity.getLocationMachineNumber() == null) {
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
