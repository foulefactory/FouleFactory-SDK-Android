/*
 * FouleFactoryApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.foulefactory.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ProjectWriterServiceModel 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5100867943085946317L;
    private int idTemplate;
    private String title;
    private String estimatedTimePerTask;
    private int nbSupplierPerTask;
    private int amountWithoutTaxPerTask;
    private boolean automaticValidation;
    private Date maxEndDate;
    private Integer idCertification;
    private String urlNotification;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IdTemplate")
    public int getIdTemplate ( ) { 
        return this.idTemplate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IdTemplate")
    public void setIdTemplate (int value) { 
        this.idTemplate = value;
        notifyObservers(this.idTemplate);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Title")
    public void setTitle (String value) { 
        this.title = value;
        notifyObservers(this.title);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("EstimatedTimePerTask")
    public String getEstimatedTimePerTask ( ) { 
        return this.estimatedTimePerTask;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("EstimatedTimePerTask")
    public void setEstimatedTimePerTask (String value) { 
        this.estimatedTimePerTask = value;
        notifyObservers(this.estimatedTimePerTask);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("NbSupplierPerTask")
    public int getNbSupplierPerTask ( ) { 
        return this.nbSupplierPerTask;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("NbSupplierPerTask")
    public void setNbSupplierPerTask (int value) { 
        this.nbSupplierPerTask = value;
        notifyObservers(this.nbSupplierPerTask);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AmountWithoutTaxPerTask")
    public int getAmountWithoutTaxPerTask ( ) { 
        return this.amountWithoutTaxPerTask;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AmountWithoutTaxPerTask")
    public void setAmountWithoutTaxPerTask (int value) { 
        this.amountWithoutTaxPerTask = value;
        notifyObservers(this.amountWithoutTaxPerTask);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AutomaticValidation")
    public boolean getAutomaticValidation ( ) { 
        return this.automaticValidation;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AutomaticValidation")
    public void setAutomaticValidation (boolean value) { 
        this.automaticValidation = value;
        notifyObservers(this.automaticValidation);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MaxEndDate")
    public Date getMaxEndDate ( ) { 
        return this.maxEndDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MaxEndDate")
    public void setMaxEndDate (Date value) { 
        this.maxEndDate = value;
        notifyObservers(this.maxEndDate);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IdCertification")
    public Integer getIdCertification ( ) { 
        return this.idCertification;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IdCertification")
    public void setIdCertification (Integer value) { 
        this.idCertification = value;
        notifyObservers(this.idCertification);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("UrlNotification")
    public String getUrlNotification ( ) { 
        return this.urlNotification;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("UrlNotification")
    public void setUrlNotification (String value) { 
        this.urlNotification = value;
        notifyObservers(this.urlNotification);
    }
 
}
 