package com.TestFinal1.demo.controller;
import org.springframework.web.server.ResponseStatusException;

import com.TestFinal1.demo.entity.BunlungEntity;
import com.TestFinal1.demo.response.ResponseCode;
import com.TestFinal1.demo.response.ResponseData;
import com.TestFinal1.demo.service.BunlungService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class BunlungController {
    @Autowired
    private BunlungService bunlungService;

    @PostMapping("/gentoken")
    public ResponseEntity<ResponseCode> addUser(@RequestBody BunlungEntity bunlungEntity){
        try{
            bunlungService.saveUser(bunlungEntity);
            String userId = bunlungEntity.getUserId();
            String tokenId = bunlungEntity.getTokenId();
            ResponseData responseData = new ResponseData(userId,tokenId);
            ResponseCode responseCode = new ResponseCode("I07000","ทำการเรียบร้อย",responseData);
            return ResponseEntity.ok(responseCode);
        }catch (ResponseStatusException e){
            String userId = bunlungEntity.getUserId();
            String tokenId = bunlungEntity.getTokenId();
            ResponseData responseData = new ResponseData(userId,tokenId);

            ResponseCode error = new ResponseCode(
                    "E000001",
                    e.getMessage(),
                    responseData
            );
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }
        catch (Exception e){
            ResponseCode error = new ResponseCode(
                    "HTTP CODE 500",
                    "ไม่พบฐานข้อมูล หรือ Database connect ไม่ได้",
                    bunlungEntity
            );
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
        }

    }
}
