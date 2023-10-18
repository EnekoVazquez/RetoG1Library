/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Eneko.
 */
public class User implements Serializable {

    private String email;
    private String password;
    private String nombre;
    private LocalDate createDate;
    private LocalDate writeDate;
    private Boolean activo;
    private String compania;
    private UserType type;
    private int telefono;
    private int codigoPostal;
    private String Direccion;

    public User() {
    }

    public User(String email, String password, String nombre, LocalDate createDate, LocalDate writeDate, Boolean activo, String compania, UserType type, int telefono, int codigoPostal, String Direccion) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.createDate = createDate;
        this.writeDate = writeDate;
        this.activo = activo;
        this.compania = compania;
        this.type = type;
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(LocalDate writeDate) {
        this.writeDate = writeDate;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "User{" + "email=" + email + ", password=" + password + ", nombre=" + nombre + ", createDate=" + createDate + ", writeDate=" + writeDate + ", activo=" + activo + ", compania=" + compania + ", type=" + type + ", telefono=" + telefono + ", codigoPostal=" + codigoPostal + ", Direccion=" + Direccion + '}';
    }

}
