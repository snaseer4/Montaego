
package com.monetago.exercise.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "IDOrder",
    "IDCustomer",
    "Elements"
})
@Generated("jsonschema2pojo")
public class OrdersT {

    @JsonProperty("IDOrder")
    private String iDOrder;
    @JsonProperty("IDCustomer")
    private String iDCustomer;
    @JsonProperty("Elements")
    private Map<String,OrdersDetail> elements;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrdersT() {
    }

    /**
     * 
     * @param iDCustomer
     * @param iDOrder
     * @param elements
     */
    public OrdersT(String iDOrder, String iDCustomer, Map<String,OrdersDetail> elements) {
        super();
        this.iDOrder = iDOrder;
        this.iDCustomer = iDCustomer;
        this.elements = elements;
    }

    @JsonProperty("IDOrder")
    public String getIDOrder() {
        return iDOrder;
    }

    @JsonProperty("IDOrder")
    public void setIDOrder(String iDOrder) {
        this.iDOrder = iDOrder;
    }

    @JsonProperty("IDCustomer")
    public String getIDCustomer() {
        return iDCustomer;
    }

    @JsonProperty("IDCustomer")
    public void setIDCustomer(String iDCustomer) {
        this.iDCustomer = iDCustomer;
    }

    @JsonProperty("Elements")
    public Map<String,OrdersDetail> getElements() {
        return elements;
    }

    @JsonProperty("Elements")
    public void setElements(Map<String,OrdersDetail> elements) {
        this.elements = elements;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
