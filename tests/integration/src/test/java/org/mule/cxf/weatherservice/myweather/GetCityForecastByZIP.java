/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.cxf.weatherservice.myweather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zip"
})
@XmlRootElement(name = "GetCityForecastByZIP", namespace = "http://ws.cdyne.com/WeatherWS/")
public class GetCityForecastByZIP {

    @XmlElement(name = "ZIP", namespace = "http://ws.cdyne.com/WeatherWS/")
    protected String zip;

    /**
     * Gets the value of the zip property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZIP() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZIP(String value) {
        this.zip = value;
    }

}