package com.TestFinal1.demo.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "sso_user_test",catalog = "postgres")
public class BunlungEntity {
    @Id
    @Column(name = "request_date")
    private Timestamp requestDate;

    @Column(name = "ssotype")
    private String ssoType;

    @Column(name = "systemid")
    private String systemId;

    @Column(name = "systemname")
    private String systemName;

    @Column(name = "systemtransactions")
    private String systemTransactions;

    @Column(name = "systemprivileges")
    private String systemPrivileges;

    @Column(name = "systemusergroup")
    private String systemUserGroup;

    @Column(name = "systemlocationgroup")
    private String systemLocationGroup;

    @Column(name = "userid")
    private String userId;

    @Column(name = "userfullname")
    private String userFullName;

    @Column(name = "userrdofficecode")
    private String userOfficeCode;

    @Column(name = "clientlocation")
    private String clientLocation;

    @Column(name = "locationmachinenumber")
    private String locationMachineNumber;

    @Column(name = "tokenid")
    private String tokenId;

    public BunlungEntity(Timestamp requestDate, String ssoType, String systemId, String systemName, String systemTransactions, String systemPrivileges, String systemUserGroup, String systemLocationGroup, String userId, String userFullName, String userOfficeCode, String clientLocation, String locationMachineNumber, String tokenId) {
        this.requestDate = requestDate;
        this.ssoType = ssoType;
        this.systemId = systemId;
        this.systemName = systemName;
        this.systemTransactions = systemTransactions;
        this.systemPrivileges = systemPrivileges;
        this.systemUserGroup = systemUserGroup;
        this.systemLocationGroup = systemLocationGroup;
        this.userId = userId;
        this.userFullName = userFullName;
        this.userOfficeCode = userOfficeCode;
        this.clientLocation = clientLocation;
        this.locationMachineNumber = locationMachineNumber;
        this.tokenId = tokenId;
    }

    public BunlungEntity() {
        super();
    }

    public Timestamp getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Timestamp requestDate) {
        this.requestDate = requestDate;
    }

    public String getSsoType() {
        return ssoType;
    }

    public void setSsoType(String ssoType) {
        this.ssoType = ssoType;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemTransactions() {
        return systemTransactions;
    }

    public void setSystemTransactions(String systemTransactions) {
        this.systemTransactions = systemTransactions;
    }

    public String getSystemPrivileges() {
        return systemPrivileges;
    }

    public void setSystemPrivileges(String systemPrivileges) {
        this.systemPrivileges = systemPrivileges;
    }

    public String getSystemUserGroup() {
        return systemUserGroup;
    }

    public void setSystemUserGroup(String systemUserGroup) {
        this.systemUserGroup = systemUserGroup;
    }

    public String getSystemLocationGroup() {
        return systemLocationGroup;
    }

    public void setSystemLocationGroup(String systemLocationGroup) {
        this.systemLocationGroup = systemLocationGroup;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserOfficeCode() {
        return userOfficeCode;
    }

    public void setUserOfficeCode(String userOfficeCode) {
        this.userOfficeCode = userOfficeCode;
    }

    public String getClientLocation() {
        return clientLocation;
    }

    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

    public String getLocationMachineNumber() {
        return locationMachineNumber;
    }

    public void setLocationMachineNumber(String locationMachineNumber) {
        this.locationMachineNumber = locationMachineNumber;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
}

