/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Anabel
 */
public class JwtDto {
    private String token;
    private String bearer = "Bearer";
    private String nombreUsurio;
    private Collection<? extends GrantedAuthority> authorities;
    
    //Constructor

    public JwtDto(String token, String nombreUsurio, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.nombreUsurio = nombreUsurio;
        this.authorities = authorities;
    }
    
    //Getter y Setter

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsurio() {
        return nombreUsurio;
    }

    public void setNombreUsurio(String nombreUsurio) {
        this.nombreUsurio = nombreUsurio;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    
}
