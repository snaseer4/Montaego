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
"title",
"quantity"
})
@Generated("jsonschema2pojo")
public class OrdersDetail {

@JsonProperty("title")
private String title;
@JsonProperty("quantity")
private String quantity;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public OrdersDetail() {
}

/**
*
* @param quantity
* @param title
*/
public OrdersDetail(String title, String quantity) {
super();
this.title = title;
this.quantity = quantity;
}

@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("quantity")
public String getQuantity() {
return quantity;
}

@JsonProperty("quantity")
public void setQuantity(String quantity) {
this.quantity = quantity;
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