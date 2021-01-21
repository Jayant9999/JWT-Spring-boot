package com.project.auth;

public class ApiResponse<T> {

    private int status;
    private String message;
    private Object result;
    private Object entity;
    public ApiResponse(int status, String message, Object result, Object entity) {
        this.status = status;
        this.message = message;
        this.result = result;
        this.entity = entity;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}