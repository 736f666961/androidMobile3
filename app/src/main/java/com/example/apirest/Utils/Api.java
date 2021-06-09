package com.example.apirest.Utils;

public class Api {

    public static final String URL_001 = "http://192.168.8.159:8080/" ; // School Api
    public static final String URL_002 = "http://192.168.1.13:8080/"  ; // Home Api

    public static UserService getUserService() {
        return  Retro.getClient(URL_001).create(UserService.class);
    }
}
