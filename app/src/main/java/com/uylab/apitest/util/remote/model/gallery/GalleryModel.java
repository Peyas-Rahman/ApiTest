
package com.uylab.apitest.util.remote.model.gallery;

import com.example.Datum;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GalleryModel {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("messages")
    @Expose
    private List<Object> messages = null;
    @SerializedName("data")
    @Expose
    private List<com.example.Datum> data = null;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Object> getMessages() {
        return messages;
    }

    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GalleryModel{" +
                "code=" + code +
                ", messages=" + messages +
                ", data=" + data +
                '}';
    }
}
