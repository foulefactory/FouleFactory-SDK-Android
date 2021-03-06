/*
 * FouleFactoryApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/16/2016
 */
package com.foulefactory.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AccountWriterServiceModel 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5743706207221275814L;
    private int idGender;
    private String firstName;
    private String name;
    private String email;
    private String phone;
    private Date birthday;
    private String address1;
    private String city;
    private String postalCode;
    private String countryCode;
    private String nationality;
    private boolean optin;
    private String company;
    private String address2;
    private String billAddress1;
    private String billAddress2;
    private String billCity;
    private String billPostalCode;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IdGender")
    public int getIdGender ( ) { 
        return this.idGender;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IdGender")
    public void setIdGender (int value) { 
        this.idGender = value;
        notifyObservers(this.idGender);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("FirstName")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("FirstName")
    public void setFirstName (String value) { 
        this.firstName = value;
        notifyObservers(this.firstName);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Name")
    public void setName (String value) { 
        this.name = value;
        notifyObservers(this.name);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Email")
    public void setEmail (String value) { 
        this.email = value;
        notifyObservers(this.email);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Phone")
    public String getPhone ( ) { 
        return this.phone;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Phone")
    public void setPhone (String value) { 
        this.phone = value;
        notifyObservers(this.phone);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Birthday")
    public Date getBirthday ( ) { 
        return this.birthday;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Birthday")
    public void setBirthday (Date value) { 
        this.birthday = value;
        notifyObservers(this.birthday);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Address1")
    public String getAddress1 ( ) { 
        return this.address1;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Address1")
    public void setAddress1 (String value) { 
        this.address1 = value;
        notifyObservers(this.address1);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("City")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("City")
    public void setCity (String value) { 
        this.city = value;
        notifyObservers(this.city);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("PostalCode")
    public String getPostalCode ( ) { 
        return this.postalCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("PostalCode")
    public void setPostalCode (String value) { 
        this.postalCode = value;
        notifyObservers(this.postalCode);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CountryCode")
    public String getCountryCode ( ) { 
        return this.countryCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CountryCode")
    public void setCountryCode (String value) { 
        this.countryCode = value;
        notifyObservers(this.countryCode);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Nationality")
    public String getNationality ( ) { 
        return this.nationality;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Nationality")
    public void setNationality (String value) { 
        this.nationality = value;
        notifyObservers(this.nationality);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Optin")
    public boolean getOptin ( ) { 
        return this.optin;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Optin")
    public void setOptin (boolean value) { 
        this.optin = value;
        notifyObservers(this.optin);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Company")
    public String getCompany ( ) { 
        return this.company;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Company")
    public void setCompany (String value) { 
        this.company = value;
        notifyObservers(this.company);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Address2")
    public String getAddress2 ( ) { 
        return this.address2;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Address2")
    public void setAddress2 (String value) { 
        this.address2 = value;
        notifyObservers(this.address2);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BillAddress1")
    public String getBillAddress1 ( ) { 
        return this.billAddress1;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BillAddress1")
    public void setBillAddress1 (String value) { 
        this.billAddress1 = value;
        notifyObservers(this.billAddress1);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BillAddress2")
    public String getBillAddress2 ( ) { 
        return this.billAddress2;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BillAddress2")
    public void setBillAddress2 (String value) { 
        this.billAddress2 = value;
        notifyObservers(this.billAddress2);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BillCity")
    public String getBillCity ( ) { 
        return this.billCity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BillCity")
    public void setBillCity (String value) { 
        this.billCity = value;
        notifyObservers(this.billCity);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BillPostalCode")
    public String getBillPostalCode ( ) { 
        return this.billPostalCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BillPostalCode")
    public void setBillPostalCode (String value) { 
        this.billPostalCode = value;
        notifyObservers(this.billPostalCode);
    }
 
}
 